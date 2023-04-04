/*
* Nama File : AngkaSialException.java
* Nama      : Satria Bintang Adyatma Putra
* NIM       : 24060121140099
* Tanggal   : 29/03/2023
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
* Lab		: B1
*/

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial!!!");
    }
}