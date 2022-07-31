package com.practice.java.stringConcepts;

public class FirstNonRepeatedChar {


    public static void main(String[] args) {
        String name="NNirmmith";
        int index=0;
        for(char jj:name.toCharArray()){
            if(name.indexOf(jj) == name.lastIndexOf(jj)){
                System.out.println("The non repeated character is - "+index);
                break;
            }
            else{
                index++;
            }
        }
    }
}
