package lt.codeacademy.func_programming.extra.service;

import lt.codeacademy.func_programming.extra.exception.PersonNotFoundException;
import lt.codeacademy.func_programming.extra.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionProgrammingService {

    public void start() {
        // first assignment (Consumer panaudojimas)
        List<Person> persons = PersonListFactory.getRandomList();
        Consumer<Person> printConsumer = p -> System.out.println(p.getName());
        printAllPrettyNames(printConsumer, persons);

        // second assignment
        boolean startsWith = isNameOrSurnameStartsWith("E").test(new Person(1L, "ELvis", "Luk"));
        System.out.println("Starts with: " + startsWith);

        // second part
        // a
        persons.forEach(p -> System.out.println(p.toString() + " Starts with: " + isNameOrSurnameStartsWith("E").test(p)));

        // c
        findByName("Elvinas", persons).ifPresent(p -> System.out.println("Rastas asmuo: " + p));

        // b
        findByName("Elvin2as", persons).orElseThrow(PersonNotFoundException::new);
    }

    private void printAllPrettyNames(Consumer<Person> printConsumer, List<Person> persons) {
        persons.forEach(printConsumer);
    }

    private Predicate<Person> isNameOrSurnameStartsWith(String prefix) {
        return (person) -> person.getName().startsWith(prefix) || person.getSurname().startsWith(prefix);
    }

    private Optional<Person> findByName(String name, List<Person> persons) {
        for(Person person : persons) {
            if(person.getName().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
