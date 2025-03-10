/*
Nama File   : Tiket.java
Deskripsi   : Kelas yang menangani pemesanan tiket dengan validasi menggunakan assertion untuk jumlah tiket dan e-wallet yang dipilih.
Pembuat     : Khairiya Fatih Izzudin Emarin
Tanggal     : 08/03/2025
*/

public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket) {
        // Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 100;

        // To Do: Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert jumlahTiket > 0 : "Jumlah pemesanan harus lebih dari 0";

        // To Do: Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert jumlahTiket <= tiketTersedia : "Jumlah pemesanan tidak boleh melebihi tiket yang tersedia";

        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

    public static void isEWallet(int EWallet) {
        // To Do: Memeriksa apakah index e-wallet yang dipilih valid
        boolean isValid = (EWallet >= 1 && EWallet <= 4);

        // To Do: Assertion untuk memastikan e-wallet yang dipilih valid
        assert isValid : "Pilihan e-wallet tidak valid";

        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

    private static String getEWallet(int index) {
        switch (index) {
            case 1: return "OVO";
            case 2: return "GoPay";
            case 3: return "DANA";
            case 4: return "LinkAja";
            default: return "";
        }
    }
}
