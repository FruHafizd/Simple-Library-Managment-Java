package LibraryManagment.utilities;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ConnectionMysql {
    public static java.sql.Connection getConnection() {
        java.sql.Connection connection = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/laporan_akhir_java?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "root";
        if(connection == null) {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch(ClassNotFoundException | SQLException error) {
                System.err.println("Error at Koneksi-getConnection, details : "+error.toString());
                JOptionPane.showMessageDialog(null, "Error at Koneksi-getConnetion, details : "+error.toString());
                System.exit(0);
            }
        }
        return connection;
         
    }

    public static PreparedStatement prepareStatement(String sql1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
