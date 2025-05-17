/*Pembuat: Khairiya fatih izzudin emarin-24060123140166
 * File:DAOManager.java
 * deskripsi: pengelola dao dalam program
 */

public class DAOManager {
    //atribut
    private PersonDAO personDAO;

    //setter
    public void setPersonDAO(PersonDAO person){
        personDAO =person;
    }

    //getter
    public PersonDAO getPersonDAO(){
        return personDAO;
    }
}
