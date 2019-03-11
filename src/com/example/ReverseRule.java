package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseRule implements Rule {
    private String word;
    private final int mod;

    ReverseRule(int mod) {
        this.mod = mod;
    }

    @Override
    public boolean ruleApplies(int i) {
        return i % mod == 0;
    }

    @Override
    public void appendSb(StringBuilder sb) {
        reverseSB(sb);
        sb.append(word);
    }

    private void reverseSB(StringBuilder sb) {
        List<String> strings = Arrays.asList(sb.toString().split("(?<=\\G.{4})"));
        Collections.reverse(strings);
        word = String.join("", strings);
        sb.delete(0, sb.length());
    }
}