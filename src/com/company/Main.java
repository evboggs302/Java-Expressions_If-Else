package com.company;

public class Main {

    public static void main(String[] args) {
//        a mile is equal to 1.609344 km
//        expressions include variables, operators, and values
//        statements include the data type

        double kilometers = (100 * 1.609344);
//        System.out.println("this is an expression, called as an argument in a method");
//        methods are things that are going to be doing some action

//        the 'if' keyword is the start of conditional statements, and the 'else' keyword allows for more specificity.
        if(kilometers >= 100){
            System.out.println("longer than 100k"); // this is run
        } else {
            System.out.println("need more length");
        }

        kilometers = (20 * 1.609344);
        if(kilometers >= 100){
            System.out.println("longer than 100k");
        } else {
            System.out.println("need more length"); // this is run
        }

    }
}
