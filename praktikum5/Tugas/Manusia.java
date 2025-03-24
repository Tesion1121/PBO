package Tugas;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

abstract class Manusia {
    protected String nama;
    protected Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    public Manusia() {
        counterMns++;
    }

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) throws ParseException {
        this.nama = nama;
        this.tgl_mulai_kerja = new SimpleDateFormat("dd-MM-yyyy").parse(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Getter and Setter methods
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }

    public void setTglMulaiKerja(String tgl_mulai_kerja) throws ParseException {
        this.tgl_mulai_kerja = new SimpleDateFormat("dd-MM-yyyy").parse(tgl_mulai_kerja);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }

    // Abstract method
    public abstract int hitungMasaKerja();
}