package com.platzi.functional;

public class Chaining {

    public static void main(String[] args) {

        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();

    }

    static class Chainer {
        public Chainer sayHi() {
            System.out.println("Hi");
            return this;
        }

        public Chainer sayBye() {
            System.out.println("Bye");
            return this;
        }
    }
}
