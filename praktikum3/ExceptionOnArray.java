/*
nama File   :  ExceptionOnArray.java
Deskripsi   :   program penggunaan eksepsi menggunakan class library java
Pembuat     :   Khairiya fatih izzudin emarin
Tanggal     :   8/03/2025
*/

public class ExceptionOnArray {
    public static void main(String [] args){
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; 
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace(); 
        } finally {
            System.out.println("Clean up code..."); 
        }
    }
}
