/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.lima.DAO;

/**
 *
 * @author juan
 */
public class TipoIglesiaDAO {
    private int idti;
    private String nomtip0;

    public TipoIglesiaDAO(String nomtip0) {
        this.nomtip0 = nomtip0;
    }

    public TipoIglesiaDAO() {
    }

    public int getIdti() {
        return idti;
    }

    public void setIdti(int idti) {
        this.idti = idti;
    }

    public String getNomtip0() {
        return nomtip0;
    }

    public void setNomtip0(String nomtip0) {
        this.nomtip0 = nomtip0;
    }
    
    
    
}
