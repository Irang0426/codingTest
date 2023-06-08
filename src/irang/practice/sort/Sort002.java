package irang.practice.sort;

import java.util.Arrays;

/*
삽입 정렬
 */
public class Sort002 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 8, 0, 3, 1, 6, 2, 4};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}