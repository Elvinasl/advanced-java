package lt.codeacademy.generic.example_1;


import lt.codeacademy.generic.example_1.model.Box;

import java.util.Date;

public class App {
    public static void main(String[] args) {
//        exampleSimpleOneGenericType();
//        exampleSimpleTwoGenericTypeAsMap();
        exampleSimpleGenericMethod();
    }

    private static void exampleSimpleGenericMethod() {
        Pair<String, String> p3 = new OrderedPair<>("As", "Petras");
        Pair<String, String> p4 = new OrderedPair<>("AS", "PETRAS");

        boolean compareResult = Util.compare(p4, p3);  // grazins false
    }

    private static void exampleSimpleTwoGenericTypeAsMap() {
        Pair<String, Integer> pair1 = new OrderedPair<>("Testas", 10);
        Pair<String, String> pair2 = new OrderedPair<>("Testas", "aaa");
        Pair<Integer, Box<Date>> pair3 = new OrderedPair<>(1, new Box<>());

        System.out.println(pair1.getValue());
        System.out.println(pair2.getValue());
    }

    private static void exampleSimpleOneGenericType() {
        Box<Integer> box = new Box<>();

        //metodas 1
        box.set(67);
        Integer val1 = box.get();

        //metodas2
//        box.set("kazkas");   // compile metu klaida
//        Integer val2 = box.get();
    }
}
