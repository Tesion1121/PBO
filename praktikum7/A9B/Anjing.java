package A9B;
public class Anjing extends Anabul {

    // Konstruktor tanpa parameter
    public Anjing() {
    }

    // Konstruktor dengan parameter
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing melata dengan gagah.");
    }
    @Override
    public void bersuara() {
        System.out.println("Anjing menggonggong: Guk-Guk!");
    }
}

