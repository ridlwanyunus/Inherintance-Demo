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
public class Sepeda extends Kendaraan{
    protected int jmlSadel;
    protected int jmlGir;

    public Sepeda() {
    }

    public int getJmlSadel() {
        return jmlSadel;
    }

    public void setJmlSadel(int jmlSadel) {
        this.jmlSadel = jmlSadel;
    }

    public int getJmlGir() {
        return jmlGir;
    }

    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }

    @Override
    public String toString() {
        String str = super.toString() +
                "Jumlah sadel: " + getJmlSadel()+ "\n" +
                "Jumlah Gir: " + getJmlGir() + "\n";
        return str;
    }
}
