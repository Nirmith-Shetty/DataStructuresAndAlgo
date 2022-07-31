package com.practice.java.stringConcepts;

public class LongestCommonPrefix {


    public static void main(String[] args) {

        String[] vals={"flower","flower","flow"};
        System.out.println(vals[2].startsWith(vals[0]));
        System.out.println(longestPrefix(vals));
    }


    public static String longestPrefix(String[] str){

        String prefix=str[0];

        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }

        }

        return prefix;
    }
}
