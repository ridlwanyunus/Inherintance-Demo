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
public class Taksi extends Mobil{
    protected int tarifAwal;
    protected int tarifPerKm;

    public Taksi() {
    }

    public int getTarifAwal() {
        return tarifAwal;
    }

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public int getTarifPerKm() {
        return tarifPerKm;
    }

    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }

    @Override
    public String toString() {
        String str = super.toString() +
                "Tarif awal: " + getTarifAwal() + "\n" +
                "Tarif per KM: " + getTarifPerKm() + "\n";
        return str;
    }
}
