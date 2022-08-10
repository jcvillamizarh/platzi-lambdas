package com.platzi.functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Syntax {

    public static void main(String[] args) {
        List<String> courses = NameUtil.getList("Java", "Functional");
        //lambda example
        courses.forEach(course -> System.out.println(course));
        // No lambda arguments
        useZero(() -> 2);

        usePredicate(text -> text.isEmpty());

        useBiFunction((x, y) -> x * y);

        useBiFunction((x, y) -> {
            System.out.println("X: " + x + ", Y: " + y);
            return x - y;
        });

        useNothing(() -> {
            System.out.println("Hi nothing");
        });

    }

    static void useNothing(OperateNothing operateNothing) {

    }

    static void useBiFunction(BiFunction<Integer, Integer, Integer> operation) {

    }
    static void usePredicate(Predicate<String> predicate) {

    }

    static void useZero(ZeroArguments zeroArguments) {

    }

    @FunctionalInterface
    interface ZeroArguments {
        int get();
    }

    @FunctionalInterface
    interface OperateNothing {
        void nothing();
    }
}
