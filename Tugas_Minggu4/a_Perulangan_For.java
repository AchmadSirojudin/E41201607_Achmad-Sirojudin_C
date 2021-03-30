package Tugas_Minggu4;

import java.util.Scanner;

public class a_Perulangan_For {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Batas Nilai Awal : ");
        int NilaiAwal = in.nextInt();
        System.out.print("Masukkan Batas Nilai Akhir : ");
        int NilaiAkhir = in.nextInt();

    for (int i = NilaiAwal; i <= NilaiAkhir; i += 2) {
            System.out.print(i + " ");
        }
    }

}
