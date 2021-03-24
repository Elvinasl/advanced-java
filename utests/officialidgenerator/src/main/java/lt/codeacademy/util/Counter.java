package lt.codeacademy.util;

public final class Counter {

    public static final String PRADINE = "000";

    private static String number = PRADINE;

    private Counter() {
    }

    public static void increaseByOne() {
        try {
            int foo = Integer.parseInt(number);
            number = String.format("%1$03d", foo + 1);
            if (foo == 999) {
                nustatytiNumatytajareiksme();
            } else {
                number = number.substring(number.length() - 3);
            }
        } catch (NumberFormatException e) {
            System.exit(-1);
        }
    }

    private static void nustatytiNumatytajareiksme() {
        number = PRADINE;
    }

    public static String getNumber() {
        return number;
    }

}
