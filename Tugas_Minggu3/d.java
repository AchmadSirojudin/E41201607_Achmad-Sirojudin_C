package Tugas_Minggu3;

import java.util.Scanner;

public class d {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("             SIROJUDIN JAYA MULYA (SJM)");
        System.out.println("              Promo Belanja Berhadiah");
        System.out.println("          Khusus Pembelian 10 Barang Pertama");
        System.out.println("          Dengan Minimum Belanja Rp. 100.000");
        System.out.println("------------------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String NamaPembeli = in.nextLine();
        System.out.println("");

//  TOTAL HARGA
        int[] harga = new int[5];
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            System.out.print(" Masukkan harga barang ke-" + (i + 1) + " : ");
            harga[i] = in.nextInt();
            total  = total + harga[i];
        }

        System.out.println("Total harga pembelian atas nama " + NamaPembeli + " adalah Rp. " + total);

//  CEK PROMO
        boolean promo = false;
        for (int i = 0; i < harga.length; i++) {
            promo = harga[i] >= 100000;
        }
        if (promo == true) {
            System.out.println("Selamat...");
            System.out.println("Anda mendapatkan hadiah 1 buah mangkok");
        } else {
            System.out.println("Maaf anda belum mendapat promo");
        }
        System.out.println("");

        System.out.println("-------------------------------------------------------");
        System.out.println("                    Terima Kasih");
        System.out.println("           Sudah berbelanja di Toko Kami");
    }
}
