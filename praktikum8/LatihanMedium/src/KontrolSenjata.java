/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Victus by HP Gaming
 */

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah) {
        senjata.setPeluru(senjata.getPeluru() + jumlah);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");

        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return; // Tidak lanjut menembak kalau peluru awal 0
        }

        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }

        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("Jleb!");
        } else {
            System.out.println("Bayonet belum terpasang");
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
}



