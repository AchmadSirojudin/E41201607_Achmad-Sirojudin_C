package Tugas_Minggu3;

import java.util.Scanner;

public class b {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Panjang arrray anda : ");
        int PanjangArray = in.nextInt();
        int[] RandomNumber = new int[PanjangArray];

//      input nilai random
        for (int i = 0; i < PanjangArray; i++) {
            System.out.print("nilai random ke " + i + " : ");
            RandomNumber[i] = in.nextInt();
        }

//      output nilai random
        System.out.print("Nilai array = ");
        System.out.print(" [ ");
        for (int i : RandomNumber){
            System.out.print(i + " ");
        }
        System.out.print("]");

    }
}
