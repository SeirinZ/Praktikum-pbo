/** 
File      : Lingkaran.java
Pembuat   : Satria Bintang Adyatma Putra
NIM       : 24060121140099
Tanggal   : 20 Mei 2023
Lab       : B1
Deskripsi : implementasi Lingkaran sebagai BangunDatar
**/

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungkeliling(){
        return 2*jejari*3.14;
    }
}