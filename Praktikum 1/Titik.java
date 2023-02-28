/*
* Nama File : Titik.java 
* Nama/NIM  : Satria Bintang Adyatma Putra/24060121140099
* Tanggal   : 28/02/2023
* Deskripsi : Kelas yang berisi program utama yang memanfaatkan kelas Titik
*/

class Titik {
	Double absis;
	Double ordinat;
	static int counterTitik;

	Titik(){
		counterTitik++;
	}

	void setAbsis(Double a) {
		absis = a;
	}

	void setOrdinat(Double o) {
		ordinat = o;
	}
	Double getAbsis(){
		return absis;
	}
	Double getOrdinat(){
		return ordinat;
	}
	static int getCounterTitik(){
		return counterTitik;
	}

}
