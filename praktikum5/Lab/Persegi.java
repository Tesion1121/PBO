// Nama File: Persegi.java
// Deskripsi: Class untuk persegi yang meng-extend BangunDatar
// Pembuat: Khairiya Fatih Izzudin Emarin
// Tanggal: 22/03/2025

package Lab;

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }
    public Persegi(double sisi, String warna, String border){
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas(){
        return sisi*sisi;
    }

    @Override
    public double getKeliling(){
        return 4*sisi;
    }
    public double getDiagonal(){
        return Math.sqrt(2)*sisi;
    }

    @Override
    public void zoomIn(){
        sisi = sisi*1.1;
    }

    @Override
    public void zoomOut(){
        sisi = sisi/0.9;
    }

    @Override
    public void zoom(int percent){
        sisi = sisi + (sisi*percent/100);
    }

    @Override
    public void printInfo(){
        System.out.println("****Persegi****");
        super.printInfo();
        System.out.println("Sisi : "+getSisi());
        System.out.println("Diagonal : "+getDiagonal());
    }
}