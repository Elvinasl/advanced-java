package com.codeacademy.maven.mvn_example_1.src.main.java.eu.codeacademy.maven;



import com.codeacademy.maven.mvn_example_1.src.main.java.eu.codeacademy.maven.service.ManoKlase;
import com.codeacademy.maven.mvn_example_1.src.main.java.eu.codeacademy.maven.service.ManoKlaseImpl;
import com.codeacademy.maven.mvn_example_1.src.main.java.eu.codeacademy.maven.service.ManoKlaseV2Impl;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.printf("Hello! %s", "a");

        // klientui a
        ManoKlase manoKlase = new ManoKlaseImpl();
        manoKlase.sumTwoDigits(1, 2);

        // klientui
        ManoKlase manoKlasev2 = new ManoKlaseV2Impl();
        manoKlasev2.sumTwoDigits(1, 2);
    }
}

