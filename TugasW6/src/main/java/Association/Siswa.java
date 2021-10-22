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
public class Siswa {
	private String nama;
	private String NISN;
	
	Siswa(String nama) {
		this.nama = nama;
	}
	
	public void setNISN(String NISN) {
		this.NISN = NISN;
	}
	
	public String getnamasiswa() {
		return this.nama;
	}
	
	public String getNISN() {
		return this.NISN;
	}
}