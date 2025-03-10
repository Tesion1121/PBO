//class Lingkaran

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari =jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2{
    public static void main(String [] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran ="
        +kelilingLingkaran);
    }
}

//Jawaban: 
/* Asersi Tidak Akan Aktif Tanpa Opsi -ea

Dalam Java, asersi (assert) secara default tidak diaktifkan saat menjalankan program. Untuk mengaktifkannya, program harus dijalankan dengan opsi -ea (enable assertions). Jika tidak, asersi tidak akan dieksekusi, sehingga pengecekan jariJari > 0 tidak akan berfungsi.
Nilai jariJari Ditetapkan ke 0 Sebelum Asersi

########################################################
Pada kode:
double jariJari = 0;
assert(jariJari > 0) : "jari jari tidak boleh nol!!!";
########################################################

Asersi seharusnya digunakan untuk menangani kondisi yang tidak seharusnya terjadi. Namun, di sini jariJari secara eksplisit diset ke 0, yang bertentangan dengan asersi yang mengharuskan nilai lebih dari 0.
Solusi: Program sebaiknya meminta input pengguna atau menetapkan nilai awal yang valid.
Program Tetap Berjalan Setelah Asersi

Jika asersi gagal, program akan menghasilkan AssertionError, tetapi tetap membuat objek Lingkaran dan mencoba menghitung kelilingnya.
Solusi: Pastikan asersi digunakan pada saat yang tepat sebelum melakukan operasi lebih lanjut.
Kesalahan Penulisan Nama Metode

*/