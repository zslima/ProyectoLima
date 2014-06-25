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
 * @author Logistica.fia
 */
public class Conexion {
    private static Connection conex=null;
    private static String url = "jdbc:mysql://localhost/bd_visitas";
    private static String usuario = "root";
    private static String clave = "";
    
    public static Connection getConexion(){
        try {
                Class.forName("com.mysql.jdbc.Driver");
                if(conex==null){
                    conex = DriverManager.getConnection(url, usuario, clave);
                }           
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        return conex;
    }
}
