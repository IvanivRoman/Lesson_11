package org.example;

public class App {

    public static final int MAX = 50;
    public static final int MIN = -50;

    public static void bubbleSorting(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] array, int search) {
        int first = 0;
        int last = array.length - 1;
        int middle = (first + last) / 2;
        if (array.length == 0)
            return -1;
        while (first <= last) {
            if (array[middle] == search) {
                return middle;
            } else if (array[middle] < search) {
                first = ++middle;
            } else {
                last = --middle;
            }
            middle = (first + last) / 2;
        }
        return -1;
    }

    public static int[] createRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (MAX - MIN)) + MIN;
        }
        return array;
    }

    public static void main(String[] args) {
    }
}