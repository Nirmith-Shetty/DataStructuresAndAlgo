package com.practice.java.stringConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        printCompression(str);
        printCompression2(str);
        printCompression3(str);
    }

    //aaaabbbbccdef
    public static void printCompression(String str) {

        char first = str.charAt(0);
        String s = "" + first;
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            char current = str.charAt(i);
            char previous = str.charAt(i - 1);

            if (current == previous) {
                count++;
            } else {
                if (count > 1) {
                    s += count;
                    count = 1;
                }
                s += current;
            }
        }
        if (count > 1) {
            s += count;
            count = 1;
        }
        System.out.println(s);

    }

    //aaaabbbbccdef
    public static void printCompression2(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        System.out.println(set);
    }


    //aaaabbbbccdef
    public static void printCompression3(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
