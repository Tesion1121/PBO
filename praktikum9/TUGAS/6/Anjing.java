public class Anjing extends Anabul {
    public Anjing() {}

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Anjing melata dengan semangat.");
    }

    @Override
    public void bersuara() {
        System.out.println("Anjing menggonggong: Guk-Guk!");
    }
}
