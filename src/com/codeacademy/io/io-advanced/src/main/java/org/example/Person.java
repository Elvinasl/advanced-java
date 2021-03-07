package org.example;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
