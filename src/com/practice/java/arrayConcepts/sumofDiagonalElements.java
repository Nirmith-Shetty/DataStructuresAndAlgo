package com.practice.java.arrayConcepts;

import java.util.Scanner;

public class sumofDiagonalElements {


    public static void main(String[] args) {


        Scanner s=new Scanner(System.in);
        System.out.println("Enter row size");
        int row=s.nextInt();
        System.out.println("Enter column size");
        int column=s.nextInt();

        int arr[][] =new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter the numbers");
                arr[i][j]=s.nextInt();
            }
        }

        int sum=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }

        System.out.println(sum);

    }

}
