/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inherintancedemo.modul2.tugas;

/**
 *
 * @author didik
 */
public class Kendaraan {
    protected int jmlRoda;
    protected String warna;

    public Kendaraan() {
    }

    public int getJmlRoda() {
        return jmlRoda;
    }

    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public String toString() {
        String str = "Jumlah roda: " + getJmlRoda() + "\n" +
                "Warna: " + getWarna() + "\n";
        return str;
    }
    
    
}
