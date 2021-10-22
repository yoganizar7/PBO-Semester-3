/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author Yoga Nizar H
 */
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Siswa S1 = new Siswa("Yoga", "201511064");
		Siswa S2 = new Siswa("Nizar", "2015110641");
		Siswa S3 = new Siswa("Habibulloh", "2015110642");
		Siswa S4 = new Siswa("Yoga Nizar Habibulloh", "2015110643");

		List<Siswa> s_siswa = new ArrayList<Siswa>();
		s_siswa.add(S1);
		s_siswa.add(S2);
		s_siswa.add(S3);
		s_siswa.add(S4);
		Kelas kelas = new Kelas(s_siswa);
		List<Siswa> s_swa = kelas.getTotalSiswaDiKelas();
		for(Siswa swa : s_swa){
		System.out.println("Nama : " + swa.nama + " dan "
		+" NISN : " + swa.NISN);
		}
	}

}