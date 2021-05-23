package com.company;

public class Main {

    public static void main(String[] args) {
        boolean number = LastNumberSeven(974497);
        System.out.println(number);
    }

    public static boolean LastNumberSeven(int number) {
        boolean x = true;
        boolean y = false;
        if (number % 10 == 7) {
            return x;
        } else {
            return y;
        }
    }
}
