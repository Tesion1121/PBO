public class Anabul {
    private String nama;

    // Konstruktor kosong
    public Anabul() {}

    // Konstruktor dengan parameter
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode gerak default
    public void gerak() {
        System.out.println(nama + " bergerak biasa.");
    }

    // Metode bersuara default
    public void bersuara() {
        System.out.println(nama + " bersuara biasa.");
    }

    // Menampilkan info
    public void printInfo() {
        System.out.println("Info Hewan: " + nama);
    }
}
