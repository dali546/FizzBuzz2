package com.example;

public class InsertBeforeRule implements Rule {
    private final String word;
    private final int mod;
    private final String before;

    InsertBeforeRule(int i, String s, String c) {
        this.word = s;
        this.mod = i;
        this.before = c;
    }

    @Override
    public boolean ruleApplies(int i) {
        return i % mod == 0;
    }

    @Override
    public void appendSb(StringBuilder sb) {
        sb.insert((sb.indexOf(before) == -1) ? 0 : sb.indexOf(before), word);
    }
}