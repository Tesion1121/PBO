/*
Nama File   : MataKuliah.java
Deskripsi   : Kelas untuk merepresentasikan data mata kuliah
Pembuat     : Khairiya Fatih Izzudin Emarin
Tanggal     : 27/02/2025
*/

public class MataKuliah {
    // Atribut
    private String idMatkul;
    private String nama;
    private int sks;

    // Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor (Getter)
    public String getIdMatkul() {
        return this.idMatkul;
    }

    public String getNama() {
        return this.nama;
    }

    public int getSks() {
        return this.sks;
    }

    // Mutator (Setter)
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
