package lt.codeacademy.maven.mvn_example_1.src.main.java.eu.codeacademy.maven.service;

import java.io.Serializable;

public class ManoKlaseV2Impl implements ManoKlase, Serializable {

    public int sumTwoDigits(int a, int b) {
        return a + b + 3;
    }
}
