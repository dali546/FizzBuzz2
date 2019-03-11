package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppendRule implements Rule {

    private int mod;
    private String word;
    private boolean newSB;
    private boolean reverse;

    AppendRule(int mod, String word) {
        this(mod, word, false, false);
    }

    AppendRule(int mod, String word, boolean newSB) {
        this(mod, word, newSB, false);
    }

    AppendRule(int mod, String word, boolean newSB, boolean reverse) {
        this.mod = mod;
        this.word = word;
        this.newSB = newSB;
        this.reverse = reverse;
    }

    @Override
    public boolean ruleApplies(int i) {
        return i % mod == 0;
    }

    @Override
    public void appendSb(StringBuilder sb) {
        if (newSB) sb.delete(0, sb.length());
        if (reverse) reverseSB(sb);
        sb.append(word);
    }

    private void reverseSB(StringBuilder sb) {
        List<String> strings = Arrays.asList(sb.toString().split("(?<=\\G.{4})"));
        Collections.reverse(strings);
        word = String.join("", strings);
        sb.delete(0, sb.length());
    }
}