package com.example;
import java.util.Scanner;

public class SamuDocker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, what is your name?: ");
        String a = sc.nextLine();
        System.out.println("Hello, " + a + "!");
    }
    
}