package com.platzi.functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> mark = text -> text + "!";
        System.out.println(quote.apply("Hi I'm a platzi student"));
        System.out.println(mark.apply("This is an example"));

        BiFunction<Integer, Integer, Integer> multiplication =
                (x, y) -> x * y;

        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s", text);
        System.out.println(leftPad.apply("Java", 6));

        List<BiFunction<String, Integer, String>> formatter;
    }
}
