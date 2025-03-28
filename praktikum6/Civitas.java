/*
Nama File   :   Civitas.java
Deskripsi   :   Kelas abstrak yang menjadi basis bagi kelas Mahasiswa dan Karyawan .
Pembuat     :   Khairiya Fatih Izzudin Emarin
Tanggal     :   28/03/2025 
*/


public abstract class Civitas {
    private String nama;
    private String email;

    // Konstruktor tanpa parameter
    public Civitas() {
        nama = "";
        email = "";
    }

    // Konstruktor dengan parameter
    public Civitas(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    // Method untuk menampilkan informasi dasar
    public void tampilkanInfoCivitas() {
        System.out.println("Nama  : " + nama);
        System.out.println("Email : " + email);
    }
}
