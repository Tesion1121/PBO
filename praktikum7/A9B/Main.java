package A9B;
public class Main {
    public static void main(String[] args) {
        // Membuat objek anabul dengan berbagai jenis
        Anabul kucing = new Kucing();
        Anabul anjing = new Anjing();
        Anabul burung = new Burung();
        Anabul defaultAnabul = new Anabul("Anabul Biasa");


        cetakInfo(kucing, "Kucing");
        cetakInfo(anjing, "Anjing");
        cetakInfo(burung, "Burung");
        cetakInfo(defaultAnabul, "Default");
    }

    // Method untuk mencetak informasi anabul
    public static void cetakInfo(Anabul hewan, String tipe) {
        System.out.println("Jenis Anabul: " + tipe);
        System.out.print("Gerak  : ");
        hewan.gerak();
        System.out.print("Suara  : ");
        hewan.bersuara();
    }
}

