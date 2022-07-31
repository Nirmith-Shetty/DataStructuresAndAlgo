package com.practice.java.stringConcepts;

import java.util.HashMap;

public class palindrome {


    public static void main(String[] args) {
        String str= "abc";
        HashMap<String,String> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
