/**
 * File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 * Pembuat: Khairiya fatih izzudin emarin-24060123140166
 */

import java.io.*;

class Person implements Serializable {
    //atribut
    private String name;
    
    //konstruktor
    public Person(String n) {
        name = n;
    }
    //getter
    public String getName() {
        return name;
    }
}
    //method
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Fani");

        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
