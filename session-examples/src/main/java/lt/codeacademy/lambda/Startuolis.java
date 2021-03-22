package lt.codeacademy.lambda;

@FunctionalInterface
public interface Startuolis {
    String start(String a, String b);

    default String process() {
        return "In progress";
    }

    static void finish() {
        System.out.println("Startup has been sold");
    }
}
