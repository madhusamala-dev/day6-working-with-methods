package com.trainingmug.java.fundamentals;

public class Switch {
    public static void main(String[] args) {
        String brand = "Apple";
        int productPrice;
        productPrice = 300000;
        int discount;
        int discountPercentage;
        discountPercentage = 1;
        char membership;
        membership = 'G';
        switch(brand){
            case "Samsung" :
                if(membership == 'D'){
                    discountPercentage = 30;
                } else if(membership == 'G') {
                    discountPercentage = 20;
                } else if(membership == 'S') {
                    discountPercentage = 15;
                } else {
                    discountPercentage = 5;
                }

                break;
            case "Apple":
                if(membership == 'D'){
                    discountPercentage = 20;
                } else if(membership == 'G') {
                    discountPercentage = 15;
                } else if(membership == 'S') {
                    discountPercentage = 10;
                } else {
                    discountPercentage = 5;
                }
                break;
            default:
                discountPercentage = 5;

        }
        System.out.println(discountPercentage);
        discount = productPrice * discountPercentage / 100;
        System.out.println("Discount $: " + discount);
        System.out.println("Final Price : $ " + (productPrice - discount));
    }
}
