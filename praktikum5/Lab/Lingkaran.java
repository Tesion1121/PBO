// Nama File: Lingkaran.java
// Deskripsi: Class untuk lingkaran yang meng-extend BangunDatar
// Pembuat: Khairiya Fatih Izzudin Emarin
// Tanggal: 22/03/2025

package praktikum5.Lab;

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public void setJari(double jari){
        this.jari = jari;
    }
    public double getJari(){
        return jari;
    }
    public Lingkaran(){
        setJmlSisi(0);
        setJari(0);
    }

    public Lingkaran(double jari, String warna, String border){
        setWarna(warna);
        setBorder(border);
        setJari(jari);
    }

    @Override
    public double getLuas(){
        return Math.PI*jari*jari;
    }

    @Override
    public double getKeliling(){
        return 2*Math.PI*jari;
    }

    @Override
    public void zoomIn(){
        jari = jari*1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari/0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari + (jari*percent/100);
    }

    @Override
    public void printInfo(){
        System.out.println("****Lingkaran****");
        super.printInfo();
        System.out.println("Jari-jari : "+getJari());
    }
}
