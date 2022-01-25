-- berhubungan dengan pegawai, stok, histori_pendataan
CREATE TABLE tb_barang (
    id_barang INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    nama_barang VARCHAR(20) NOT NULL,
    kode_satuan INT,
    kode_kategori INT,
    id_pegawai VARCHAR(30), 
    status VARCHAR(15) DEFAULT "ACTIVE",
    FOREIGN KEY (id_pegawai) REFERENCES tb_pegawai(id_pegawai),
    FOREIGN KEY (kode_satuan) REFERENCES tb_satuan(kode_satuan),
    FOREIGN KEY (kode_kategori) REFERENCES tb_kategori(kode_kategori)
);

CREATE TABLE tb_pegawai ( 
    id_pegawai VARCHAR(30) PRIMARY KEY NOT NULL,  
    password VARCHAR(20),
    nama_depan VARCHAR(12) NOT NULL,
    nama_belakang VARCHAR(12) NOT NULL, 
    jabatan INT, 
    nomor_telp VARCHAR(13),  
    status VARCHAR(15) DEFAULT "ACTIVE"
);

-- CREATE TABLE tb_jabatan ( 
--     id_jabatan INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
--     jabatan VARCHAR(30)
--     status VARCHAR(15) DEFAULT "ACTIVE"
-- );

CREATE TABLE tb_stok ( 
    id_data_stok INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_barang INT,
    stok_awal INT DEFAULT 0,
    in_stok INT DEFAULT 0, 
    out_stok INT DEFAULT 0, 
    sisa_stok INT DEFAULT 0, 
    stok_gudang INT DEFAULT 0,
    tanggal TIMESTAMP,
    FOREIGN KEY (id_barang) REFERENCES tb_barang(id_barang)
);

ALTER TABLE tb_barang ADD COLUMN stok_display INT DEFAULT 0 ;
ALTER TABLE tb_barang ADD COLUMN stok_masuk_display INT DEFAULT 0; 
ALTER TABLE tb_barang ADD COLUMN stok_gudang INT DEFAULT 0 AFTER stok_masuk_display; 
ALTER TABLE tb_barang ADD COLUMN terjual INT DEFAULT 0; 


CREATE TABLE tb_histori_pendataan( 
    id_histori INT PRIMARY KEY NOT NULL AUTO_INCREMENT,  
    id_barang INT, 
    stok_display INT DEFAULT 0,
    stok_masuk_display INT DEFAULT 0, 
    stok_gudang INT DEFAULT 0,
    stok_masuk_gudang INT DEFAULT 0,
    tanggal TIMESTAMP DEFAULT NOW(),
    FOREIGN KEY (id_barang) REFERENCES tb_barang(id_barang),
);

CREATE TABLE tb_satuan(
    kode_satuan INT PRIMARY KEY NOT NULL AUTO_INCREMENT, 
    satuan VARCHAR(12),
    status VARCHAR(15) DEFAULT "ACTIVE"
);


CREATE TABLE tb_kategori_barang (
    kode_kategori INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    kategori VARCHAR(12),
    status VARCHAR(15) DEFAULT "ACTIVE"
);
