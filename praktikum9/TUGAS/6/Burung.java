
public class Burung extends Anabul {
    public Burung() {}

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
