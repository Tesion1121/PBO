public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counterDosen = 0;

    // Konstruktor tanpa parameter
    public Dosen() {
        fakultas = new Fakultas();
        counterDosen++;
    }

    // Konstruktor dengan parameter
    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counterDosen++;
    }
    
    // Getter dan Setter
    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }
    
    // Gaji Dosen = gaji pokok fakultas + (masaKerja x 1% x gaji pokok fakultas)
    @Override
    public double getGaji() {
        double gajiPokok = fakultas.getGajiPokok();
        return gajiPokok * (1 + (getMasaKerja() * 0.01));
    }
    
    // Menampilkan informasi dosen 
    public void tampilkanInfo() {
        System.out.println("===================================");
        System.out.println("            DATA DOSEN           ");
        System.out.println("===================================");
        super.tampilkanInfoCivitas();
        tampilkanInfoKaryawan();
        System.out.println("Fakultas  : " + fakultas.getNama().toUpperCase());
        System.out.printf("Gaji      : Rp%,.2f%n", getGaji());
        System.out.println("===================================");
        System.out.println(); 
    }
    
    
    public static void tampilkanCounter() {
        System.out.println("Jumlah Dosen: " + counterDosen);
    }
}
