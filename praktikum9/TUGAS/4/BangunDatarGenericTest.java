package TUGAS.4;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        System.out.println("=== Lingkaran ===");
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran: " + bdg.hitungKeliling());
        System.out.println("Luas Lingkaran: " + bdg.hitungLuas());
        System.out.println("Tipe Generic: " + bdg.get().getClass().getName());

        System.out.println("\n=== Persegi ===");
        Persegi p = new Persegi(4);
        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<Persegi>();
        bdg2.set(p);
        System.out.println("Keliling Persegi: " + bdg2.hitungKeliling());
        System.out.println("Luas Persegi: " + bdg2.hitungLuas());
        System.out.println("Tipe Generic: " + bdg2.get().getClass().getName());

        System.out.println("\n=== Segitiga ===");
        Segitiga s = new Segitiga(3, 4); // asumsi: alas=3, tinggi=4
        BangunDatarGeneric<Segitiga> bdg3 = new BangunDatarGeneric<Segitiga>();
        bdg3.set(s);
        System.out.println("Keliling Segitiga: " + bdg3.hitungKeliling());
        System.out.println("Luas Segitiga: " + bdg3.hitungLuas());
        System.out.println("Tipe Generic: " + bdg3.get().getClass().getName());

        System.out.println("\n=== Persegi Panjang ===");
        PersegiPanjang pp = new PersegiPanjang(5, 4);
        BangunDatarGeneric<PersegiPanjang> bdg4 = new BangunDatarGeneric<PersegiPanjang>();
        bdg4.set(pp);
        System.out.println("Keliling Persegi Panjang: " + bdg4.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + bdg4.hitungLuas());
        System.out.println("Tipe Generic: " + bdg4.get().getClass().getName());
    }
}
