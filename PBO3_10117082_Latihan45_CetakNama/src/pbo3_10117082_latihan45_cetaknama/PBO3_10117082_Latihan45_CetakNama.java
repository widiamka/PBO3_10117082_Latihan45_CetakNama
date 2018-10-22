/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan45_cetaknama;

import java.util.Scanner;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan hasil 
* cetak sebuah nama dengan inputan dari user
 */
public class PBO3_10117082_Latihan45_CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        Printer pr = new Printer();
        
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan Nama Anda : ");
        pr.setNama(sc.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        pr.setJmlCetak(sc1.nextInt());
        pr.cetak(pr.getNama());
        System.out.println("Hasil Cetak : ");
       pr.cetak(pr.getJmlCetak(), pr.getNama());
    }
    
}
