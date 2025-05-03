/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victus by HP Gaming
 */
public class Anjing extends Anabul {

    public Anjing() {}

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing melata dengan gagah.");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing menggonggong: Guk-Guk!");
    }
}

