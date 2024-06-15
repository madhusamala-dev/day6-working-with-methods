package com.trainingmug.java.fundamentals;

public class NestedStatement {
    public static void main(String[] args) {
        outer:for(int i = 1 ; i <= 3 ; i++){
           inner: for(int j = 1; j <= 3 ; j++){
                if( i == j)
                    break outer;
                System.out.println(i + " " + j);
            }
        }
    }
}
