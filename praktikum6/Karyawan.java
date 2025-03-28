public abstract class Karyawan extends Civitas {
    private String nip;
    private int masaKerja; // dalam tahun

    // Konstruktor tanpa parameter
    public Karyawan() {
        nip = "";
        masaKerja = 0;
    }

    // Konstruktor dengan parameter
    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    // Getter dan Setter
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }
    
    // Method abstrak untuk mendapatkan gaji
    public abstract double getGaji();
    
    // Menampilkan informasi karyawan dasar dengan format menarik
    public void tampilkanInfoKaryawan() {
        System.out.println("-----------------------------------");
        System.out.println("         DATA KARYAWAN           ");
        System.out.println("-----------------------------------");
        System.out.println("NIP       : " + getNip().toUpperCase());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("-----------------------------------");
        System.out.println(); 
    }
    
}
