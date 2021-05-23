package com.company;

public class Main {

    public static void main(String[] args) {
        boolean number = trueSeven(974497);
        System.out.println(number);
    }

    public static boolean trueSeven(int number) {
        boolean x = true;
        boolean y = false;
        if (number % 10 == 7) {
            return x;
        } else {
            return y;
        }
    }
}
