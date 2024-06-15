package com.trainingmug.java.fundamentals;

public class Loops {
    public static void main(String[] args) {
        //write a code to print all even numbers within a given range
        //constraints (least, max) 100000
        /*int no;
        no = 1;
        int maxLimit;
        maxLimit = 100;
        while(no <= maxLimit){
            if(no % 2 == 0)
                System.out.println(no);
            no++;
        }*/
        /*int maxLimit;
        maxLimit = 100;
        //for loop
        for(int no = 1 ; no <= maxLimit ; no++){
            if(no % 2 == 0)
                System.out.println(no);
        }*/
        int no;
        no = 1;
        do{
            System.out.println(no);
            no++;
        } while(no >= 10);



    }
}
