/*
nama File   :   Mtitik.java
Deskripsi   :   implementasi dari file titik
Pembuat     :   Khairiya fatih izzudin emarin
Tanggal     :   19/02/2025
*/

public class Mtitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setabsis(3);
        T1.setordinat(4);
        
        System.out.println("\n===== Titik T1 Awal =====");
        T1.printitik();
        
        T1.geser(3, 4);
        System.out.println("\n===== Titik T1 Setelah Digeser =====");
        T1.printitik();

        // Titik T2
        Titik T2 = new Titik(3, 5);

        /* COUNTER TITIK */
        System.out.println("\n--------------------------------------------------");
        System.out.println("Jumlah Objek Titik Saat Ini:");
        System.out.println("Jumlah Objek Titik = " + Titik.getcountertitik());
        System.out.println("Jumlah Objek Titik = " + T2.getcountertitik());
        Titik T3 = new Titik(3, 10);

        /* KUADRAN */
        System.out.println("\n--------------------------------------------------");
        System.out.println("KUADRAN TITIK");
        System.out.println("--------------------------------------------------");
        T3.printitik();
        System.out.println("Titik T3 ada di kuadran: " + T3.getkuadran());

        /* JARAK */
        System.out.println("\n--------------------------------------------------");
        System.out.println("JARAK TITIK");
        System.out.println("--------------------------------------------------");
        System.out.println("Jarak titik T3 ke pusat adalah " + T3.getjarakpusat());
        System.out.println("Jarak T3 dan T1 adalah: " + T3.getjarak(T1));

        /* REFLEKSI */
        System.out.println("\n--------------------------------------------------");
        System.out.println("REFLEKSI TITIK");
        System.out.println("--------------------------------------------------");
        System.out.println("Nilai T3 sebelum refleksi X:");
        T3.printitik();
        T3.refleksiX();
        System.out.println("Nilai T3 sesudah refleksi X:");
        T3.printitik();

        System.out.println("\nNilai T2 sebelum refleksi Y:");
        T2.printitik();
        T2.refleksiY();
        System.out.println("Nilai T2 sesudah refleksi Y:");
        T2.printitik();

        Titik T4 = T3.getRefleksiX();
        System.out.println("\nGet Refleksi T3 (kembali sebelum refleksi X disimpan di T4):");
        T4.printitik();

        Titik T5 = T2.getRefleksiY();
        System.out.println("\nGet Refleksi T2 (kembali sebelum refleksi Y disimpan di T5):");
        T5.printitik();

        System.out.println("\nProgram selesai.");
    }
}
