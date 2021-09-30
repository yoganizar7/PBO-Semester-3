/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoga Nizar H
 */
import java.util.*;

public class BukaTutupJalan {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int plat1, plat2, plat3, plat4;
		String gabung;
		
		plat1 = sc.nextInt();
		plat2 = sc.nextInt();
		plat3 = sc.nextInt();
		plat4= sc.nextInt();
		
		
		gabung = String.valueOf(plat1) + String.valueOf(plat2) + String.valueOf(plat3) + String.valueOf(plat4);
	
		long semuaplat = Long.parseLong(gabung);
		semuaplat = semuaplat - 999999;
		byte modulo = (byte)(semuaplat % 5);	
		if (modulo == 0) {
			System.out.println("Berhenti");
		}
		else if (modulo != 0) {
			System.out.println("Jalan");
		}
	}
}
