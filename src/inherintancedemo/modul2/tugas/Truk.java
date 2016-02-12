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
public class Truk extends Mobil{
    protected int muatanMaks;

    public Truk() {
    }

    public int getMuatanMaks() {
        return muatanMaks;
    }

    public void setMuatanMaks(int muatanMaks) {
        this.muatanMaks = muatanMaks;
    }

    @Override
    public String toString() {
        String str = super.toString() +
                "Muatan mesin: " + getMuatanMaks()  + "\n";
        return str;
    }
    
}
