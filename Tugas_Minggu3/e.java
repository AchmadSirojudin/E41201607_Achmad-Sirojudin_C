package Tugas_Minggu3;

import java.util.Scanner;

public class e {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("            KAFE KOPI SENJA");
        System.out.println("         COFFEE ROASTER & SNACK");
        System.out.println("----------------------------------------------" + "\n");
        System.out.println("              SPECIAL MENU");
        System.out.println("     1. Kopi Espresso");
        System.out.println("     2. Kopi v60");
        System.out.println("     3. Kopi Vietnam Drip");
        System.out.println("     4. Banana Roll");
        System.out.println("     5. Sweet Potato");
        System.out.println("----------------------------------------------" + "\n");
        System.out.print(" Silahkan masukkan nama pembeli : ");
        String NamaPembeli = in.nextLine();
        System.out.print(" Silahkan Masukkan Menu pilihanmu : ");
        int Menu = in.nextInt();

//        MEMILIH MENU
        String Opsi = "";
        switch (Menu) {
            case 1:
                Opsi = ("Kopi Espresso");
                break;
            case 2:
                Opsi = ("Kopi V60");
                break;
            case 3:
                Opsi = ("Vietnam Drip");
                break;
            case 4:
                Opsi = ("Banana Roll");
                break;
            case 5:
                Opsi = ("Sweet Potato");
            default:
                System.out.println("Maaf Pilihan anda tidak ada di menu yang tersedia");
            break;
        }

        System.out.println(" Menu yang anda pesan adalah : " + Opsi);
        System.out.println(" Mohon bersabar, Pesanan anda akan segera di antar");
        System.out.println(" Terima Kasih " + NamaPembeli + " telah berkunjung ke Kafe Kopi Senja" );
    }
}
