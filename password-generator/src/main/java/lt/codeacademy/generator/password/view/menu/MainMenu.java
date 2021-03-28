package lt.codeacademy.generator.password.view.menu;

public class MainMenu implements ConsoleMenu {

    private static final String MENU_TEXT =
            "=========== M A I N   M E N U ==========\n" +
            "Please choose what you want to generate:\n" +
                    "[1] -> Digit password\n" +
                    "[2] -> Text password\n" +
                    "[3] -> Digit and text password\n" +
                    "[0] -> Exit";

    public void print() {
        System.out.println(MENU_TEXT);
    }
}
