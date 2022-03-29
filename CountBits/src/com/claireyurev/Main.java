package com.claireyurev;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(countBits(a));;

    }

    public static short countBits(int x) {
        short numBits = 0;
        while (x != 0) {
            numBits += (x & 1);
            x >>>= 1;
        }
        return numBits;
    }

}
