package tugas;



import java.time.LocalDate;

public class MainPegawai {
    public static void main(String[] args) {
        // Membuat objek Dosen Tetap
        DosenTetap dosenTetap = new DosenTetap(
                "99988887",
                "Khairiya fatih",
                LocalDate.of(2003, 5, 3),
                LocalDate.of(2020, 1, 1),
                5000000.0,
                "Fakultas Ilmu Komputer ",
                "81275089078",
                2000000.0
        );

        // Menampilkan informasi Dosen Tetap
        System.out.println("===== Dosen Tetap =====");
        dosenTetap.printInfo();
        System.out.println();

        // Membuat objek Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu(
                "84638936",
                "Kevin susanto",
                LocalDate.of(1990, 6, 12),
                "Fakultas teknik",
                LocalDate.of(2017, 3, 10),
                4500000.0,
                "898989989",
                LocalDate.of(2025, 12, 31)
        );

        // Menampilkan informasi Dosen Tamu
        System.out.println("===== Dosen Tamu =====");
        dosenTamu.printInfo();
        System.out.println();

        Tendik tendik = new Tendik(
        "123456789",
        "Jing huang",
        LocalDate.of(1992, 10, 20),
        LocalDate.of(2016, 7, 15),
        4000000.0,
        "Tendik",  // Tambahkan Jabatan
        "Kemahasiswaan"
);


        // Menampilkan informasi Tendik
        System.out.println("===== Tendik =====");
        tendik.printInfo();
        System.out.println();
    }
}
