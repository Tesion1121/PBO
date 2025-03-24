package Lab;

public class Persegi extends BangunDatar {
    private double sisi;
    private static int counterPersegi = 0;

    public Persegi(){
        sisi = 0;
        jmlSisi = 0;
        warna = "";
        border = "";
        counterPersegi++;
    }

    public Persegi(double sisi, double jmlSisi, String warna, String border){
        this.sisi = sisi;
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterPersegi++;
    }

    public double printcounter(){
        return counterPersegi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return getSisi() * getSisi();
    }

    @Override
    public double getKeliling() {
        return 4 * getSisi();
    }

    public double getdiagonal() {
        return Math.sqrt(getSisi() * getSisi() + getSisi() * getSisi());
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi :"+getSisi());
    }
}