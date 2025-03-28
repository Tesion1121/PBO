/*
Nama File   :   Tendik.java
Deskripsi   :   Kelas untuk mewakili data tenaga pendidikan (tendik) yang bekerja langsung pada universitas dan memiliki perhitungan gaji berdasarkan masa kerja.
Pembuat     :   Khairiya Fatih Izzudin Emarin
Tanggal     :   28/03/2025 
*/

public class Tendik extends Karyawan {
    private static int counterTendik = 0;
    // Gaji pokok tetap Rp4.000.000,-
    private final double GAJI_POKOK_TENDIK = 4000000;

    // Konstruktor tanpa parameter
    public Tendik() {
        counterTendik++;
    }

    // Konstruktor dengan parameter
    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counterTendik++;
    }
    
    // Gaji Tendik = 4.000.000 + (masaKerja x 1% x 4.000.000)
    @Override
    public double getGaji() {
        return GAJI_POKOK_TENDIK * (1 + (getMasaKerja() * 0.01));
    }
    
    // Menampilkan informasi tendik 
    public void tampilkanInfo() {
        System.out.println("===================================");
        System.out.println("           DATA TENDIK           ");
        System.out.println("===================================");
        super.tampilkanInfoCivitas();
        tampilkanInfoKaryawan();
        System.out.printf("Gaji      : Rp%,.2f%n", getGaji());
        System.out.println("===================================");
        System.out.println(); 
    }
    
    
    public static void tampilkanCounter() {
        System.out.println("Jumlah Tendik: " + counterTendik);
    }
}
