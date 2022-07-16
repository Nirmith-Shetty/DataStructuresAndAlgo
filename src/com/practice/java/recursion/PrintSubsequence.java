package com.practice.java.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsequence {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(printSubsequence(str));
    }



    public static ArrayList<String> printSubsequence(String str){

        if(str.length() == 0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);
        String separate=str.substring(1);
        ArrayList<String> val=printSubsequence(separate);

        ArrayList<String> res=new ArrayList<>();

        for(String s: val){
            res.add(""+s);
        }

        for(String s: val){
            res.add(ch+s);
        }

return res;
    }
}
