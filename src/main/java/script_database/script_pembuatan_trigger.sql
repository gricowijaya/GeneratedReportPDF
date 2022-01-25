-- membuat trigger penambahan_histori barang agar otomatis terupdate 
DROP TRIGGER IF EXISTS penambahan_histori;
DELIMITER $$

CREATE TRIGGER penambahan_histori BEFORE UPDATE 
on tb_barang FOR EACH ROW
BEGIN
    INSERT INTO tb_histori_pendataan VALUES

END $$

DELIMITER ; 

UPDATE tb_barang SET stok_masuk_display = 4, SET stok_gudang = ((SELECT stok_gudang FROM tb_barang WHERE nama_barang = Malboro) - 4) WHERE nama_barang = Malboro 
