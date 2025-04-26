package A9B;
public class Kucing extends Anabul {

    // Konstruktor tanpa parameter
    public Kucing() {
    }

    // Konstruktor dengan parameter
    public Kucing(String nama) {
        super(nama);
    }

    // Override method gerak
    @Override
    public void gerak() {
        System.out.println("polah");
    }

    // Override method bersuara
    @Override
    public void bersuara() {
        System.out.println("Kucing berkata: Meong~");
    }
}

