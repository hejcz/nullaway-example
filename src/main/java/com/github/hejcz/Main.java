package com.github.hejcz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        callA(maybeNull());
    }

    private static Integer maybeNull() {
        return Math.random() < 0.5 ? null : 34;
    }

    private static void callA(Integer integer) {
        System.out.println(integer.byteValue());
    }
}
