/* Class Hasil Report 
 * Merupakan class yang digunakan untu
            
   melakukan generasi pada dokumen 
 * yang berbentuk pdf, Hasil teHasilKembaliQueryebut terdapat bebarapa kolom tabel 
 * sehingga dapat digunakan untuk membuat laporan stok setelah penjualan
 *
 * Gede Rico Wijaya - 2005551091 PBO E
*/

// HasilReport disimpan pada package create_pdf;
package create_pdf;

// package itextpdf
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.Document;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Paragraph;

// package connect_to_database
import connect_to_database.KoneksiDatabase;

// package JDK
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class HasilReport {
    // method yang digunakan untuk membuat tabel pada tabel hasil report
    // method ini mengambil satu parameter yaitu Object Document yang 
    // dimana nantinya akan dinamakan dengan nama tabel
    public static void membuat_tabel(Table table, Document document) { 
        // memberikan judul pada tabel-tabel yang akan digunakan
        table.addCell("Nama Barang").setBold();
        table.addCell("Stok Display").setBold();
        table.addCell("Stok Masuk").setBold();
        table.addCell("Stok Gudang").setBold();
    }

    public static void generate_report() {
        // String untuk file dari nama
        try {
            // String untuk nama dari file, bisa digunakan dengan directory tetapi
            // karena keterbatasan sistem maka hanya diperlukan nama dari Judul pdf saja
            // Konfigurasi nama_file
            String nama_file = "HasilReport.pdf";
            OutputStream outputStream = new FileOutputStream(nama_file);

            // dokumen dibuat pada kode dibawah ini 
            PdfWriter writer = new PdfWriter(nama_file);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);
            
            // menambahkan koneksi dari database
            KoneksiDatabase koneksi = new KoneksiDatabase();
            Connection database_koneksi = koneksi.getConnection();
            PreparedStatement SQLStatement = null;
            ResultSet HasilExecuteQuery = null;

            // Query yang digunakan untuk mengambil data dari database db_stok_barang
            String query_Pengambilan_data = "SELECT nama_barang, stok_display, stok_masuk_display, stok_gudang FROM tb_barang";            
            SQLStatement = database_koneksi.prepareStatement(query_Pengambilan_data);
            HasilExecuteQuery = SQLStatement.executeQuery();
            
            // Menambahkan Judul yang berupa sebuah hasil rekap dari store dengan detail
            // waktu pencatatan Rekap Stok 
            DateTimeFormatter Format =  DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
            LocalDateTime now = LocalDateTime.now();
            String JudulLaporan = new String("Hasil Rekap Store Tanggal" + " " + Format.format(now).toString()).toUpperCase();
            Paragraph title = new Paragraph(JudulLaporan);

            document.add(title);      
            
            // membuat object table yang dibuat untuk dengan 6 Kolom yang diconfigurasikan dengan membuat 150F 
            float [] pointColumnWidths = {150F, 150F, 150F, 150F};
            Table table = new Table(pointColumnWidths); 

            // Invoke method membuat_table untuk membuat judul 
            HasilReport.membuat_tabel(table, document);

            while(HasilExecuteQuery.next()) { 
                // Mengambil data-data yang ada pada database
                String NamaBarang  = String.valueOf(HasilExecuteQuery.getString("nama_barang"));
                String StokAwal    = String.valueOf(HasilExecuteQuery.getString("stok_display"));
                String StokIn      = String.valueOf(HasilExecuteQuery.getString("stok_masuk_display"));
                String StokGudang  = String.valueOf(HasilExecuteQuery.getString("stok_gudang"));
                String data[]      = {NamaBarang, StokAwal, StokIn,  StokGudang};

                // untuk mengetahui banyak data yang ada pada database 
                int banyak_data = data.length;
                // menambahkan data pada tabel sebagai control variabel 
                for (int i = 0; i < banyak_data; i++) {
                    table.addCell(data[i]); 
                }  
            }
      
            document.add(table);
            document.close();

            // jika dokumen HasilReport.pdf sudah tercipta maka pada command line akan
            // terdapat pesan "Document Tercipta"
            System.out.print("Document Tercipta");
            JOptionPane.showMessageDialog(null, "Dokumen Tercipta");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) { 
            System.out.println(e);
        }
    }
}
