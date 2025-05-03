/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victus by HP Gaming
 */
public class Kucing extends Anabul {

    public Kucing() {}

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing berjalan dengan anggun.");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing berkata: Meong~");
    }
}

