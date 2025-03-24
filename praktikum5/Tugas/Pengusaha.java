// Nama File: Pengusaha.java
// Deskripsi: Kelas untuk mendefinisikan pengusaha
// Pembuat: Khairiya Fatih Izzudin Emarin
// Tanggal: 22/03/2025

package Tugas;

import java.util.Date;
import java.text.ParseException;

class Pengusaha extends Manusia implements IPajak {
    private String npwp;
    private static int counterPengusaha;

    public Pengusaha(String nama, String NIK, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) throws ParseException {
        super(nama, NIK, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Getter and Setter methods
    public String getNpwp() {
        return npwp;
    }

    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    @Override
    public int hitungMasaKerja() {
        Date now = new Date();
        long diff = now.getTime() - tgl_mulai_kerja.getTime();
        int years = (int) (diff / (1000L * 60 * 60 * 24 * 365));
        return years + 0; // B = 0
    }

    @Override
    public double hitungPajak() {
        return pendapatan * 0.15;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}