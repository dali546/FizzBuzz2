package com.example;

public class RewriteRule implements Rule {
    private final String word;
    private final int mod;

    RewriteRule(int i, String word) {
        this.word = word;
        this.mod = i;
    }

    @Override
    public boolean ruleApplies(int i) {
        return i % mod == 0;
    }

    @Override
    public void appendSb(StringBuilder sb) {
        sb.delete(0, sb.length());
        sb.append(word);
    }
}
