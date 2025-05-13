

public class MainKoleksi {
    public static void main(String[] args) {
        // Koleksi khusus Anabul
        koleksi<Anabul> anabulKoleksi = new koleksi<>();

        // Tambahkan anabul
        anabulKoleksi.add(new Kucing("Mimi"));
        anabulKoleksi.add(new Anjing("Buddy"));
        anabulKoleksi.add(new Burung("Kenari"));

        System.out.println("=== Koleksi Anabul ===");

        // Tampilkan suara dan gerak semua anabul
        for (int i = 0; i < anabulKoleksi.getSize(); i++) {
            Anabul a = anabulKoleksi.getIsi(i);
            a.printInfo();
            a.gerak();
            a.bersuara();
            System.out.println();
        }
    }
}
