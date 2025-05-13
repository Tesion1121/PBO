package 4;

public class Persegi extends BangunDatar {
    //atribut
    private double sisi;
    //konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }
}