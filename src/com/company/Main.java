package com.company;

import java.util.Scanner;

public class Main {
    public static int count;

    public static void main(String[] args) {
        try {
            Fraction fraction1 = new Fraction(2,0);
            if(fraction1.getDenominator()==0){
                throw new Exception("error");
            }
            Fraction fraction2 = new Fraction(4, 6);
            if(fraction2.getDenominator()==0) {
                throw new Exception("е");
            }
            fraction1.print();
            fraction2.print();
            Fraction fraction3 = new Fraction();
            fraction3 = fraction1.add(fraction2);
            fraction3.print();
            fraction3 = fraction1.divide(fraction2);
            fraction3.print();
            fraction3 = fraction1.multiply(fraction2);
            fraction3.print();
            fraction3 = fraction1.subtract(fraction2);
            fraction3.print();

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

