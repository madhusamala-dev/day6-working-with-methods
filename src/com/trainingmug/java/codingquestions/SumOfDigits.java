package com.trainingmug.java.codingquestions;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of Digits :  " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
