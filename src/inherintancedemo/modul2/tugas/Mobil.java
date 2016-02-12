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
public class Mobil extends Kendaraan{
    protected String bahanBakar;
    protected int kapasitasMesin;

    public Mobil() {
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public String toString() {
        String str = super.toString() +
                "Bahan bakar: " + getBahanBakar() + "\n" +
                "Kapasitas mesin: " + getKapasitasMesin() + "\n";
        return str;
    }
}
