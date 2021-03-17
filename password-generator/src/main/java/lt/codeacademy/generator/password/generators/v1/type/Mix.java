package lt.codeacademy.generator.password.generators.v1.type;

import static java.util.UUID.randomUUID;

public class Mix {

    @Override
    public String toString() {
        return randomUUID().toString().substring(0, 6);
    }
}
