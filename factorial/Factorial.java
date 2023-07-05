package com.akshay.allprograms.factorial;

import java.util.Scanner;

public class Factorial {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the NUmber : ");
            int number = scanner.nextInt();
            scanner.close();
            int fact = 1;

            for (int i = 1; i<=number; i++){
                if (fact != 0) {
                    fact = fact * i;
                }
            }
            System.out.print(fact);

        }
    }
