package lt.codeacademy.generator.password;

import lt.codeacademy.generator.password.generators.enums.GeneratorType;
import lt.codeacademy.generator.password.factory.GeneratorFactory;
import lt.codeacademy.generator.password.generators.v2.Generator;
import lt.codeacademy.generator.password.view.menu.ConsoleMenu;
import lt.codeacademy.generator.password.view.menu.MainMenu;

public class PasswordGeneratorApplication {

    private final ConsoleMenu mainMenu;

    public PasswordGeneratorApplication() {
        this.mainMenu = new MainMenu();
    }

    public void run() {
        mainMenu.print();
        try {
            GeneratorType chosenGeneratorType = GeneratorType.valueOf(Integer.parseInt(mainMenu.readInput()));

            // Version 1 example
            System.out.println("++++++++++++ Generation V1 +++++++++++++");
            String result = new GeneratorFactory().createGenerator(chosenGeneratorType);
            System.out.println(result);

            // Version 2 example
            System.out.println("++++++++++++ Generation V2 +++++++++++++");
            Generator generator = new GeneratorFactory().createGeneratorV2(chosenGeneratorType);
            System.out.println(generator.generate());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
