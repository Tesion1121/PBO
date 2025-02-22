/*
nama File   :   Titik.java
Deskripsi   :   methode beserta atributclass titik
Pembuat     :   Khairiya fatih izzudin emarin
Tanggal     :   19/02/2025
*/


public class Titik {
    /*  ATRIBUT  */
    double absis;
    double ordinat;
    static int countertitik = 0;

    /*  METHODE  */
    //konstruktor untuk membuat titik (0,0)\\
    Titik(){
        absis = 0 ;
        ordinat = 0;
        countertitik++;
    }
    Titik(double x, double y){
        absis = x ;
        ordinat = y;
        countertitik++;
    }


    /*MENGEMBALIKAN NILAI COUNTERTITIK*/
    static int getcountertitik(){
        return countertitik;
    }

    /*PRINT NILAI COUNTERTITIK */
    static void printcountertitik(){
        System.out.println(countertitik);
    }

    /* MENGEMBALIKAN NILAI ABSIS */
    Double getabsis(){
        return absis;
    }

    /*MENGEMBALIKAN NILAI ORDINAT*/
    Double getordinat(){
        return ordinat;
    }

    /*MENGESET ABSIS TITIK DENGAN NILAI BARU X*/
    void setabsis (double x){
        absis = x;
    }
    
    /*MENGESET ORDINAT TITIK DENGAN NILAI BARU Y* */
    void setordinat(double y){     
        ordinat = y;
    }
    
    /*MENGGESER NILAI ABSIS DAN ORDINAT TITIK MASING MASING SEJAUH X DAN Y */
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + x;
    }
    
    /*MENCETAK KOORDINAT TITIK */
    void printitik(){
        System.out.println("titik("+ absis +","+ ordinat + ")");
    }
    
    /*MENGEMBALIKAN NILAI KUADRAN */
    double getkuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0; 
        }
    }
    
    /*MENGEMBALIKAN JARAK PUSAT */
    double getjarakpusat(){
        return Math.sqrt(getabsis()*getabsis() + getordinat()*getordinat());
    }

    /*MENGEMBALIKAN JARAK KEDUA TITIK */
    double getjarak(Titik T){
        return Math.sqrt((T.getabsis()-getabsis())*(T.getabsis()-getabsis())) + ((T.getordinat()-getordinat())*(T.getordinat()-getordinat()));
    }

    /*REFLEKSI TITIK PADA SUMBU X */
    void refleksiX() {
        ordinat = -ordinat;
    }
    
    /*REFLEKSI TITIK PADA SUMBU Y */
    void refleksiY() {
        absis = -absis;
    }
    
    /*MENGEMBALIKAN NILAI REFLEKSI TITIK TERHADAP SUMBU X */
    Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }
    
    /*MENGEMBALIKAN NILAI REFLEKSI TITIK TERHADAP SUMBU Y */
    Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }
    
}

//akar 
