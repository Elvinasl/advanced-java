package lt.codeacademy.func_programming.basic;

import java.util.function.Function;

public class SpeechEngine {

    private Function<String, String> translator;

    public SpeechEngine(Function<String, String> translator) {
        this.translator = translator;
    }

    public String speak(String key) {
        return translator.andThen(String::toUpperCase).apply(key);
    }
}
