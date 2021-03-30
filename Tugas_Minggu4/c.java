package Tugas_Minggu4;

import java.util.Scanner;

public class c {

    public static void main(String[] args){

//  Membuat Scanner
        Scanner in = new Scanner(System.in);
//  Membuat Semua Variabel Yang dibutuhkan
        int Banyak_Data, Nilai, Min = 9999, Max = 0, Rata = 0;

        System.out.print("Masukkan banyaknya data nilai = ");
        Banyak_Data = in.nextInt();

        for (int i = 1; i <= Banyak_Data; i++) {
            System.out.print("Masukkan data Nilai ke-" + i +" = ");
            Nilai = in.nextInt();
            if(Nilai < Min) { //Nilai Minimum
                Min = Nilai;
            } else if(Nilai > Max) { //Nilai maksimum
                Max = Nilai;
            }
            Rata += Nilai; // jumlah seluruh Nilai
        }

//  Mencetak data yang diinginkan
        System.out.println("");
        System.out.println("Nilai Minimum = " +Min);
        System.out.println("Nilai Maksimum = " +Max);
        System.out.println("Nilai Rata-Ratanya adalah = " +Rata/Banyak_Data);
    }

}

