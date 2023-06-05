package com.epam.rd.autotasks;

public class Sorting {
    public void sort(int[] array) {
        if (array == null) {
            System.out.println();
            throw new IllegalArgumentException();
        } else if (array.length == 0) {
            System.out.println("Array is empty.");
        } else {
            int temp;

            System.out.println("Original array: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("\nArray sorted in ascending order: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
