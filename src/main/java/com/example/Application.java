package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {
        System.out.println("test");
        Micronaut.run(Application.class, args);
    }
}