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
import pe.upeu.edu.lima.modelo.Iglesia;
import pe.upeu.edu.lima.modelo.TipoIglesia;

/**
 *
 * @author juan
 */
public class TipoIglesiaDAO {
     private Connection cx;
   private Statement st;
    private ResultSet rs;
    private String sql;
    
    ArrayList<TipoIglesia> lista = null;
    
    public ArrayList<TipoIglesia> listarTipoIglesia(){
        try {
            lista = new ArrayList();
            sql = "SELECT * FROM TipoIglesia";
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                TipoIglesia tpi= new TipoIglesia();
                tpi.setIdti(rs.getInt("idtipo_iglesia"));
                tpi.setNomtipo(rs.getString("tipo_iglesia"));
                
                
            }
        } catch (Exception e) {
           
        }
        return lista;
    }
    
    
}
