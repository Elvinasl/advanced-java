package lt.codeacademy.func_programming.extra.exception;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException() {
        super("Person not found");
    }
}
