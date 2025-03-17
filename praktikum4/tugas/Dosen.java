package tugas;

import java.time.LocalDate;

// Kelas abstrak Dosen sebagai subclass dari Pegawai
public abstract class Dosen extends Pegawai {
    protected String fakultas;

    // Konstruktor untuk inisialisasi atribut Dosen
    public Dosen(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Fakultas) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, "Dosen");
        this.fakultas = Fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Override method printInfo untuk menampilkan informasi Dosen
    @Override
    public void printInfo() {
        System.out.println("==================================");
        System.out.println("            DATA DOSEN");
        System.out.println("==================================");
        super.printInfo();
        System.out.println("Fakultas     : " + fakultas);
    }
}
