package com.platzi.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NameUtil {

    public static void main(String[] args) {
        List<String> teachers = getList("Nicolas", "Juan", "Camilo");
        Consumer<String> printer = text -> System.out.println(text);
        teachers.forEach(printer);
        System.out.println("-----------------------------");
        //Reference operator
        teachers.forEach(System.out::println);
    }

    public static <T> List<T> getList(T ... elements) {
        return Arrays.asList(elements);
    }
}
