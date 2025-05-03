/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victus by HP Gaming
 */
public class Burung extends Anabul {

    public Burung() {}

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Burung terbang di udara.");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung berkicau: Cuit-Cuit!");
    }
}

