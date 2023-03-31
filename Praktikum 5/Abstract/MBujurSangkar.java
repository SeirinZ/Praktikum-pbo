/*
* Nama File : MBujurSangkar.java
* Nama      : Satria bintang adyatma Putra
* NIM       : 24060121140099
* Tanggal   : 27/03/2023
* Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
* Lab	    : B1
*/

import java.util.Scanner;

class MBujurSangkar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+
				" satuan adalah "+bs.hitungLuas(sisi));
	}
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs