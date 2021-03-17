package lt.codeacademy.generator.password.view.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Every console menu's should use this interface
 *
 * @author pavel.vrublevskij
 */
public interface ConsoleMenu {

    /**
     * Method should contain a menu as text for console application.
     */
    void print();

    /**
     * Method waits for user input and return @{@link String}
     *
     * @return String as input
     * @throws IOException
     */
    default String readInput() throws IOException {
        System.out.print("Your input: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }
}
