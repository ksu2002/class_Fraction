package com.company;

//Описать класс дробей — рациональных чисел, являющихся отношением двух целых
//чисел. Предусмотреть методы сложения, вычитания, умножения и деления дробей.
// Разработать класс в соответствии с индивидуальным заданием
//Каждый разрабатываемый класс должен, как правило, содержать следующие
//элементы: скрытые поля, конструкторы с параметрами и без параметров,

//методы, свойства. Методы и свойства должны обеспечивать непротиворечивый,
//полный, минимальный и удобный интерфейс класса. При возникновении ошибок
//должны выбрасываться исключения.
//Написать программу, демонстрирующую все разработанные элементы
//класса. В программе должна выполняться проверка всех разработанных
//элементов класса
public class Fraction {
    private int numerator;//числитель
    private int denominator;//знаменатель

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void print(){
        System.out.println(numerator+ "/" + denominator);
    }
    public Fraction() {
        this.denominator = 1;
        this.numerator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public Fraction add(Fraction fraction) {//сложение дробей
        int resultNumerator;
        int resultDenominator;
        if (this.denominator != fraction.denominator) {
            resultDenominator = this.denominator * fraction.denominator;
            resultNumerator = this.denominator * fraction.numerator + fraction.denominator * this.numerator;
        } else {
            resultDenominator = this.denominator;
            resultNumerator = this.numerator + fraction.numerator;
        }
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        return result;
    }

    public Fraction subtract(Fraction fraction) {//вычитание дробей
        int resultNumerator;
        int resultDenominator;
        if (this.denominator != fraction.denominator) {
            resultDenominator = this.denominator * fraction.denominator;
            resultNumerator = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        } else {
            resultDenominator = this.denominator;
            resultNumerator = this.numerator - fraction.numerator;
        }
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        return result;
    }

    public Fraction multiply(Fraction fraction) {//умножение дробей
        int resultNumerator;
        int resultDenominator;
        resultDenominator = this.denominator * fraction.denominator;
        resultNumerator = this.numerator * fraction.numerator;
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        return result;
    }

    public Fraction divide(Fraction fraction) {//деление дробей
        int resultNumerator;
        int resultDenominator;
        resultDenominator = this.denominator * fraction.numerator;
        resultNumerator = this.numerator * fraction.denominator;
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        return result;
    }
}
