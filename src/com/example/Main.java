package com.example;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

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

class FizzBuzzStream {
    static Stream<String> create() {
        return Stream.iterate(1, i -> i + 1).map(FizzBuzzStream::convertToFizzBuzz);
    }

    private static String convertToFizzBuzz(Integer i) {
        StringBuilder stringBuilder = getStringBuilder();
        if (i % 3 == 0) stringBuilder.append("Fizz");
        if (i % 5 == 0) stringBuilder.append("Buzz");
        if (i % 7 == 0) stringBuilder.append("Bang");
        if (i % 11 == 0) {
            stringBuilder = getStringBuilder();
            stringBuilder.append("Bong");
        }
        if (i % 13 == 0) stringBuilder.insert(getIndexOfFirstB(stringBuilder), "Fezz");
        if (i % 17 == 0) stringBuilder = reverseStringGetNewSB(stringBuilder);
        if (stringBuilder.toString().isEmpty()) stringBuilder.append(i);
        return stringBuilder.toString();
    }

    private static StringBuilder reverseStringGetNewSB(StringBuilder stringBuilder) {
        String[] words = stringBuilder.toString().split("(?<=\\G.{4})");
        stringBuilder = getStringBuilder();
        Collections.reverse(Arrays.asList(words));
        for (String word : words) stringBuilder.append(word);
        return stringBuilder;
    }

    private static int getIndexOfFirstB(StringBuilder stringBuilder) {
        if (stringBuilder.indexOf("B") == -1) return 0;
        else return stringBuilder.indexOf("B");
    }

    private static StringBuilder getStringBuilder() {
        return new StringBuilder();
    }
}

class RuleStream{
    private static Rule Rules;

    static Stream<Rule> create(){
        List<Rule> rules = new ArrayList<>();
        rules.add(new Mod3Rule(new StringBuilder(),3));

        return Stream.;
    }
}


interface Rule {
    boolean ruleApplies();
}
class Mod3Rule implements Rule{

    private final StringBuilder sb;
    private final int i;

    Mod3Rule(StringBuilder sb, int i){
        this.sb = sb;
        this.i = i;
    }

    @Override
    public boolean ruleApplies() {
        return false;
    }
}