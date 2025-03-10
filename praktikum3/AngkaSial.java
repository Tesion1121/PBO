public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"Bukan angka sial");
    }
    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //methode getMessafe( telah ada pada kelas "Exception)
            System.out.println(ase.getMessage());
            System.out.println("Hati hati memasukan angka !!!");
        }
    }
}

//PERTANYAAN:
/*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
Jelaskan pada lembar praktikum anda !*/

//Jawaban:
/*
1.Apakah baris 12 dieksekusi?
Baris 12:

############################################
System.out.println(angka+"Bukan angka sial");
############################################
Ya, baris ini akan dieksekusi jika angka bukan 13 karena tidak ada exception yang dilempar.
Tidak, jika angka == 13, maka baris ini tidak akan dieksekusi karena sebelum sampai ke baris 12, exception AngkaSialException sudah dilempar pada baris 8, sehingga aliran program langsung berpindah ke blok catch.

2.Apakah baris 21 dieksekusi?
Baris 21:
############################################
as.cobaAngka(12);
############################################

Tidak, baris ini tidak akan dieksekusi karena exception terjadi saat as.cobaAngka(13), yang menyebabkan aliran program langsung berpindah ke blok catch.
Program tidak akan kembali ke eksekusi normal setelah menangani exception, sehingga as.cobaAngka(12); tidak diproses.

*/
