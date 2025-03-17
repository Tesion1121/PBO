/* 
 * File   : BangunDatar.java
 * Deskripsi : program untuk mendefinisikan child class BangunDatar, Lingkaran
 * Pembuat : Khairiya fatih izzudin emarin /240601231401666
 * Tanggal : 14 Maret 2025
 */


public class Lingkaran extends BangunDatar {
    //atribut
    private double jari;
    private static int counterLingkaran = 0;
    

    /*konstruktor*/
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
    //printcounter
    public double printcounter(){
        return counterLingkaran;
    }
    //getter
    public double getJari() {
        return jari;
    }
    //setter 
    public void setJari(double jari) {
        this.jari = jari;
    }
    //getter
    public double getluas(){
        return Math.PI * getJari() * getJari();
    }
    //getter
    public double getkeliling(){
        return 2 * Math.PI * getJari();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari :"+getJari());
    }
}