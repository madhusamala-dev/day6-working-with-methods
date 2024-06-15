package com.trainingmug.java.fundamentals;

public class ConditionalStatements {
    public static void main(String[] args) {
        // discount - product - customer membership and brand
        /*
        customer membership - Diamond - 20
        Gold - 15
        Silver - 10
        others - 5
         */
        int productPrice;
        productPrice = 300000;
        int discount;
        int discountPercentage;
        char membership;
        membership = 'B';
        String brand = "Samsung";
        if(membership == 'D' && brand == "Samsung"){
            discountPercentage = 20;
        } else if(membership == 'G') {
            discountPercentage = 15;
        } else if(membership == 'S') {
            discountPercentage = 10;
        } else {
            discountPercentage = 5;
        }
        discount = productPrice * discountPercentage / 100;
        System.out.println("Discount $: " + discount);
        System.out.println("Final Price : $ " + (productPrice - discount));
    }
}
