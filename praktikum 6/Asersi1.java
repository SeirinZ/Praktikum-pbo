/*
* Nama File : Asersi1.java
* Nama      : Satria Bintang Adyatma Putra
* NIM       : 24060121140099
* Tanggal   : 29/03/2023
* Deskripsi : Program untuk menunjukkan asersi
* Lab		: B1
*/

public class Asersi1{
	public static void main(String[] args){
		int x=0;
		if(x>0) {
			System.out.println("x bilangan positif");
		}else{
			assert(x<0) : "ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}
