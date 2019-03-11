package com.example;

import java.util.Scanner;

public class Main {

    private static final String UP_TO = "How Many Numbers do you want to go up to?";

    public static void main(String[] args) {
        printWelcomeMessage();
        Scanner scanner = new Scanner(System.in);
        int limit = getIntegerValue(scanner);
        FizzBuzzStream.create().limit(limit).forEach(System.out::println);
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to FizzBuzz - New & Improved");
        System.out.println(UP_TO);
    }

    private static int getIntegerValue(Scanner scanner) {
        String message = scanner.nextLine();
        while (!message.matches("\\d+")) {
            System.out.println("Invalid Response");
            System.out.println(UP_TO);
            message = scanner.nextLine();
        }
        return Integer.parseInt(message);
    }
}