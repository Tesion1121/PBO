package tugas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

// Kelas Pegawai sebagai superclass
public class Pegawai {
    // Atribut dengan access modifier yang lebih sesuai
    protected String NIP;
    protected String Nama;
    protected LocalDate TanggalLahir;
    protected LocalDate TMT; // Terhitung Mulai Tanggal
    private double gajiPokok; // Ubah jadi private agar sesuai enkapsulasi
    protected String Jabatan; 

    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");

    // Konstruktor default 
    public Pegawai() {
        this.NIP = "";
        this.Nama = "";
        this.TanggalLahir = LocalDate.now();
        this.TMT = LocalDate.now();
        this.gajiPokok = 0.0;
        this.Jabatan = "";
    }

    // Konstruktor dengan parameter 
    public Pegawai(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double gajiPokok, String Jabatan) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
        this.Jabatan = Jabatan;
    }

    // Getter dan Setter 
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public LocalDate getTanggalLahir() {
        return TanggalLahir;
    }

    public void setTanggalLahir(LocalDate TanggalLahir) {
        this.TanggalLahir = TanggalLahir;
    }

    public LocalDate getTMT() {
        return TMT;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public double getGajiPokok() {
        return gajiPokok; // Gunakan getter agar bisa diakses di subclass
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String Jabatan) {
        this.Jabatan = Jabatan;
    }

    // Method untuk menghitung masa kerja dalam tahun
    public int hitungMasaKerja() {
        return Period.between(TMT, LocalDate.now()).getYears();
    }

    // Method untuk menampilkan informasi Pegawai
    public void printInfo() {
        System.out.println("NIP         : " + getNIP());
        System.out.println("Nama        : " + getNama());
        System.out.println("Tanggal Lahir: " + getTanggalLahir().format(FORMATTGL));
        System.out.println("TMT         : " + getTMT().format(FORMATTGL));
        System.out.println("Jabatan     : " + getJabatan());
        System.out.println("Masa Kerja  : " + hitungMasaKerja() + " tahun");
        System.out.println("Gaji Pokok  : Rp " + getGajiPokok());
    }
}
