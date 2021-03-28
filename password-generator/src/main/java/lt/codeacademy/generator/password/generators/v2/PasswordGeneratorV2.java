package lt.codeacademy.generator.password.generators.v2;

public interface PasswordGeneratorV2<T extends Generator> {

    T getGenerator();

    String getPassword();
}
