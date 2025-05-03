/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victus by HP Gaming
 */
public class TestSenjata {

    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR!");
        
        System.out.println("Jumlah peluru: " + ak47.getPeluru());
        System.out.println("Isi peluru: "); ak47.setPeluru(5);
        System.out.println("Juml peluru: " + ak47.getPeluru()) ;
        System.out.println("AK47 menembak: "); ak47.menembak();    
    }
}
