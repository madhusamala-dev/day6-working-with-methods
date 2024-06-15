package com.trainingmug.java.codingquestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter a number");
        int number = scanner.nextInt();*/
        System.out.println("Enter the range:");
        int maxLimit = scanner.nextInt();
        for(int no = 1 ; no <= maxLimit ; no++){
            boolean isPrime = isPrime(no);
            if(isPrime)
                System.out.println(no);
        }

        /*int factorCount = 0;
        for(int i = 1 ; i <= number ; i++){
            if(number % i == 0)
                factorCount++;
        }
        if(factorCount == 2)
            System.out.println(number + " is prime ");
        else
            System.out.println(number + " is not prime");
            */
       /*  boolean isPrime = isPrime(number);
         if(isPrime)
             System.out.println(number + "is a prime number");
         else
             System.out.println(number + "is not a prime number");
    */
    }
    public static boolean isPrime(int number){
        if( number <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(number) ; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
}
