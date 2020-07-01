package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String text = secondChallenge.probablyIWillThrowException(3,5);
            System.out.println(text);
        } catch (Exception e) {
            System.out.println("Exception!! ");
        } finally {
            System.out.println("You executed second challenge.");
        }
    }
}
