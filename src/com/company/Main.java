package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrays = {1, 5, 10, 4, 8, 3, 6, 9, 2};
        System.out.println("Array before insertion sort " + Arrays.toString(arrays));
        for (int i = 1; i < arrays.length; i++) {
            int value = arrays[i];
            int j = i - 1;
            while (j >= 0 && value < arrays[j]) {
                arrays[j + 1] = arrays[j];
                j--;
            }
            arrays[j + 1] = value;
        }
        System.out.println("Array after insertion sort " + Arrays.toString(arrays));
    }
}
