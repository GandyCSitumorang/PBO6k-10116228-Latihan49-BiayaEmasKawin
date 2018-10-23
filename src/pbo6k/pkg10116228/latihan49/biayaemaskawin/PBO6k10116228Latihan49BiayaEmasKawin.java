/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan49.biayaemaskawin;
import java.util.Scanner;
/**
 * Nama : Gandy Christian Situmorang
 * Kelas: PBO-6K
 * NIM  : 10116228
 *Deskripso Program : program ini berisi program yang menampilkan perhitungan
 *                    harga emas sesuai berat pergramnya.
 */
public class PBO6k10116228Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas();
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        
        System.out.println("===Program Emas===");
        System.out.print("Berat emas = ");
        emas.setBeratEmas(scn1.nextFloat());
        System.out.print("Harga emas per-gram : ");
        emas.setHargaEmas(scn2.nextFloat());
        System.out.println("");
        System.out.println("Harga emas adalah = " + emas.totalBayar(15.7, 570000));
    }
    
}
