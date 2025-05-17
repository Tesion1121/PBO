/* File:Person.java
 * Deskripsi: Person database model
 * Pembuat: Khairiya fatih izzudin emarin-24060123140166
 */

public class Person {
    //Atribut
    private int id;
    private String name;

    //Konstruktor
    public Person( String n){
        name = n;
    }

    public Person(int i,String n){
        id = i;
        name = n;
    }

    //Getter
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}
