package lt.codeacademy.func_programming;

public class FuncProgrammingStarter {
    public static void start() {
        InjectableTranslator injectableTranslator = new InjectableTranslator();

        var engine = new SpeechEngine(injectableTranslator);
        System.out.println(engine.speak("hello"));
    }
}
