package lt.codeacademy.generator.password.generators.v1;

import lt.codeacademy.generator.password.generators.v1.type.Mix;

public final class MixPasswordGenerator implements PasswordGeneratorService<Mix> {

    @Override
    public Mix generate() {
        return new Mix();
    }
}
