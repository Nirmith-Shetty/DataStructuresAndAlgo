package com.practice.java.stringConcepts;

import java.util.HashSet;

public class DuplicateChar {


    public static void main(String[] args) {
        String name="NNirmithsaalddd";
        char[] ch=name.toCharArray();
        HashSet<Character> aa=new HashSet<>();

        for(char getChar:ch){
            if(aa.add(getChar) == false){
                System.out.println("The duplicate character is - "+getChar);
            }
        }
    }
}
