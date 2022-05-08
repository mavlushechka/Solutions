package com.mavlushechka.solutions.learning;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Serialization {
    public static void main(String[] args) {
        // Object serialization
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/resources/serial"))) {
            Book book = new Book("Java: The Complete Reference", "Herbert Schildt", 1000);

            System.out.println(book);
            objectOutputStream.writeObject(book);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        // Object deserialization
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/resources/serial"))) {
            Book book = (Book) objectInputStream.readObject();

            System.out.println(book);
        } catch (IOException | ClassNotFoundException ioException) {
            ioException.printStackTrace();
        }
    }
}

class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = -2936687026040726549L;
    private final String name;
    private final String description;
    private final transient int copies;

    public Book(String name, String description, int copies) {
        this.name = name;
        this.description = description;
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", copies=" + copies +
                '}';
    }
}
