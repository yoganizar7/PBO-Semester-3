/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus3;

/**
 *
 * @author Yoga Nizar H
 */
public class Itachi extends Rikudo {
	private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu;
	
	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);
	}
	
	void printDojutsu() {
		System.out.println(this.Dojutsu);
		setDojutsu(); //untuk memanggil void setDojutsu yang isi nya memanggil Mangekyou Sharingan
		System.out.println(this.Dojutsu);
	}
	
	private void setDojutsu() {
		this.Dojutsu = "Mangekyou Sharingan";
	}
}