package com.trainingmug.java.oop;

public class Customer {
    //state (data)
    //instance variables
    int id;
    String name;
    String email;
    String contactNo;
    int salary;
    byte age;
    //behavior (methods)
    /*
    1. without returntype without parameters
     */

    void displayCustomerDetails(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("E-mail : " + email);
        System.out.println("Contact No : " + contactNo);
        System.out.println("Salary : " + salary);
        System.out.println("Age : " + age);
    }

    /*
    2. without returntype with parameters
     */

    void displayProducts(String membershipType){
        //business logic
        System.out.println("Displaying Products for membership : " + membershipType);
    }
    /*
    3. with returntype without parameters
    age >= 60 discountPercentage = 30;
    40 - 60 , 20
    20-40 15
    5
     */
    byte discountPercentageByAge(){
        System.out.println("discountPercentageByAge() is called ...");
        byte discountPercentage = 0;
        if(age >= 60)
            discountPercentage = 30;
        else if(age >= 50 && age < 60)
            discountPercentage = 20;
        else if(age >= 20 && age < 40)
            discountPercentage = 15;
        else
            discountPercentage = 5;

        return discountPercentage;
    }

    /*
    4. With returntype and with parameters
    finalPrice after discount
    1. Product Price (parameter)
    2. discount Percentage
    3. Calculate Final Price ( productPrice - productPrice * discountPercentage / 100 )
    4. Return the final price
     */

    double finalProductPriceAfterDiscount(double productPrice){
        byte discountPercentage = discountPercentageByAge();
        return productPrice - (productPrice * discountPercentage) / 100;

    }


}
