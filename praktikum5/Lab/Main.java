package Lab;

import Lab.BangunDatar;
import Lab.Persegi;
import Lab.Lingkaran; //saya pakai import karena vscode saya error kak

public class Main {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10, 4, "Merah", "Putih");
        Persegi P2 = new Persegi(5, 4, "Hijau", "Hitam");
        BangunDatar L1 = new Lingkaran(7, 0, "Biru", "Kuning");
        Lingkaran L2 = new Lingkaran(14, 0, "Ungu", "Putih");

        System.out.println("P1 (Persegi) - Luas: " + P1.getLuas() + ", Keliling: " + P1.getKeliling());
        System.out.println("P2 (Persegi) - Luas: " + P2.getLuas() + ", Keliling: " + P2.getKeliling());
        System.out.println("L1 (Lingkaran) - Luas: " + L1.getLuas() + ", Keliling: " + L1.getKeliling());
        System.out.println("L2 (Lingkaran) - Luas: " + L2.getLuas() + ", Keliling: " + L2.getKeliling());

        P1.printInfo();
        P2.printInfo();
        L1.printInfo();
        L2.printInfo();

        System.out.println("Apakah P1 dan P2 memiliki luas yang sama? " + P1.isEqualLuas(P2));
        System.out.println("Apakah L1 dan L2 memiliki keliling yang sama? " + L1.isEqualKeliling(L2));
    }
}