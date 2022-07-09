package com.practice.java.recursion;

import java.util.Scanner;

public class printDecreasingAndIncreasing {


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        printDecInc(num);
    }

    public static void printDecInc(int num){
        if(num ==0){
            return;
        }
        System.out.println(num);
        printDecInc(num-1);
        System.out.println(num);
    }
}
