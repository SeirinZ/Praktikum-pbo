/** 
File      : BangunDatarGeneric.java
Pembuat   : Satria Bintang Adyatma Putra
NIM       : 24060121140099
Tanggal   : 20 Mei 2023
Lab       : B1
Deskripsi : kelas konstruksi generic untuk BangunDatar
**/

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Salah satu metode untuk memberikan nama yang lebih deskriptif kepada parameter generik adalah 
//dengan mengubah karakter 'T' menjadi karakter lain, seperti T1, T2, T1234. Metode ini bertujuan 
//untuk memberikan fleksibilitas dalam penggunaan data dan juga sebagai pembeda ketika terdapat 
//lebih dari satu parameter generik dalam kelas tersebut.