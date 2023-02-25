package com.company;
public class Main {
    public static void main(String[] args) {
        try {
            Fraction fraction1 = new Fraction(2, 3);
            Fraction fraction2 = new Fraction(3, 5);
            System.out.print("Первая дробь: ");
            fraction1.print();
            System.out.print("Вторая дробь: ");
            fraction2.print();
            Fraction fraction3 = new Fraction();
            fraction3 = fraction1.add(fraction2);
            System.out.print("Результат сложения: ");
            fraction3.print();
            System.out.print("Результат вычитания: ");
            fraction3 = fraction1.subtract(fraction2);
            fraction3.print();
            System.out.print("Результат деления: ");
            fraction3 = fraction1.divide(fraction2);
            fraction3.print();
            System.out.print("Результат умножения: ");
            fraction3 = fraction1.multiply(fraction2);
            fraction3.print();
            Fraction fraction4 = new Fraction(5, 0);
            fraction4.print();
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }

    }
}

