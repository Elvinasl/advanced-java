package lt.codeacademy.generator.password.generators.v1;

import lt.codeacademy.generator.password.generators.type.Mix;

public final class MixPasswordGenerator implements PasswordGenerator<Mix> {

    @Override
    public Mix generate() {
        return new Mix();
    }
}
