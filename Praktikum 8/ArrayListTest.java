/** 
File      : ArrayListTest.java
Pembuat   : Satria Bintang Adyatma Putra
NIM       : 24060121140099
Tanggal   : 20 Mei 2023
Lab       : B1
Deskripsi : program penggunaan objek ArrayList sebagai collection class
**/

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        //inisialisasi ArrayList yang hanya dapat berisi objek String    
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //menghapus elemen
        strings.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : strings) {
            System.out.print(s+" ");
        }
    }
}