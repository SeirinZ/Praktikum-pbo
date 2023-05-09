/*
File    : Manajer.java
Pembuat : Satria Bintang Adyatma Putra/24060121140099
Tanggal : 5 Mei 2023
Lab     : B1
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}