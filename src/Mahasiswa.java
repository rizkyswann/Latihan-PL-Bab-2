import java.utill.Scanner;
public class Mahasiswa {
	Scanner masukan = new Scanner (System.in);
	String nama_mahasiswa, nim;
	double jarak, jumlahPutaran, jumlah_waktu;
	int keliling, jumlah_mahasiswa;

public void dataMhs(int jumlah_mahasiswa, String nama_mahasiswa, String nim, double jumlahPutaran, double jumlah_waktu){
	this.nama_mahasiswa = nama_mahasiswa;
	this.nim = nim;
	this.jumlahPutaran = jumlahPutaran;
	this.jumlah_waktu = jumlah_waktu;
	this jumlah_mahasiswa = jumlah_mahasiswa;
}

public void hitungJarak (int p, int l){
	keliling = 2*(p+l);
	jarak = this.jumlahPutaran*keliling;
}

public void displayData(){
	System.out.printf("%s %.0f \n",nama_mahasiswa,jarak);
}

public double hitungPemenang(){
	return jarak/this.jumlah_waktu;
}

public boolean perbandinganWaktu (Mahasiswa mhs){
	return (hitungPemenang() > mhs.hitungPemenang())? true:false;
}

public String displayNama(){
	return nama_mahasiswa;
}
}