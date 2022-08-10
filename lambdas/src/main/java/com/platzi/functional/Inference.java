package com.platzi.functional;

import java.util.List;
import java.util.function.Function;

public class Inference {

    public static void main(String[] args) {
        Function<Integer, String> convertFunction =
                integer -> "Double: "+ (integer * 2);
        System.out.println("Value: " + convertFunction.apply(2));
        List<String> students = NameUtil.getList("Juako", "Camilo", "Andrew");
        students.forEach(System.out::println);
    }
}
