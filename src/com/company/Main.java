package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        for (int i=1; i<=number; i++) {
            for (int space=number;space>=i;space--)
                System.out.print(" ");
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
