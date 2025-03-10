/*
nama File   :   AngkaSialException.java
Deskripsi   :   pEksepsi buatan sendiri, menolak masukan angka 13
Pembuat     :   Khairiya fatih izzudin emarin
Tanggal     :   8/03/2025
*/

public class AngkaSialException  extends Exception{
    public AngkaSialException(){
        super("Jangan Memasukan angka 13 karena angka sial !!!");
    } 
}
