package LatihanMinggu2;

import java.util.Scanner;

public class Latihan4 {

    public static void main(String[] args) {
//        MEMBUAT SCANNER
        Scanner s1 = new Scanner(System.in);

//        MENGAMBIL INPUT USER DARI KEYBOARD
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.print("Masukkan nilai2 = ");
        int nilai2 = s1.nextInt();

//        MENGHITUNG & PRINT OUTPUT
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = " + jumlah);
    }
}
