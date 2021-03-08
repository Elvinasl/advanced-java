package org.example.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import static org.example.config.Config.RESOURCE_PATH;

public class FileObjectUtil<E extends Serializable> {

    /**
     * Write to file
     *
     * @param filePath
     * @param objectList list of {@link E}
     * @return true if success, else otherwise
     */
    public boolean writeToFile(String filePath, List<E> objectList) {
        try (var fos = new FileOutputStream(RESOURCE_PATH + filePath);
             var oos = new ObjectOutputStream(fos)) {
            oos.writeObject(objectList);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Read from file
     *
     * @param filePath
     * @param clazz of class {@link E}
     * @return list of {@link E}
     * @see E
     */
    public List<E> readFromFile(String filePath, Class<List<E>> clazz) {
        try (var fis = new FileInputStream(RESOURCE_PATH + filePath);
             var ois = new ObjectInputStream(fis)) {
            return clazz.cast(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
