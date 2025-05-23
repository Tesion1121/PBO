// Nama File: BangunDatar.java
// Deskripsi: Abstract class untuk bangun datar
// Pembuat: Khairiya Fatih Izzudin Emarin
// Tanggal: 22/03/2025

package praktikum5.Lab;

public abstract class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBDatar = 0;

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar bd){
        return this.getLuas() == bd.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar bd){
        return this.getKeliling() == bd.getKeliling();
    }

    public BangunDatar(){
        counterBDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBDatar++;
    }

    public static void printCBD(){
        System.out.println("Jml Bangun Datar : "+counterBDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }
    
    public void printInfo(){
        System.out.println("Jumlah Sisi : "+jmlSisi);
        System.out.println("Warna : "+warna);
        System.out.println("Border : "+border);
        System.out.println("Jml BDatar : "+counterBDatar);
        System.out.println("Luas : "+getLuas());
        System.out.println("Keliling : "+getKeliling());
    }
}
