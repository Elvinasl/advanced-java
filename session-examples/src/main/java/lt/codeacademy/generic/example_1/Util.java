package lt.codeacademy.generic.example_1;

public class Util extends Object{

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getValue().equals(p2.getValue()) &&
                p1.getKey().equals(p2.getKey());
    }

    public static <K extends Number, V> boolean compareWhenKeyNumber(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getValue().equals(p2.getValue()) &&
                p1.getKey().equals(p2.getKey());
    }
}
