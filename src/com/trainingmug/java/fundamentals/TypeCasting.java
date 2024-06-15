package com.trainingmug.java.fundamentals;

public class TypeCasting {
    public static void main(String[] args) {
        byte age;
        age = 35;
        int ageValue;
        ageValue = (int)age;

        float value;
        value = 234234.2f;

        int intValue;
        intValue = (int)value;
        System.out.println(intValue);

        ageValue = 130;
        age = (byte)ageValue;
        System.out.println("Age : " + age);

        byte test = 100;
        System.out.println(test);
    }
}
