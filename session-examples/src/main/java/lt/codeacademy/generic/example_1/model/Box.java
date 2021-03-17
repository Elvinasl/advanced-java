package lt.codeacademy.generic.example_1.model;

/**
 * E - Element (Collection data types, i.e. List<Object>, Set<Person>
 * K - Key
 * V - Value
 * N - Number
 * T - Type
 * @param <T>
 */
public class Box<T> {

    private T object;

    public void set(T object) { this.object = object; }
    public T get() { return object; }
}
