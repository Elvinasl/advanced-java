package lt.codeacademy.func_programming;

import java.util.function.Function;

public class InjectableTranslator implements Function<String, String> {
    @Override
    public String apply(String key) {
        return Translator.toLocale(key);
    }
}
