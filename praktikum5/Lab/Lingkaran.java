package Lab;

public class Lingkaran extends BangunDatar {
    private double jari;
    private static int counterLingkaran = 0;

    public Lingkaran(){
        jari = 0;
        jmlSisi = 0;
        warna = "";
        border = "";
        counterLingkaran++;
    }

    public Lingkaran(double jari, double jmlSisi, String warna, String border){
        this.jari = jari;
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterLingkaran++;
    }

    public double printcounter(){
        return counterLingkaran;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double getLuas(){
        return Math.PI * getJari() * getJari();
    }

    @Override
    public double getKeliling(){
        return 2 * Math.PI * getJari();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari :"+getJari());
    }
}