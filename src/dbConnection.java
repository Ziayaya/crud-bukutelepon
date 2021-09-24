
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */

public class dbConnection {
    public Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            //JOptionPane.showMessageDialog(null, "Koneksi Sukses");
            return con;
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(formBuku.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
