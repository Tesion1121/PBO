package tugas;

import java.time.LocalDate;

// Kelas DosenTetap sebagai subclass dari Dosen
public class DosenTetap extends Dosen {
    protected String nidn;
    protected double tunjanganTetap;

    // Konstruktor
    public DosenTetap(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Fakultas, String NIDN, double TunjanganTetap) {
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok, Fakultas);
        this.nidn = NIDN;
        this.tunjanganTetap = TunjanganTetap;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public double getTunjanganTetap() {
        return tunjanganTetap;
    }

    public void setTunjanganTetap(double tunjanganTetap) {
        this.tunjanganTetap = tunjanganTetap;
    }

    public double hitungTotalGaji() {
        return super.getGajiPokok() + tunjanganTetap; // Pakai getter
    }
    

    @Override
    public void printInfo() {
        System.out.println("==================================");
        System.out.println("        DATA DOSEN TETAP");
        System.out.println("==================================");
        super.printInfo();
        System.out.println("NIDN         : " + nidn);
        System.out.println("Tunjangan Tetap : Rp " + tunjanganTetap);
        System.out.println("Total Gaji   : Rp " + hitungTotalGaji());
    }
}
