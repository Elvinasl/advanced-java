package main.java.com.codeacademy.generic.example_1;

public interface Pair<K, V> extends GlobalPair {

    K getKey();
    V getValue();
}