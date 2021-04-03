package Tugas_Minggu4;

public class b_Kelipatan_dan_perkalian_2 {

    public static void main(String[] args) {

        System.out.println("          Do__While");
        System.out.println("Bilangan Perkalian 2 (1-100)");
        System.out.println("=================================");
    int i = 1, a = 1;
        do {
            System.out.print(i + " ");
            i = i * 2 ;
        } while (i < 100 );

        System.out.println("\n");
        System.out.println("Bilangan Kelipatan 2 (1-100)");
        do {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            a++;
        } while (a < 100);

    }
}
