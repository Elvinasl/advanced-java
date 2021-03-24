package lt.codeacademy.model;

import lt.codeacademy.model.enums.Gender;

import java.time.LocalDate;

public class Person {

    private String officialId;
    private final String name;
    private final LocalDate birthDate;
    private final Gender gender;

    public Person(String name, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public void setOfficialId(String officialId) {
        this.officialId = officialId;
    }

    public String getOfficialId() {
        return officialId;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Gender getGender() {
        return gender;
    }
}
