public class Kucing extends Anabul {
    public Kucing() {}

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Kucing melata dengan anggun.");
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing berkata: Meong~");
    }
}
