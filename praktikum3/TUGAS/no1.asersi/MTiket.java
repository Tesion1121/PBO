import java.util.Scanner;

public class MTiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tiketTersedia = 10; // Misalnya tersedia 10 tiket

        System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
        int jumlahTiket = scanner.nextInt();

        // Validasi jumlah tiket
        if (jumlahTiket < 1 || jumlahTiket > tiketTersedia) {
            System.out.println("Pemesanan gagal! Jumlah tiket tidak valid.");
            return; // Menghentikan program jika input salah
        }

        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");

        System.out.println("Pilih e-wallet yang akan digunakan:");
        System.out.println("1. OVO");
        System.out.println("2. GoPay");
        System.out.println("3. DANA");
        System.out.println("4. LinkAja");

        System.out.print("Pilih e-wallet (1-4): ");
        int pilihan = scanner.nextInt();

        // Validasi pilihan e-wallet
        if (pilihan < 1 || pilihan > 4) {
            System.out.println("Pilihan e-wallet tidak valid.");
            return; // Menghentikan program jika input salah
        }

        System.out.println("E-wallet berhasil dipilih.");
    }
}
