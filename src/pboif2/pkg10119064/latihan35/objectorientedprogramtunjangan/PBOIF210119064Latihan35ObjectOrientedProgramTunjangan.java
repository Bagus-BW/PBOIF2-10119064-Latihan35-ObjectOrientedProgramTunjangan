/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan35.objectorientedprogramtunjangan;

import data.Pegawai;
import java.util.Scanner;


/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung tunjangan pegawai
 */
public class PBOIF210119064Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //inisialisasi objek scanner
        Scanner keyboard = new Scanner(System.in);
        
        //inisialisasi objek pegawai;
        Pegawai p = new Pegawai();
        
        //input
        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        p.setGapok(keyboard.nextDouble());
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        p.setStatus(keyboard.next());
        
        //output
        p.tampilHasilPerhitungan();
        
    }
    
}
