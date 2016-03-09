import java.utill.Scanner;
public class mainProgram{
	public static void main (String [] args){
	Scanner masukan = new Scanner (System.in);
	int jumlah_mahasiswa, p, l, max=0;
	jumlah_mahasiswa = masukan.nextInt();
	p = masukan.nextInt();
	l = masukan.nextInt();

	System.out.println("##INPUT##");
	Mahasiswa mhs[] = new Mahasiswa[jumlah_mahasiswa];
	for (int a=0; a<jumlah_mahasiswa; a++){
		String nim = maukan.next();
		String nama_mahasiswa = masukan.next();
		double jumlahPutaran = masukan.nextDouble();
		double jumlah_waktu = masukan.nextDouble();
		mhs[a]= new Mahasiswa();
		mhs[a].dataMhs(jumlah_mahasiswa, nama_mahasiswa, nim, jumlahPutaran, jumlah_waktu);
		mhs[a].hitungJarak(p,l);
	}

	System.out.println("##OUTPUT##");
	for (int b=0; b<jumlah_mahasiswa; b++){
		mhs[b].displayData();
	}
	for (int k=1; k<jumlah_mahasiswa; k++){
		if (mhs[k].perbandinganWaktu(mhs[k-1]))
			max = k;
	}
	System.out.println(mhs[max].displayNama());
	}
}