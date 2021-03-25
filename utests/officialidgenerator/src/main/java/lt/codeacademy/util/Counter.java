package lt.codeacademy.util;

public final class Counter {

    public static final String DEFAULT_COUNTER_NUMBER = "000";

    private static String number = DEFAULT_COUNTER_NUMBER;

    private Counter() {
    }

    public static void increaseByOne() {
        try {
            int foo = Integer.parseInt(number);
            number = String.format("%1$03d", foo + 1);
            if (foo == 999) {
                setDefaultCounterNumberValue();
            } else {
                number = number.substring(number.length() - 3);
            }
        } catch (NumberFormatException e) {
            System.exit(-1);
        }
    }

    public static void setDefaultCounterNumberValue() {
        number = DEFAULT_COUNTER_NUMBER;
    }

    public static String getNumber() {
        return number;
    }

}
