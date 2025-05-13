
import java.util.ArrayList;

public class koleksi<K> {

    private int NbElm;
    private ArrayList<K> wadah;

    // Konstruktor
    public koleksi() {
        NbElm = 0;
        wadah = new ArrayList<>();
    }

    public K getIsi(int i) {
        if (i >= 0 && i < NbElm) return wadah.get(i);
        else return null;
    }

    public void setIsi(int i, K isi) {
        if (i >= 0 && i < NbElm) wadah.set(i, isi);
    }

    public int getSize() {
        return NbElm;
    }

    public void setSize(int size) {
        if (size >= 0) {
            NbElm = size;
            while (wadah.size() > NbElm) wadah.remove(wadah.size() - 1);
        }
    }


    public void add(K isi) {
        wadah.add(isi);
        NbElm++;
    }


    public void delete(int i) {
        if (i >= 0 && i < NbElm) {
            wadah.remove(i);
            NbElm--;
        }
    }


    public void showAll() {
        for (int i = 0; i < NbElm; i++) {
            System.out.println("Elemen ke-" + i + ": " + wadah.get(i));
        }
    }
}
