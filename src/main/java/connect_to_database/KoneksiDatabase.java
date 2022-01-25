package connect_to_database;

/**
 * @author Gede Rico Wijaya 2005551091
 */

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

public class KoneksiDatabase {

    // member agar dapat menyimpan informasi tentang database yang ingin diconnect
    // member server digunakan untuk menyimpan nama server
    // member username digunakan untuk menyimpan nama username dari server
    // member database digunakan untuk menyimpan nama database yang ingin dihubung
    // member port digunakan untuk menyimpan nomor port server tersebut
    // membar password digunakan untuk menyimpan password dari server
    private static String server = "localhost";
    private static String username = "root";
    private static String database = "db_stok_barang";
    private static Integer port = 3306;
    private static String password = "";

    public static Connection getConnection() {
        // set Connection cnx to null
        Connection cnx = null;

        // membuat objek bernama datasource
        MysqlDataSource datasource = new MysqlDataSource();

        // memanggil method setter pada datasource
        datasource.setServerName(server);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(database);
        datasource.setPortNumber(port);
        
        try {
            // menghubungkan koneksi dengan database
            cnx = datasource.getConnection();
        } catch (Exception ex) {
            // jika gagal maka akan diberikan peringatan
            System.err.println(ex.getMessage());
        }

        return cnx;
    }
}
