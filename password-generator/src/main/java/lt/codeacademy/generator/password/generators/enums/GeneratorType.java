package lt.codeacademy.generator.password.generators.enums;

public enum GeneratorType {
    NONE(-1),
    DIGITS(1),
    TEXTS(2),
    MIX(3);

    private final int value;

    GeneratorType(int value) {
        this.value = value;
    }

    public static GeneratorType valueOf(int index) {
        for (GeneratorType l : values()) {
            if (l.value == index) return l;
        }
        throw new IllegalArgumentException("Type not found");
    }
}
