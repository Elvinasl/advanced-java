package lt.codeacademy.generator.password.generators.v2;

import lt.codeacademy.generator.password.generators.type.Mix;

public final class MixPasswordGeneratorV2 implements Generator {

    @Override
    public String generate() {
        return "(Only mix) -> " + new Mix().toString();
    }
}
