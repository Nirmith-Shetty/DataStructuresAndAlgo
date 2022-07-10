package com.practice.java.recursion;

import java.util.Scanner;

public class PowerLinear {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println(power(x, y));
    }

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }
        return power(x, n - 1) * x;
    }


}
