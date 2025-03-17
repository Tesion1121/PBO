package tugas;



import java.time.LocalDate;

public class Tendik extends Pegawai {
    // Atribut 
    protected String Bidang;
    protected static final int BUP = 55; // Batas Usia Pensiun untuk Tendik
    private LocalDate bup;

    // Konstruktor 
    public Tendik(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Jabatan, String Bidang) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Jabatan);
        this.Bidang = Bidang;
        this.bup = TanggalLahir.plusYears(BUP).plusMonths(1);
    }

    // Getter 
    public String getBidang() {
        return Bidang;
    }

    // Setter 
    public void setBidang(String Bidang) {
        this.Bidang = Bidang;
    }

    // Getter 
    public LocalDate getBup() {
        return bup;
    }

    // Menghitung tunjangan Tendik (1% dari masa kerja * gaji pokok)
    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * getGajiPokok(); 
    }

    // Override method printInfo untuk menampilkan informasi Tendik
    @Override
    public void printInfo() {
        System.out.println("==================================");
        System.out.println("        DATA TENAGA KEPENDIDIKAN");
        System.out.println("==================================");
        super.printInfo();
        System.out.println("Bidang       : " + Bidang);
        System.out.println("BUP          : " + getBup().format(FORMATTGL));
        System.out.println("Tunjangan    : Rp " + hitungTunjangan());
    }
}
