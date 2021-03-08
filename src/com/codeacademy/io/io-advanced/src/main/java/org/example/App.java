package org.example;

import org.example.utils.FileObjectUtil;
import org.example.utils.FileUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * This is example how to use IO Streams + simple lambda expr and generic class
 */
@SuppressWarnings("unchecked")
public class App {
    private static final String FRIENDS_FILE = "draugai.mano";
    private static final String FRIENDS_FILE_OBJ = "draugai.obj";

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Albert"));
        personList.add(new Person("Ignas"));
        personList.add(new Person("Pavel"));
        personList.add(new Person("Ramunas"));

        FileUtil.writeToFile(FRIENDS_FILE, personList);
        FileUtil.readFromFile(FRIENDS_FILE)
                .forEach(p -> System.out.println(p.getFirstName()));  // <== lambda expr

        System.out.println("Implementation by object");
        System.out.println("-----------------------------------------------------");
        FileObjectUtil<Person> objUtil = new FileObjectUtil<>();
        objUtil.writeToFile(FRIENDS_FILE_OBJ, personList);
        objUtil.readFromFile(FRIENDS_FILE_OBJ, (Class<List<Person>>) (Class<?>) List.class)
                .forEach(
                        p -> System.out.println(p.getFirstName())   // <== lambda expr
                );
    }
}
