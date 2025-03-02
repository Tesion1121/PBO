/*
Nama File   : MahasiswaApp.java
Deskripsi   : Program utama untuk menguji kelas Mahasiswa
Pembuat     : Khairiya Fatih Izzudin Emarin
Tanggal     : 27/02/2025
*/

public class MainMahasiswa{
    public static void main(String[] args) {
        // Membuat objek Dosen dengan informasi berbeda
        Dosen dosenWali = new Dosen("987", "Prof. Bambang", "Teknik Informatika");

        // Membuat objek Kendaraan dengan informasi berbeda
        Kendaraan kendaraanMhs = new Kendaraan("AD 1094 AB", "Motor Vario 160");

        // Membuat objek MataKuliah dengan daftar berbeda
        MataKuliah PBO = new MataKuliah("15", "Pemrograman Berorientasi Objek", 4);
        MataKuliah IMK = new MataKuliah("25", "Interaksi Manusia dan Komputer", 3);
        MataKuliah KSI = new MataKuliah("35", "Keamanan Sistem Informasi", 3);
        MataKuliah RPL = new MataKuliah("45", "Rekayasa Perangkat Lunak", 4);
        MataKuliah AI = new MataKuliah("55", "Artificial Intelligence", 3);
        MataKuliah PROBSTAT = new MataKuliah("65", "Probabilitas dan Statistik", 3);

        // Membuat objek Mahasiswa dengan nama berbeda
        Mahasiswa mahasiswaBaru = new Mahasiswa();
        mahasiswaBaru.setDosenWali(dosenWali);
        mahasiswaBaru.setKendaraan(kendaraanMhs);
        mahasiswaBaru.setNama("Aldebaran Rizky");
        mahasiswaBaru.setNim("23210");
        mahasiswaBaru.setProdi("Teknik Informatika");

        // Menampilkan PRINT mahasiswa
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> DATA MAHASISWA <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        mahasiswaBaru.printMhs();

        // Menambahkan mata kuliah ke daftar mahasiswa
        mahasiswaBaru.addMataKuliah(PBO);
        mahasiswaBaru.addMataKuliah(IMK);
        mahasiswaBaru.addMataKuliah(KSI);
        mahasiswaBaru.addMataKuliah(RPL);
        mahasiswaBaru.addMataKuliah(AI);
        mahasiswaBaru.addMataKuliah(PROBSTAT);

        // Menampilkan PRINT detail mahasiswa
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>  DETAIL MAHASISWA <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        mahasiswaBaru.printDetailMhs();

        // Menampilkan FET jumlah mata kuliah yang diambil
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>  JUMLAH MATKUL <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(mahasiswaBaru.getJumlahMatKul());

        // Menampilkan GET jumlah SKS yang diambil
        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>  JUMLAH SKS <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(mahasiswaBaru.getJumlahSKS());
    }
}
