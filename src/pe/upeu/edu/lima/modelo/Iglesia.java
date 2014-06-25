/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.lima.modelo;

/**
 *
 * @author juan
 */
public class Iglesia {
    private int idi;
    private int idd;
    private  int ti;
    private String nomIglesia;
    private int cuenta;

    public Iglesia(int idd, int ti, String nomIglesia, int cuenta) {
        this.idd = idd;
        this.ti = ti;
        this.nomIglesia = nomIglesia;
        this.cuenta = cuenta;
    }

    public Iglesia() {
    }

    public int getIdi() {
        return idi;
    }

    public void setIdi(int idi) {
        this.idi = idi;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getTi() {
        return ti;
    }

    public void setTi(int ti) {
        this.ti = ti;
    }

    public String getNomIglesia() {
        return nomIglesia;
    }

    public void setNomIglesia(String nomIglesia) {
        this.nomIglesia = nomIglesia;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
