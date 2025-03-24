// Nama File: Main.java
// Deskripsi: Kelas utama untuk menjalankan program
// Pembuat: Khairiya Fatih Izzudin Emarin
// Tanggal: 22/03/2025

package Lab;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5, "Merah", "Hitam");
        persegi.printInfo();
        
        // Lingkaran lingkaran = new Lingkaran(14, "Biru", "Putih");
        // lingkaran.printInfo();
        
        // Persegi persegiLain = new Persegi(5, "Hijau", "Putih");
        // System.out.println("cek luasnya sama? " + persegi.isEqualLuas(persegiLain));
        // System.out.println("cek luasnya sama? " + persegi.isEqualLuas(lingkaran));
        
        System.err.println("**************************************************");
        
        persegi.zoomIn();
        System.out.println("Luas persegi setelah diperbesar: " + persegi.getLuas());
        
        persegi.zoomOut();
        System.out.println("Luas persegi setelah diperkecil: " + persegi.getLuas());
        
        persegi.zoom(10);
        System.out.println("Luas persegi setelah diperbesar 10%: " + persegi.getLuas());
    }
}