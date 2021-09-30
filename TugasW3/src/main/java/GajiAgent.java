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

public class GajiAgent {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);		
		final int gpokok = 500000;
		final int hargaitem = 50000;
		int penjualan, bonus, denda, gakhir = 0;
		
		penjualan = keyboard.nextInt();
		if (penjualan >= 80) {
			bonus = (penjualan * hargaitem) * (35/100);
			gakhir = gpokok + bonus ;
			System.out.println(gakhir);
		} 
		else if (penjualan >= 40 && penjualan < 80) {
			bonus = (penjualan * hargaitem) * (25/100);
			gakhir = gpokok + bonus;
			System.out.println(gakhir);
		}
		else if (penjualan <= 15 && penjualan >= 1) {
			denda = ((15 * hargaitem) - (14 * hargaitem)) * 15/100;
			gakhir = gpokok - denda;
			System.out.println(gakhir);		}
		else {
			bonus = penjualan * (hargaitem * 10/100);
			gakhir = gpokok + bonus;
			System.out.println(gakhir);		}
}
}