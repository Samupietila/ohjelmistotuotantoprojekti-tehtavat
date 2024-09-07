package com.example;

public class StringManipulatorYourName {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public String capitalize(String input) {
        return input.toUpperCase();
    }
}