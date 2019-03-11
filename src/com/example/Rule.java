package com.example;

interface Rule {
    boolean ruleApplies(int i);
    void appendSb(StringBuilder sb);
}
