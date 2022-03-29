package com.claireyurev;

public class Primes
{
    public boolean isPrime(long n)
    {
        if ( n % 2 == 0 ){
            // ^ This filters for even numbers, meaning this can't be a prime
            return false;
        }

        long half = (n/2) % 2 == 0 ? (n/2)-1 : n/2;
            // ^ This ensures we're dealing with an odd number

        for ( int i = 3; i < half; i += 2 ){
            // ^ We step through i by 2 every time, in order to stay on odd numbers only

            if ( n % i == 0 ){
                return false;
            }
        }

        return true;

    }
}
