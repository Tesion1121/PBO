/*
nama File   :   Garis.java
Deskripsi   :   methode beserta atributclass garis
Pembuat     :   Khairiya fatih izzudin emarin
Tanggal     :   19/02/2025
*/

public class Garis {
    // Atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor tanpa parameter (default)
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    // Konstruktor dengan parameter Titik
    public Garis(Titik t1, Titik t2) {
        this.titikAwal = t1;
        this.titikAkhir = t2;
        counterGaris++;
    }

    // Konstruktor dengan parameter koordinat
    public Garis(double x1, double y1, double x2, double y2) {
        this.titikAwal = new Titik(x1, y1);
        this.titikAkhir = new Titik(x2, y2);
        counterGaris++;
    }

    // Getter titik awal
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Getter titik akhir
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Setter titik awal
    public void setTitikAwal(Titik t) {
        this.titikAwal = t;
    }

    // Setter titik akhir
    public void setTitikAkhir(Titik t) {
        this.titikAkhir = t;
    }

    // Mengembalikan jumlah garis yang telah dibuat
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Menghitung panjang garis
    public double getPanjangGaris() {
        return titikAwal.getjarak(titikAkhir);
    }

    // Menghitung gradien garis
    public double getGradienGaris() {
        double dx = titikAkhir.getabsis() - titikAwal.getabsis();
        double dy = titikAkhir.getordinat() - titikAwal.getordinat();
        return dy / dx;
    }

    // Mengembalikan titik tengah garis
    public Titik getTitikTengahGaris() {
        double midX = (titikAwal.getabsis() + titikAkhir.getabsis()) / 2;
        double midY = (titikAwal.getordinat() + titikAkhir.getordinat()) / 2;
        return new Titik(midX, midY);
    }

    // Mengecek apakah dua garis sejajar
    public boolean isGarisSejajar(Garis g) {
        return this.getGradienGaris() == g.getGradienGaris();
    }

    // Mengecek apakah dua garis tegak lurus
    public boolean isGarisTegakLurus(Garis g) {
        return this.getGradienGaris() * g.getGradienGaris() == -1;
    }

    // Mencetak informasi garis
    public void printGaris() {
        System.out.println("Garis dari (" + titikAwal.getabsis() + ", " + titikAwal.getordinat() + ") ke (" +
                titikAkhir.getabsis() + ", " + titikAkhir.getordinat() + ")");
    }

    // Mencetak persamaan garis dalam bentuk y = mx + c
    public void printPersamaanGaris() {
        double m = getGradienGaris();
        double c = titikAwal.getordinat() - (m * titikAwal.getabsis());
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}
