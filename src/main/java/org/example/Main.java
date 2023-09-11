package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String a = "";
        String b = "";
        String x = "";

        String password = "blue";

        String ip = "192.168.12.42"; // Sensitive

        for (; ; ) {  // Noncompliant; end condition omitted
            // ...
        }
    }


}