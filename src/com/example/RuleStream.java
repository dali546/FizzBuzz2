package com.example;

import java.util.LinkedList;
import java.util.stream.Stream;

class RuleStream {

    static Stream<Rule> create() {
        LinkedList<Rule> rules = new LinkedList<>() {{
            add(new AppendRule(3, "Fizz"));
            add(new AppendRule(5, "Buzz"));
            add(new AppendRule(7, "Bang"));
            add(new RewriteRule(11, "Bong"));
            add(new InsertBeforeRule(13, "Fezz", "B"));
            add(new ReverseRule(17));
        }};
        return rules.stream();
    }
}