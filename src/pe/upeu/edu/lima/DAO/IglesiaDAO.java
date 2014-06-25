/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.lima.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import pe.upeu.edu.lima.config.Conexion;
import pe.upeu.edu.lima.modelo.Distrito;
import pe.upeu.edu.lima.modelo.Iglesia;

/**
 *
 * @author juan
 */
public class IglesiaDAO {
     private Connection cx;
   private Statement st;
    private ResultSet rs;
    private String sql;
    
    ArrayList<Iglesia> lista = null;
    
    public ArrayList<Iglesia> listarDistrito(){
        try {
            lista = new ArrayList();
            sql = "SELECT * FROM Iglesia";
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Iglesia d= new Iglesia();
                d.setIdi(rs.getInt("idiglesia"));
                d.setIdd(rs.getInt("iddistrito"));
                d.setIdd(rs.getInt("distrito"));
                d.setIdd(rs.getInt("estado"));
                
            }
        } catch (Exception e) {
           
        }
        return lista;
    }
    
}
