/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung tunjangan pegawai
 */
public class Pegawai {
    private double gapok;
    private String status;

    public void setGapok(double gapok) {
        this.gapok = gapok;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    private double hitungTunjangan(){
        return status.equals("Menikah") ? gapok * 0.35 : 0;
    }
    
    private double hitungTotalGapok(){
        return gapok + hitungTunjangan();
    }
    
    public void tampilHasilPerhitungan(){
        System.out.println("\n==========Hasil Perhitungan Gaji Anda==========");
        System.out.println("Gaji Pokok     : " + gapok);
        System.out.println("Tunjangan      : " + hitungTunjangan());
        System.out.println("Total          : " + hitungTotalGapok());
        System.out.println("(Developed by : Bagus Budi Wibowo)");
    }
}
