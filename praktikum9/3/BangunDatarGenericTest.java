public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran I = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg =
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(I);
        System.out.println("Keliling Lingkaran: "+ bdg.hitungKeliling());
        System.out.println("Tipe generic: "+ bdg.get().getClass().getName());
    
    }
    

}
