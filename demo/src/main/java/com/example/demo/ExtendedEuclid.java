package com.example.demo;

public class ExtendedEuclid {

    static public long gcdExtended(long a, long b) {
        long a1 = a;
        long b1 = b;
        long x = 0, y = 1, temp;
        long lastx = 1, lasty = 0;
        while (b != 0) {
            long q = a / b;
            long r = a % b;

            a = b;
            b = r;

            temp = x;
            x = lastx - q * x;
            lastx = temp;

            temp = y;
            y = lasty - q * y;
            lasty = temp;
        }
        System.out.println("GCD " + a + " and its Roots  x : " + lastx + " y :" + lasty);
        System.out.println("gcd(" + a1 + ", " + b1 + ") = " + a + "");
        return a;
    }

    public static void main(String[] args) {

        long a = 35, b = 15;
        // this will print result like
        // Roots x : 1 y :-2
        gcdExtended(a, b);

    }

}
