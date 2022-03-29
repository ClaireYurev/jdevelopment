package com.claireyurev;

/*
 *   ProjectEuler.net
 *   Problem 3: Largest prime factor
 *   The prime factors of 13195 are 5, 7, 13 and 29.
 *   What is the largest prime factor of the number 600851475143 ?
 * */

public class Main {

    public static void main(String[] args) {
        Primes p = new Primes();
        long t = 600_851_475_143L;
        long d = 2;
        while (1 == 1) {
            long tmp = 600_851_475_143L / d;
            if (t % tmp == 0 && p.isPrime(tmp)) {
                System.out.println("Largest prime factor of "+t+" is: "+tmp);
                break;
            }
            d++;
        }
    }
}
