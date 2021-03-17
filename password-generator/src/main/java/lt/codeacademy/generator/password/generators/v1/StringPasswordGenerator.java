package lt.codeacademy.generator.password.generators.v1;

public final class StringPasswordGenerator implements PasswordGeneratorService<String> {

    @Override
    public String generate() {
        return "abSdeGghij";
    }
}
