package lt.codeacademy.func_programming;

import java.util.HashMap;
import java.util.Map;

public class Translator {
    private static Map<String, String> translations = new HashMap<>() {{
        put("hello", "Welcome to our app");
        put("logout", "Logout");
        put("add_entry", "Add entry");
    }};

    public static String toLocale(String key) {
        return translations.get(key);
    }
}
