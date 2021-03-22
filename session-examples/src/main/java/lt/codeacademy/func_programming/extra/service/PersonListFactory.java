package lt.codeacademy.func_programming.extra.service;

import lt.codeacademy.func_programming.extra.model.Person;

import java.util.List;

public class PersonListFactory {

    public static List<Person> getRandomList() {
        return List.of(
            new Person(1L, "Elvinas", "Luk"),
            new Person(2L, "Matas", "Pet"),
            new Person(3L, "Kazys", "Eok"),
            new Person(4L, "Antanas", "Sup"),
            new Person(5L, "Kazys", "Jon")
        );
    }
}
