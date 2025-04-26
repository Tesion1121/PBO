package A9B;

public class Burung extends Anabul {

    // Konstruktor tanpa parameter
    public Burung() {
    }

    // Konstruktor dengan parameter
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Burung terbang di udara.");
    }

    @Override
    public void bersuara() {
        System.out.println("Burung berkicau: Cuit-Cuit!");
    }
}

