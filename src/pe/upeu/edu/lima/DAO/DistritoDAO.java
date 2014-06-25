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

/**
 *
 * @author juan
 */
public class DistritoDAO {
    private Connection cx;
   private Statement st;
    private ResultSet rs;
    private String sql;
    
    ArrayList<Distrito> lista = null;
    
    public ArrayList<Distrito> listarDistrito(){
        try {
            lista = new ArrayList();
            sql = "SELECT * FROM Distrito";
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Distrito d= new Distrito();
                d.setIdd(rs.getInt("iddistrito"));
                d.setIdr(rs.getInt("idregion"));
                d.setDisc(rs.getString("distrito"));
                d.setEstado(rs.getString("estado"));
                
            }
        } catch (Exception e) {
           
        }
        return lista;
    }
    public int idDistrito(String nom){
        int id=0;
        sql="SELECT * FROM distrito WHERE distrito='"+nom+"'";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
             while(rs.next()){
                 id = rs.getInt("iddistrito");
             }
        } catch (Exception e) {
        }
        
        return id;
    }
       
}
