/*
Nama File   : Kendaraan.java
Deskripsi   : Kelas untuk merepresentasikan kendaraan yang dimiliki mahasiswa
Pembuat     : Khairiya Fatih Izzudin Emarin
Tanggal     : 27/02/2025
*/

public class Kendaraan {
    // Atribut
    private String noPlat;
    private String jenis;

    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor (Getter)
    public String getNoPlat() {
        return this.noPlat;
    }

    public String getJenis() {
        return this.jenis;
    }

    // Mutator (Setter)
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
