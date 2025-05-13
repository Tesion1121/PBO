

public class main {
    public static void main(String[] args) {
        koleksi<Character> karakterKoleksi = new koleksi<>();

        // Tambahkan 10 karakter A sampai J
        for (char c = 'A'; c <= 'J'; c++) {
            karakterKoleksi.add(c);
        }

        System.out.println("=== Koleksi Awal ===");
        karakterKoleksi.showAll();

        System.out.println("\nUbah karakter ke-5 menjadi 'Z'");
        karakterKoleksi.setIsi(4, 'Z');
        karakterKoleksi.showAll();

        System.out.println("\nHapus karakter ke-2");
        karakterKoleksi.delete(1);
        karakterKoleksi.showAll();

        System.out.println("\nJumlah elemen sekarang: " + karakterKoleksi.getSize());
    }
}
