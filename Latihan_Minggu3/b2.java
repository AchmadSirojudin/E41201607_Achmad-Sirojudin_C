package Latihan_Minggu3;

import java.util.Scanner;

public class b2 {

    public static void main(String[] args){

//        Oleh : Achmad Sirojudin_E41201607_C
//        Membuat Variabel dan Scanner
        String Lampu;
        Scanner s = new Scanner(System.in);

//        Mengambil Input dari user
        System.out.print("Inputkan pilihan warna : ");
        Lampu = s.nextLine();

        switch (Lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            case "hijau":
                System.out.println("Lampu Hijau, silahkan jalan");
                break;
            default:
                System.out.println("Warna Lampu salah");
        }
    }
}
