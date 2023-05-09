/*
Pembuat : Satria Bintang Adyatma Putra/24060121140099
Tanggal : 5 Mei 2023
Lab     : B1
 */

public class Car extends Vehicle{
    void calRent(int jarak, float harga) {
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}