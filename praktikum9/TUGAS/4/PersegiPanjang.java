package 4;

public class PersegiPanjang extends BangunDatar{
    //atribut
    private double panjang;
    private double lebar;
    
    //konstruktor
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    public double hitungLuas() {
        return panjang * lebar;
    }
}