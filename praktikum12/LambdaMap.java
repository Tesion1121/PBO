import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map untuk menampilkan key (NIM) dan value (nama mahasiswa).
 */
public class LambdaMap {
    public static void main(String[] args) {
        // Buat dan isi Map<NIM, Nama>
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123140166", "Adi");
        mahasiswaMap.put("24060123140172", "Bambang");
        mahasiswaMap.put("240601231300121", "Cici");
        mahasiswaMap.put("240601231200191", "Didi");

        // Gunakan ekspresi lambda untuk menampilkan setiap entry di Map
        mahasiswaMap.forEach((nim, nama) ->
            System.out.println("NIM: " + nim + "  |  Nama: " + nama)
        );
    }
}
