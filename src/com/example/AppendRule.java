package com.example;

public class AppendRule implements Rule {

    private int mod;
    private String word;

    AppendRule(int mod, String word) {
        this.mod = mod;
        this.word = word;
    }

    @Override
    public boolean ruleApplies(int i) {
        return i % mod == 0;
    }

    @Override
    public void appendSb(StringBuilder sb) {
        sb.append(word);
    }
}