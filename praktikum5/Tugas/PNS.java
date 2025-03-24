// Nama File: PNS.java
// Deskripsi: Kelas untuk mendefinisikan PNS
// Pembuat: Khairiya Fatih Izzudin Emarin
// Tanggal: 22/03/2025

package Tugas;

import java.util.Date;
import java.text.ParseException;

class PNS extends Manusia implements IPajak {
    private String nip;
    private static int counterPNS;

    public PNS(String nama, String NIK, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) throws ParseException {
        super(nama, NIK, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Getter and Setter methods
    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    @Override
    public int hitungMasaKerja() {
        Date now = new Date();
        long diff = now.getTime() - tgl_mulai_kerja.getTime();
        int years = (int) (diff / (1000L * 60 * 60 * 24 * 365));
        return years + 1; // A = 1
    }

    @Override
    public double hitungPajak() {
        return pendapatan * 0.1;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}