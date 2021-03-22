package lt.codeacademy.lambda;

public class LambdaStarterExercise {
    public static void start() {

        Startuolis startuolis = new Startup();

        Startuolis.finish();

        Startuolis s = new Startuolis() {
            @Override
            public String start(String a, String b) {
                return a + b;
            }
        };

        Startuolis lambda1 = (String name, String founderName) -> name + founderName;

        Startuolis lambda2 = (name, founderName) -> name + founderName;
    }
}
