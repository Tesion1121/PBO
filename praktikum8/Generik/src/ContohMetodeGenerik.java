/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victus by HP Gaming
 */
public class ContohMetodeGenerik {
    public static void main(String[] args) {
        // Membuat objek Datum untuk setiap hewan
        Datum<Anabul> datumAnjing = new Datum<>();
        Datum<Anabul> datumKucing = new Datum<>();
        Datum<Anabul> datumBurung = new Datum<>();

        // Membuat objek dari setiap kelas hewan
        Anabul anjing = new Anjing("Jemkin");
        Anabul kucing = new Kucing("Aron");
        Anabul burung = new Burung("Cahya");

        // Menyimpan objek ke dalam Datum dan menampilkan perilakunya
        datumAnjing.setIsi(anjing);
        tampilkanPerilaku(datumAnjing);

        datumKucing.setIsi(kucing);
        tampilkanPerilaku(datumKucing);

        datumBurung.setIsi(burung);
        tampilkanPerilaku(datumBurung);
    }

    // Metode generik untuk mencetak perilaku hewan
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> datum) {
        // Mendapatkan objek hewan dari datum
        T hewan = datum.getIsi();

        // Menampilkan nama, gerak, suara, dan info
        System.out.println("============== INFO HEWAN ==============");
        System.out.println("Nama   : " + hewan.getNama());
        System.out.print("Gerak  : ");
        hewan.gerak();
        System.out.print("Suara  : ");
        hewan.bersuara();
        hewan.printInfo();  // Menampilkan info tambahan
        System.out.println("=======================================");
    }
}

