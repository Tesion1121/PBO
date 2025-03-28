public class Mahasiswa extends Civitas {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    
    private static int counterMahasiswa = 0;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        nim = "";
        semester = 0;
        fakultas = new Fakultas();
        counterMahasiswa++;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMahasiswa++;
    }

    // Getter dan Setter
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }
    
    // Menghitung biaya UKT mahasiswa
    public double getBiayaUkt() {
        return fakultas.getTarifUkt() * (1 - (0.05 * semester));
    }
    
    // Menampilkan informasi mahasiswa 
    public void tampilkanInfo() {
        System.out.println("===================================");
        System.out.println("         DATA MAHASISWA          ");
        System.out.println("===================================");
        super.tampilkanInfoCivitas();
        System.out.println("NIM       : " + nim.toUpperCase());
        System.out.println("Semester  : " + semester);
        System.out.println("Fakultas  : " + fakultas.getNama().toUpperCase());
        System.out.printf("Biaya UKT : Rp%,.2f%n", getBiayaUkt());
        System.out.println("===================================");
        System.out.println();
    }
    

    
    public static void tampilkanCounter() {
        System.out.println("Jumlah Mahasiswa: " + counterMahasiswa);
    }
}
