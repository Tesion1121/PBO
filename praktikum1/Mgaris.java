/*
nama File   :   MGaris.java
Deskripsi   :   implementasi dari file garis
Pembuat     :   Khairiya fatih izzudin emarin
Tanggal     :   19/02/2025
*/

public class MGaris {
    public static void main(String[] args) {
        // a. Konstruktor tanpa parameter
        Garis g1 = new Garis();
        System.out.println("a. Konstruktor tanpa parameter:");
        g1.printGaris();

        // b. Konstruktor dengan parameter Titik
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis g2 = new Garis(t1, t2);
        System.out.println("\nb. Konstruktor dengan parameter Titik:");
        g2.printGaris();

        // c. Selektor (getter) dan mutator (setter)
        System.out.println("\nc. Selektor (getter) dan mutator (setter):");
        System.out.println("   Titik awal Garis 2: (" + g2.getTitikAwal().getabsis() + ", " + g2.getTitikAwal().getordinat() + ")");
        System.out.println("   Titik akhir Garis 2: (" + g2.getTitikAkhir().getabsis() + ", " + g2.getTitikAkhir().getordinat() + ")");

        Titik t3 = new Titik(1, 1);
        g2.setTitikAwal(t3);
        System.out.println("   Setelah diubah, Titik awal Garis 2: (" + g2.getTitikAwal().getabsis() + ", " + g2.getTitikAwal().getordinat() + ")");

        // d. Method untuk mendapatkan panjang sebuah garis
        System.out.println("\nd. Panjang Garis 2: " + g2.getPanjangGaris());

        // e. Method untuk mendapatkan gradien dari sebuah garis
        System.out.println("\ne. Gradien Garis 2: " + g2.getGradienGaris());

        // f. Method untuk mendapatkan titik tengah garis
        Titik tengah = g2.getTitikTengahGaris();
        System.out.println("\nf. Titik tengah Garis 2: (" + tengah.getabsis() + ", " + tengah.getordinat() + ")");

        // g. Mengecek apakah garis sejajar dengan garis lain
        Garis g3 = new Garis(-4, -2, 2, 4);
        System.out.println("\ng. Apakah Garis 2 sejajar dengan Garis 3?");
        g3.printGaris();
        System.out.println("   Jawaban: " + g2.isGarisSejajar(g3));

        // h. Mengecek apakah garis tegak lurus dengan garis lain
        Garis g4 = new Garis(-2, 0, 2, -4);
        System.out.println("\nh. Apakah Garis 2 tegak lurus dengan Garis 4?");
        g4.printGaris();
        System.out.println("   Jawaban: " + g2.isGarisTegakLurus(g4));

        // i. Method untuk menampilkan titik awal dan titik akhir garis
        System.out.println("\ni. Titik awal dan titik akhir Garis 2:");
        g2.printGaris();

        // j. Method untuk menampilkan persamaan garis dalam bentuk y = mx + c
        System.out.println("\nj. Persamaan Garis 2:");
        g2.printPersamaanGaris();

        // Menampilkan jumlah garis yang dibuat
        System.out.println("\nJumlah garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
