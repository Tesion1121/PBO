package tugas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

// Kelas DosenTamu sebagai subclass dari Dosen
public class DosenTamu extends Dosen {
    // Atribut tambahan untuk Dosen Tamu
    protected String Nidk;
    protected LocalDate TanggalAkhirKontrak; // Tanggal Berakhir Kontrak

    // Formatter untuk menampilkan tanggal dalam format yang diinginkan
    public static final DateTimeFormatter FORMATTGL = DateTimeFormatter.ofPattern("d MMMM yyyy");

    // Konstruktor
    public DosenTamu(String NIP, String Nama, LocalDate TanggalLahir, String Fakultas, LocalDate TMT, double GajiPokok, String Nidk, LocalDate TanggalAkhirKontrak) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.Nidk = Nidk;
        this.TanggalAkhirKontrak = TanggalAkhirKontrak;
    }

    // Getter untuk Nidk
    public String getNidk() {
        return Nidk;
    }

    // Setter untuk Nidk
    public void setNidk(String Nidk) {
        this.Nidk = Nidk;
    }

    // Getter untuk Tanggal Akhir Kontrak
    public LocalDate getTanggalAkhirKontrak() {
        return TanggalAkhirKontrak;
    }

    // Setter untuk Tanggal Akhir Kontrak
    public void setTanggalAkhirKontrak(LocalDate TanggalAkhirKontrak) {
        this.TanggalAkhirKontrak = TanggalAkhirKontrak;
    }

    // Menghitung sisa kontrak dalam format "X tahun Y bulan"
    public String hitungSisaKontrak() {
        Period selisih = Period.between(LocalDate.now(), TanggalAkhirKontrak);
        return String.format("%d tahun %d bulan", selisih.getYears(), selisih.getMonths());
    }

    public double hitungTunjangan() {
        return 0.025 * super.getGajiPokok(); 
    }
    

    // Override method printInfo untuk menampilkan informasi Dosen Tamu
    @Override
    public void printInfo() {
        System.out.println("==================================");
        System.out.println("        DATA DOSEN TAMU");
        System.out.println("==================================");
        super.printInfo();
        System.out.println("NIDK         : " + Nidk);
        System.out.println("Sisa Kontrak : " + hitungSisaKontrak());
        System.out.println("Tanggal Akhir Kontrak : " + TanggalAkhirKontrak.format(FORMATTGL));
        System.out.println("Tunjangan    : Rp " + hitungTunjangan());
    }
}
