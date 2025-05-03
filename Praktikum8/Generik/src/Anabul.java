/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victus by HP Gaming
 */
public class Anabul {
    private String nama;

    public Anabul() {}

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void gerak() {
        System.out.println(nama + " bergerak biasa.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara biasa.");
    }

    // Menambahkan printInfo untuk menampilkan info lebih lanjut tentang hewan
    public void printInfo() {
        System.out.println("Info Hewan: " + nama);
    }
}

