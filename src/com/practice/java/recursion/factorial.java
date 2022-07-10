package com.practice.java.recursion;

import java.util.Scanner;

public class factorial {

//Question- print factorial of a number

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
       int num= s.nextInt();
        System.out.println(getFactorial(num));
    }


    public static int getFactorial(int num){

        if (num==1){
            return 1;
        }
        return num * getFactorial(num-1);
    }
}
