package com.practice.java.recursion;

import java.util.Scanner;

public class PrintDecreasingNumbers {

    //question - print numbers in decreasing order using recursion

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        printDecreasing(num);
    }


    public static void printDecreasing(int num){

        if(num==0){
            return;
        }
        System.out.println(num);
        printDecreasing(num-1);
    }

}
