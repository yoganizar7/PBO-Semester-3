/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Association;

/**
 *
 * @author Yoga Nizar H
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sekolah skl = new Sekolah("SMAN 1 Bandung");
		Siswa siswa= new Siswa("Yoga Nizar H");
		siswa.setNISN("00220113495");
		System.out.println("Nama :" +siswa.getnamasiswa());
		System.out.println("NISN :" +siswa.getNISN()+"\nMerupakan siswa dari");
		System.out.println(skl.getNamaSekolah());
		
	}

}