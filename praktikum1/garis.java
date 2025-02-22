public class Garis {
    private Titik awal, akhir;

    // KONSTRUKTOR DEFAULT (GARIS DARI (0,0) KE (1,1))
    Garis() {
        this.awal = new Titik(0, 0);
        this.akhir = new Titik(1, 1);
    }

    // KONSTRUKTOR DENGAN PARAMETER (GARIS DARI TITIK AWAL KE TITIK AKHIR)
    Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
    }

    // GETTER: MENGEMBALIKAN TITIK AWAL GARIS
    public Titik getAwal() {
        return awal;
    }

    // GETTER: MENGEMBALIKAN TITIK AKHIR GARIS
    public Titik getAkhir() {
        return akhir;
    }

    // SETTER: MENGUBAH TITIK AWAL GARIS
    public void setAwal(Titik awal) {
        this.awal = awal;
    }

    // SETTER: MENGUBAH TITIK AKHIR GARIS
    public void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    // MENGHITUNG PANJANG GARIS MENGGUNAKAN RUMUS JARAK EUKLIDEAN
    public double panjangGaris() {
        return Math.sqrt(Math.pow(akhir.getabsis() - awal.getabsis(), 2) + Math.pow(akhir.getordinat() - awal.getordinat(), 2));
    }

    // MENGHITUNG GRADIEN GARIS
    public double gradienGaris() {
        return (akhir.getordinat() - awal.getordinat()) / (akhir.getabsis() - awal.getabsis());
    }

    // MENGHITUNG TITIK TENGAH GARIS
    public Titik titikTengah() {
        return new Titik((awal.getabsis() + akhir.getabsis()) / 2, (awal.getordinat() + akhir.getordinat()) / 2);
    }

    // MEMERIKSA APAKAH DUA GARIS SEJAJAR (GRADIENNYA SAMA)
    public boolean sejajar(Garis g) {
        return this.gradienGaris() == g.gradienGaris();
    }

    // MEMERIKSA APAKAH DUA GARIS TEGAK LURUS (HASIL PERKALIAN GRADIENNYA = -1)
    public boolean tegakLurus(Garis g) {
        return this.gradienGaris() * g.gradienGaris() == -1;
    }

    // MENGEMBALIKAN PERSAMAAN GARIS DALAM BENTUK y = mx + c
    public String persamaanGaris() {
        double m = gradienGaris();
        double c = awal.getordinat() - (m * awal.getabsis());
        return "y = " + m + "x + " + c;
    }
}
