package Tugas_Minggu6;

public class BubbleSortExample {

//  BUBBLE SORT ASCENDING
    static void bubbleSortASC(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int banyak_tukar = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    banyak_tukar++;
                }
            }
        }
        System.out.print("Array after bubble sort Ascending\t: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Banyak Jumlah perbandingan\t\t\t: " + banyak_tukar);
    }
// BUBBLE SORT DESCENDING
    static void bubbleSortDESC(int[] arr) {
        int temp = 0;
        boolean tukar = false;
        int banyak_tukar = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    tukar = true;
                    if (tukar) {
                        banyak_tukar++;
                    }
                }
            }
        }
        System.out.print("Array after bubble sort Descending\t: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Banyak Jumlah perbandingan\t\t\t: " + banyak_tukar);
    }


    public static void main(String[] args){
        int[] angka = {3, 60, 35, 2, 45, 320, 5};
        System.out.print("Array Before Bubble Sort\t\t\t: ");
        for (int b : angka) {
            System.out.print(b + " ");
        }
        System.out.println();
        bubbleSortASC(angka);
        bubbleSortDESC(angka);

    }
}

