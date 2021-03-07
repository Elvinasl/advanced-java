package org.example.utils;

import org.example.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.example.config.Config.RESOURCE_PATH;

public class FileUtil {

    /**
     * Write Person to file
     *
     * @param filePath
     * @param persons list of {@link Person}
     * @return true if success, else otherwise
     * @see Person
     */
    public static boolean writeToFile(String filePath, List<Person> persons) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(RESOURCE_PATH+ filePath, true))) {
            for (Person person: persons) {
                pw.println(person.getFirstName());
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Read Person from file
     *
     * @param filePath
     * @return list of {@link Person}
     * @see Person
     */
    public static List<Person> readFromFile(String filePath) {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RESOURCE_PATH + filePath))) {
                String data;
                while((data = br.readLine()) != null) {
                    persons.add(new Person(data));
                }
                return persons;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
