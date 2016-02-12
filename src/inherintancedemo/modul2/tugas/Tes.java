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
public class Tes {
    public static void main(String[] args){
        truk1();
        truk2();
        taksi1();
        taksi2();
        sepeda1();
        sepeda2();
    }
    
    // Truk1
    private static void truk1(){
        Truk truk1 = new Truk();
        truk1.setJmlRoda(4);
        truk1.setWarna("kuning");
        truk1.setBahanBakar("Solar");
        truk1.setKapasitasMesin(1500);
        truk1.setMuatanMaks(1000);
        
        System.out.println("Truk1");
        System.out.println(truk1.toString());
    }
    
    //Truk 2
    private static void truk2(){
        Truk truk2 = new Truk();
        truk2.setJmlRoda(6);
        truk2.setWarna("Merah");
        truk2.setBahanBakar("Solar");
        truk2.setKapasitasMesin(2000);
        truk2.setMuatanMaks(5000);
        
        System.out.println("Truk2");
        System.out.println(truk2.toString());
    }
    
    // Taksi1
    private static void taksi1(){
        Taksi taksi1 = new Taksi();
        taksi1.setJmlRoda(4);
        taksi1.setWarna("Oranye");
        taksi1.setBahanBakar("Bensin");
        taksi1.setKapasitasMesin(1500);
        taksi1.setTarifAwal(10000);
        taksi1.setTarifPerKm(5000);
        
        System.out.println("Taksi1");
        System.out.println(taksi1.toString());
    }
    
    // Taksi2
    private static void taksi2(){
        Taksi taksi1 = new Taksi();
        taksi1.setJmlRoda(4);
        taksi1.setWarna("Biru");
        taksi1.setBahanBakar("Bensin");
        taksi1.setKapasitasMesin(1300);
        taksi1.setTarifAwal(7000);
        taksi1.setTarifPerKm(3500);
        
        System.out.println("Taksi2");
        System.out.println(taksi1.toString());
    }
    
    // Sepeda1
    private static void sepeda1(){
        Sepeda sepeda = new Sepeda();
        sepeda.setJmlRoda(3);
        sepeda.setWarna("Hitam");
        sepeda.setJmlSadel(1);
        sepeda.setJmlGir(2);
        
        System.out.println("Sepeda1");
        System.out.println(sepeda.toString());
    }
    
    // Sepeda2
    private static void sepeda2(){
        Sepeda sepeda = new Sepeda();
        sepeda.setJmlRoda(2);
        sepeda.setWarna("Putih");
        sepeda.setJmlSadel(2);
        sepeda.setJmlGir(5);
        
        System.out.println("Sepeda2");
        System.out.println(sepeda.toString());
    }
}
