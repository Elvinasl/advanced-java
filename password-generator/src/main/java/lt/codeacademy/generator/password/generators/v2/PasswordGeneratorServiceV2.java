package lt.codeacademy.generator.password.generators.v2;

public interface PasswordGeneratorServiceV2<T extends Generator> {

    T getGenerator();

    String getPassword();
}
