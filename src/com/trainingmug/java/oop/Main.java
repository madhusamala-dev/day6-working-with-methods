package com.trainingmug.java.oop;

public class Main {
    public static void main(String[] args) {
        //object
        Customer customer1; // reference variable
        int x; // normal variable
        x = 100;
        System.out.println(x);
        customer1 = new Customer(); // new Customer Object will be created on Heap
        customer1.displayCustomerDetails();

        customer1.id = 111;
        customer1.name = "Customer1";
        customer1.email = "customer1@gmail.com";
        customer1.contactNo = "+91-987987342";
        customer1.salary = 2342342;
        customer1.age = 63;
        customer1.displayCustomerDetails();


        Customer customer2;
        customer2 = new Customer();
        customer2.id = 222;
        customer2.name = "Customer2";
        customer2.email = "customer2@gmail.com";
        customer2.contactNo = "+91-868768686";
        customer2.salary = 868768;
        customer2.age = 34;
        customer2.displayCustomerDetails();

        System.out.println(new Customer().email);
        Customer customer3;
        customer3 = customer2;
        customer3.name = "Customer3";
        System.out.println(customer2.name);
        System.out.println(customer3.name);

        customer1.displayProducts("Diamond");
        customer2.displayProducts("Gold");

       /* byte discountPercentage = customer1.discountPercentageByAge();
        System.out.println(customer1.name + "'s Discount Percentage is : " + discountPercentage);
        */
        System.out.println(customer1.name + "'s Discount Percentage is : " + customer1.discountPercentageByAge());
        System.out.println(customer2.name + "'s Discount Percentage is : " + customer2.discountPercentageByAge());
        System.out.println("Final Product Price for " + customer1.name + " is $: " + customer1.finalProductPriceAfterDiscount(234243.32));
        System.out.println("Final Product Price for " + customer2.name + " is $: " + customer2.finalProductPriceAfterDiscount(234243.32));
    }
}
