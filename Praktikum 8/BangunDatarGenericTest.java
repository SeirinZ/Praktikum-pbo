/** 
File      : BangunDatarGenericTest.java
Pembuat   : Satria Bintang Adyatma Putra
NIM       : 24060121140099
Tanggal   : 20 Mei 2023
Lab       : B1
Deskripsi : main class untuk generic bangun datar
**/

public class BangunDatarGenericTest{
    public static void main(String[] args){
        Lingkaran lingkaran = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = 
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(lingkaran);
        System.out.println("keliling lingkaran : "
                                    +bdg.hitungKeliling());
        System.out.println("tipe generic : "
                            +bdg.get().getClass().getName());
    }
}