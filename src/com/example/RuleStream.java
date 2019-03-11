package com.example;

import java.util.LinkedList;
import java.util.stream.Stream;

class RuleStream {

    static Stream<Rule> create() {
        LinkedList<Rule> rules = new LinkedList<>() {{
            add(new AppendRule(3, "Fizz"));
            add(new AppendRule(5, "Buzz"));
            add(new AppendRule(7, "Bang"));
            add(new AppendRule(11, "Bong", true));
            add(new AppendRule(13, "Fezz"));
            add(new AppendRule(17, "", false, true));
        }};
        return rules.stream();
    }


}
