/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus2;

/**
 *
 * @author Yoga Nizar H
 */
import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		Scanner sc = new Scanner(System.in);
		String makanan;
		int pesanan;
		
		System.out.println("======Menu makanan======");
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		menu.tampilMenuMakanan();
		System.out.println("========================");
		
			System.out.println("Masukan nama makanan :");
			makanan = sc.nextLine();
			System.out.println("Jumlah makanan yang dibeli :");
			pesanan = sc.nextInt();
			System.out.println("=========================");
			menu.Pemesanan(makanan, pesanan);
			System.out.println("Stok makanan tersisa");
			menu.tampilMenuMakanan();	
	}
}