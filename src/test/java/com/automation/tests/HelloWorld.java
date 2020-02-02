package com.automation.tests;

import com.github.javafaker.Faker;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.number().digit());
        System.out.println(faker.demographic().sex());

    }
}
