INSERT INTO tb_barang(nama_barang, kode_satuan, kode_kategori) VALUES (? , ()? , ?);

INSERT INTO tb_satuan VALUES 
(NULL, "pcs"),
(NULL, "pack"),
(NULL, "gram"),
(NULL, "lusin"),
(NULL, "RIM"),
(NULL, "pasang");

SELECT * FROM tb_satuan;
SELECT * FROM tb_kategori_barang;

INSERT INTO tb_kategori VALUES 
(NULL, "Makanan", NULL),
(NULL, "Minuman"),
(NULL, "Buah"),
(NULL, "Buku");

INSERT INTO tb_kategori

SELECT 
tb_barang.nama_barang, 
tb_stok.stok_awal, 
tb_stok.stok_awal, 
tb_stok.stok_awal, 
tb_stok.stok_awal, 
tb_stok.stok_awal,



