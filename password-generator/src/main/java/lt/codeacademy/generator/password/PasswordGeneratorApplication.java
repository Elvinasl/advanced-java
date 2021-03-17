package lt.codeacademy.generator.password;

import lt.codeacademy.generator.password.view.menu.ConsoleMenu;
import lt.codeacademy.generator.password.view.menu.MainMenu;

import java.io.IOException;

public class PasswordGeneratorApplication {

    private final ConsoleMenu mainMenu;

    public PasswordGeneratorApplication() {
        this.mainMenu = new MainMenu();
    }

    public void run() {
        mainMenu.print();
        try {
            String value = mainMenu.readInput();
            //TODO: PasswordGeneratorApplication factory should be called, read https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
