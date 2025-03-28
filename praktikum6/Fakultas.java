public class Fakultas {
    private String nama;
    private double tarifUkt;
    private double gajiPokok;

    // Konstruktor tanpa parameter 
    public Fakultas() {
        nama = "";
        tarifUkt = 0;
        gajiPokok = 0;
    }

    // Konstruktor dengan parameter
    public Fakultas(String nama, double tarifUkt, double gajiPokok) {
        this.nama = nama;
        this.tarifUkt = tarifUkt;
        this.gajiPokok = gajiPokok;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTarifUkt() {
        return tarifUkt;
    }

    public void setTarifUkt(double tarifUkt) {
        this.tarifUkt = tarifUkt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public void tampilkanInfo() {
        System.out.println("Fakultas: " + nama);
        System.out.println("Tarif UKT: " + tarifUkt);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
