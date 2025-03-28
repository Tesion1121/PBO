/*
Nama File   :   Main.java
Deskripsi   :   Kelas utama untuk mendemokan penggunaan kelas-kelas lainnya.
Pembuat     :   Khairiya Fatih Izzudin Emarin
Tanggal     :   28/03/2025 
*/

public class Main {
    public static void main(String[] args) {
        // Membuat objek Fakultas
        Fakultas teknik = new Fakultas("Teknik", 5000000, 6000000);
        Fakultas ekonomi = new Fakultas("Ekonomi", 4500000, 5500000);
        
        // Pembuatan objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("khairiya", "khairiya@mail.com", "M123", 1, teknik);
        Mahasiswa mhs2 = new Mahasiswa("izu", "izu@mail.com", "M456", 3, ekonomi);
        
        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        Mahasiswa.tampilkanCounter();
        System.out.println();
        
        // Pembuatan objek Dosen
        Dosen dosen1 = new Dosen("Dr eng", "deng@mail.com", "D789", 10, teknik);
        Dosen dosen2 = new Dosen("Dr sandy", "dsandy@mail.com", "D101", 5, ekonomi);
        
        dosen1.tampilkanInfo();
        dosen2.tampilkanInfo();
        Dosen.tampilkanCounter();
        System.out.println();
        
        // Pembuatan objek Tendik
        Tendik tendik1 = new Tendik("Pak Joko", "joko@mail.com", "T112", 8);
        Tendik tendik2 = new Tendik("Bu Ani", "ani@mail.com", "T113", 3);
        
        tendik1.tampilkanInfo();
        tendik2.tampilkanInfo();
        Tendik.tampilkanCounter();
    }
}
