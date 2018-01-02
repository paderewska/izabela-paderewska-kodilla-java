package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {

        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            return a / b;

        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero! " + e);
            throw e;

        } finally {
            System.out.println("Koniec obliczen");
        }
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
    }
}
