package Tugas_Minggu6;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int n  = arr.length;
        int banyak_tukar = 0;

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            banyak_tukar++;
        }

        System.out.print("Array After Sort\t\t\t: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Banyak jumlah perbandingan\t: " + banyak_tukar);
    }

    public static void main(String[] args) {
        int[] angka = {3, 60, 35, 2, 45, 320, 5};
        System.out.print("Array Before Sort\t\t\t: ");
        for (int b : angka) {
            System.out.print(b + " ");
        }
        System.out.println();
        selectionSort(angka);
    }
}
