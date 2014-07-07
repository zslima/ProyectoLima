/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.lima.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    lista = new ArrayList();
    sql = "SELECT *FROM tipo_iglesia";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                TipoIglesia ti = new TipoIglesia();
                ti.setIdti(rs.getInt("idtipo_iglesia"));
                ti.setNomtipo(rs.getString("tipo_iglesia"));
                lista.add(ti);
            }
        } catch (SQLException e) {
        }    
    return lista;
    }
    public int idTipoIglesia(String nom){
    int id=0;
    sql ="SELECT *FROM tipo_iglesia WHERE tipo_iglesia='"+nom+"'";
    try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                id = rs.getInt("idtipo_iglesia");
            }
        } catch (SQLException e) {
        }
    return id;    
    }
    
    
}
