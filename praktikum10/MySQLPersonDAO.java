import java.sql.*;

/**
 * File     : MySQLPersonDAO.java
 * Deskripsi: Implementasi PersonDAO untuk MySQL
 * Pembuat: Khairiya fatih izzudin emarin-24060123140166
 */

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        // Membuat koneksi, nama DB, user, password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo", "root", "--vinadsa--1");

        // Kerjakan MySQL query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        // Tutup koneksi database
        con.close();
    }
}
