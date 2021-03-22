package lt.codeacademy.func_programming;

import lt.codeacademy.func_programming.basic.InjectableTranslator;
import lt.codeacademy.func_programming.basic.SpeechEngine;
import lt.codeacademy.func_programming.extra.service.FunctionProgrammingService;

public class FuncProgrammingStarter {
    public static void start() {
        InjectableTranslator injectableTranslator = new InjectableTranslator();

        var engine = new SpeechEngine(injectableTranslator);
        System.out.println(engine.speak("hello"));

        FunctionProgrammingService functionProgrammingService = new FunctionProgrammingService();
        functionProgrammingService.start();
    }
}
