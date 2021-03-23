package Latihan_Minggu3;

import java.util.Scanner;

public class b1 {

    public static void main(String[] args){

//  Oleh : Achmad Sirojudin_E41201607_C
//  Membuat Variabel dan Scanner
        int nilai;
        String grade;
        Scanner s = new Scanner(System.in);

//  Mengambil Input User
        System.out.println("Inputkan Nilai : ");
        nilai = s.nextInt();

//  Menghitung Gradenya
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        }else if (nilai >= 70) {
            grade = "B";
        }else if (nilai >= 60) {
            grade = "C+";
        }else if (nilai >= 50) {
            grade = "C";
        }else if (nilai >= 40) {
            grade = "D";
        }else {
            grade = "E";
        }
//  Mencetak Hasilnya
        System.out.println("Grade : " + grade);
    }
}
