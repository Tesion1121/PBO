package A9B;
public class Anabul {
    private String nama; 
    // Konstruktor
    public Anabul(){}
     
    public Anabul(String nama) {
        this.nama = nama;
    }
    //getter
    public String getNama() {
        return nama;
    }
    // Setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method 
    public void gerak() {
        System.out.println(nama + " bergerak biasa.");
    }
    public void bersuara() {
        System.out.println(nama + " bersuara biasa.");
    }
}
