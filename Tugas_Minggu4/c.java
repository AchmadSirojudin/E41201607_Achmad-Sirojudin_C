package Tugas_Minggu4;

import java.util.Scanner;

public class c {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai Data = ");
        int BanyakData = in.nextInt();
        int nilai[] = new int[BanyakData];

        for (int i = 0; i <= BanyakData; i++) {
            System.out.print("Masukkan data ke-" + i + " = ");
            nilai[i] = in.nextInt();
        }

    }
}
