package lt.codeacademy;

@FunctionalInterface
public interface Interfeisas {

    int sum(int a, int b);

    // functional interface gali tureti default metodus, nes turi implementacija
    default void tt() {
        //
    }

}
