

public class BangunDatar {
    /*Atribut*/
    protected double jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;
    

    //konstruktor
    public BangunDatar(){
        jmlSisi = 0;
        warna = "";
        border = "";
        counterBangunDatar ++;
    }

    public BangunDatar(double jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    //printcounter
    public double printcounter(){
        return counterBangunDatar;
    }
    //getter
    public double getjmlSisi(){
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }
    //setter 
    public void setJmlSisi(double jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo(){
        System.out.println("JmlSisi :"+getjmlSisi());
        System.out.println("warna: "+getWarna());
        System.out.println("border: "+getBorder());
        
    }
}
/*
     * keyword final pada class membuat class tersebut tidak bisa diwariskan
     * keyowrd final pada method membuat method tidak bisa dioverride di subclassnya
     */