/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.lima.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author benjamin.reyna
 */
public class ConexionBD {
    
      
    public static Connection GetConnection() throws ClassNotFoundException, SQLException
    {
        Connection conexion=null;      
         Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/ladrillera";
            String usuario="root";
            String clave="";
            conexion= DriverManager.getConnection(url,usuario,clave);
        
            return conexion;
        
    }
}