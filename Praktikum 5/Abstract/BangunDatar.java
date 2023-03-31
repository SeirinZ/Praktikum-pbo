
/*
*BangunDatar.java 12/11/11
* Penulis: Satria Bintang Adyatma Putra
* NIM : 24060121140099
* Deskripsi: kelas abstrak, berisi abstraksi bangun datar
*/

package org.bangundatar.BangungDatar;

public abstract class BangunDatar{
	
	protected double luas;
	
	public abstract double hitungLuas (double sisi);
	
	public void setLuas (double a) {
		luas = a;
	}

	public double getLuas (){
		return luas;
	}
}