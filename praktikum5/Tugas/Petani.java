package Tugas;

import java.util.Date;
import java.text.ParseException;

class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani;

    public Petani() {
        counterPetani++;
    }

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) throws ParseException {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Getter and Setter methods
    public String getAsalKota() {
        return asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    @Override
    public int hitungMasaKerja() {
        Date now = new Date();
        long diff = now.getTime() - tgl_mulai_kerja.getTime();
        int years = (int) (diff / (1000L * 60 * 60 * 24 * 365));
        // Pastikan indeks valid sebelum mengakses karakter
        int index = 11;
        if (asal_kota.length() > index) {
            return years + Character.getNumericValue(asal_kota.charAt(index));
        } else {
            return years; // Jika indeks tidak valid, kembalikan tahun saja
        }
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
    }
}