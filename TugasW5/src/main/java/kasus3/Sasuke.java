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
public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	
	void printDojutsu() {
		super.printDojutsu(); //untuk menampilkan super class dari dojutsu yaitu Rinegan
		System.out.println(this.Dojutsu);
	}
}