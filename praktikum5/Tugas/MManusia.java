// Nama File: MManusia.java
// Deskripsi: Main class untuk menjalankan program
// Pembuat: Khairiya Fatih Izzudin Emarin
// Tanggal: 22/03/2025
package Tugas;

//java Tugas.MManusia(run)
import java.text.ParseException;

public class MManusia {
    public static void main(String[] args) {
        try {
            PNS p1 = new PNS("Satriyo", "198302032006041002", "01-04-2006", "Jl. Seroja", 15000000, "198302032006041002");
            Pengusaha pe1 = new Pengusaha("Adhy", "000-556-773-212-000-5", "01-01-2000", "Jl.Air", 55000000, "000-556-773-212-000-5");
            Petani pt1 = new Petani("Nugraha", "wonogiri", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
            PNS p2 = new PNS("Panji", "198004212010041002", "01-04-2010", "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");
            p2.setAlamat("Jl. Panorama 111 Tembalang");

            System.out.println("=====================================");
            System.out.println("         INFORMASI MANUSIA           ");
            System.out.println("=====================================");
            System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
            System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
            System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
            System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
            System.out.println("-------------------------------------");
            System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
            System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
            System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
            System.out.println("-------------------------------------");
            System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja() + " tahun");
            System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja() + " tahun");
            System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja() + " tahun");
            System.out.println("=====================================");
            System.out.println("         DETAIL INFORMASI            ");
            System.out.println("=====================================");
            System.out.println("PNS p1:");
            p1.cetakInfo();
            System.out.println("-------------------------------------");
            System.out.println("Pengusaha pe1:");
            pe1.cetakInfo();
            System.out.println("-------------------------------------");
            System.out.println("Petani pt1:");
            pt1.cetakInfo();
            System.out.println("=====================================");
            System.out.println("Terima kasih telah menggunakan program ini!");
            System.out.println("=====================================");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}