package Tugas;

import java.util.Date;
import java.text.ParseException;

class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS;

    public PNS() {
        counterPNS++;
    }

    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) throws ParseException {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
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
        return years + Character.getNumericValue(nip.charAt(13));
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