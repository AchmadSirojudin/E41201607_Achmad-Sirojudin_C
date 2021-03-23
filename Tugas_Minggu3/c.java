package Tugas_Minggu3;

public class c {

    public static void main(String[] args) {

        int[][] array1 = {
                {5, 6, 1, 7},
                {8, 1, 2, 9},
                {5, 4, 7, 1},
                {8, 3, 7, 5}
        };

        for (int[] Nilai : array1) {
            System.out.print("[ ");
            for (int i = 0; i < 4; i++) {
                System.out.print(Nilai[i] + " ");
            }
            System.out.println("]");
        }
    }
}
