package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        String a = "a";
        while (a.equals("a")) {
            if (rand.nextInt(2) == 1) {
                a = "b";
            }
        }

    }

    public void doSomething() {
    }
}