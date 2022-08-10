package com.platzi.functional;

import java.util.function.Function;

public class MathOperations {

    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.println("Multiplying x: " + x + " by 3");
            return x * 3;
        };

        Function<Integer, Integer> add1MultiplyBy3 =
                multiplyBy3.compose(y -> {
                    System.out.println("I will add 1 to: " + y);
                    return y +1;
                });
        Function<Integer, Integer> andSquare =
                add1MultiplyBy3.andThen(x -> {
                    System.out.println("Add number " + x + " square");
                    return x * x;
                });

        System.out.println(andSquare.apply(3));
    }
}
