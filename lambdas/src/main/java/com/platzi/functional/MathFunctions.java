package com.platzi.functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(5));

        Function<Integer, Boolean> isOdd = x-> x %2 == 1;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(4);

        Predicate<Student> isApproved = student -> student.getQualification() > 6.0;

        Student juako = new Student(7.0);
        System.out.println(isApproved.test(juako));
    }

    static class Student {
        private double qualification;

        public Student(double qualification) {
            this.qualification = qualification;
        }

        public double getQualification() {
            return qualification;
        }
    }
}
