package com.platzi.functional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> courseList = NameUtil.getList(
                "Java", "Frontend", "Backend", "Fullstack");

        Stream<String> coursesStream = Stream.of("Java", "Frontend", "Backend", "Fullstack");
        //Convert a stream in other
        //Stream<Integer> courseLength = coursesStream.map(course -> course.length());

        // A stream can be consumed just once
        //Optional<Integer> longest = courseLength.max((x, y) -> y - x);

        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");

        Stream<String> justJavaCourse = emphasisCourses.filter(course -> course.contains("Java"));

        justJavaCourse.forEach(System.out::println);

        Stream<String> courseStream2 = courseList.stream();

        addOperator(courseStream2.map(course -> course + "!!")
                .filter(course-> course.contains("Java")))
                .forEach(System.out::println);


    }

    static <T> Stream<T> addOperator(Stream<T> stream) {
        return stream.peek(data -> System.out.println("Dato: " + data));
    }

}
