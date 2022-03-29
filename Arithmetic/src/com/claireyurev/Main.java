package com.claireyurev;

public class Main {

    public static void main(String[] args) {
	    int resulty = 10 / 3;
        System.out.println(resulty);
        // result of the above is just "3"
        // convert to a float or a double to fix

        double result = (double)10 / (double)3;
        // result of the above is the "correct" 3.333333333333335
        System.out.println(result);

        double resultx = 10 / 3;
        // result of the above is a "double" 3.0, but 10 and 3 are cast as integers
        System.out.println(resultx);

        double resulta = 10.0 / 3.0;
        // result of the above is the "correct" 3.333333333333335, but not robust
        System.out.println(resulta);
    }
}
