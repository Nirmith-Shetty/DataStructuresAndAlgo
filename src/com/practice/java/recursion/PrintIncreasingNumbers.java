package com.practice.java.recursion;


import java.util.Scanner;

public class PrintIncreasingNumbers {

    public static void main(String[] args) {

        //Question  - Print increasing numbers using recursion
        //input =5 ; output = 1,2,3,4,5

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        printIncreasingNumbers(num);

    }

    public static void printIncreasingNumbers(int n) {
        if (n == 0) {
            return;
        }
        printIncreasingNumbers(n - 1);
        System.out.println(n);

    }

}
