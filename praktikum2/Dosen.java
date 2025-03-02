/*
Nama File   : Dosen.java
Deskripsi   : Kelas untuk merepresentasikan data seorang dosen
Pembuat     : Khairiya Fatih Izzudin Emarin
Tanggal     : 27/02/2025
*/

public class Dosen {

    // Atribut
    private String nama;
    private String nip; 
    private String prodi;

    // Konstruktor tanpa parameter
    public Dosen() {
        this.nama = "";
        this.nip = "";
        this.prodi = "";
    }

    // Konstruktor dengan parameter
    public Dosen(String nama, String nip, String prodi) {
        this.nama = nama;
        this.nip = nip;
        this.prodi = prodi;
    }

    // Selektor (Getter)
    public String getNama() {
        return this.nama;
    }

    public String getNip() {
        return this.nip;
    }

    public String getProdi() {
        return this.prodi;
    }

    // Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
