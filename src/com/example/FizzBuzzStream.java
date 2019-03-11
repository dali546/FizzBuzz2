package com.example;

import java.util.stream.Stream;

class FizzBuzzStream {

    static Stream<String> create() {
        return Stream.iterate(1, i -> i + 1).map(FizzBuzzStream::convertToFizzBuzz);
    }

    private static String convertToFizzBuzz(Integer i) {
        StringBuilder stringBuilder = new StringBuilder();
        RuleStream.create().forEach(rule -> {
            if (rule.ruleApplies(i)) {
                rule.appendSb(stringBuilder);
            }
        });
        return stringBuilder.length() == 0 ? String.valueOf(i) : stringBuilder.toString();
    }
}