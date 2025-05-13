/**
 * File : ArrayListTest.java
 * Deskripsi : program penggunaan objek ArrayList 
 *             sebagai Collection class
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        
        ArrayList<String> strings = new ArrayList<String>();

        
        strings.add("Praktikum");
        strings.add("Collection");
        strings.add("dan generics");

      
        strings.remove("Praktikum");

  
        for (String s : strings) {
            System.out.print(s + " ");
        }
    }
}
