package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String a = "";
        String b = "";
        String x = "";

        String password = "blue";

        for (; ; ) {  // Noncompliant; end condition omitted
            // ...
        }
    }

    int foo(int a) {
        int b = 12;
        if (a == 1) {
            return b;
        }
        return b;  // Noncompliant
    }

}