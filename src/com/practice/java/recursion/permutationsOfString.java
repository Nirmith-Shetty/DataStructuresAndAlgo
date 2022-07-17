package com.practice.java.recursion;

import java.util.Scanner;

public class permutationsOfString {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();

        printPermutations(str,"");
    }


    public static void printPermutations(String str,String asf){

        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String roq=left+right;
            printPermutations(roq,asf+ch);
        }


    }
}
