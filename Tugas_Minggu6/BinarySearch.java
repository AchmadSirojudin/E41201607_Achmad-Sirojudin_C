package Tugas_Minggu6;

import java.util.Arrays;

public class BinarySearch {

    public static void binarySearch (int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first= mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index\t\t\t: " + mid);
                break;
            }else {
                last = mid -1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    public static void main(String[] args) {
        int[] number = {3, 60, 35, 2, 45, 320, 5};
        Arrays.sort(number);
        int target = 3;
        int last = number.length - 1;
        binarySearch(number, 0 , last, target);
    }
}
