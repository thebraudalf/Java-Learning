package com.OOPs.BigIntegerAndBigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BI();
        BD();
    }

    public static void BI(){
        // BigInteger class is used for the mathematical operation which involves very big integer calculations
        // that are outside the limit of all available primitive data types.
        // .valueOf() method converts int/long to BigInteger
        BigInteger A = BigInteger.valueOf(34);
        System.out.println(A); // 34

        // BigInteger Constructor
        // .intValue() method converts BigInteger to int/long
        int c = A.intValue();
        BigInteger C = new BigInteger("5432423423523254234");
        BigInteger D = new BigInteger("44234234234");

        // BigInteger constants
        BigInteger N = BigInteger.TEN;

        // some operations performing on BigIntegers
        BigInteger sum = A.add(C);
        BigInteger sub = A.subtract(C);
        BigInteger mul = A.multiply(C);
        BigInteger div = A.divide(C);

        System.out.println(div); // 0

        if(C.compareTo(D) < 0){
            System.out.println("Yes");
        }

        // performing Factorial
        System.out.println(Factorial.fact(100));
    }

    public static void BD(){
        double x = 0.03;
        double y = 0.04;

        // it will return answer with floating point no.
        double ans = y - x;
        System.out.println(ans); // 0.010000000000000002

        // BigDecimal class provides operations on double numbers for arithmetic, scale
        // handling, rounding, comparison, format conversion and hashing.
        BigDecimal a = new BigDecimal("0.03");
        BigDecimal b = new BigDecimal("0.04");

        // it will return answer without floating point no.
        System.out.println(b.subtract(a)); // 0.01
        System.out.println(b.negate()); // -0.04
    }
}
