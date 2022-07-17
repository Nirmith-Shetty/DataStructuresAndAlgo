package com.practice.java.recursion;

import java.util.Scanner;

public class displayAnArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        dispArray(arr, 0);
    }


    public static void dispArray(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }

        System.out.println(arr[index]);
        dispArray(arr, index + 1);

    }
}
