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
public class Restaurant {
		private Makanan[] menuMakanan;
		private static byte id=0;

		public Restaurant() {
			menuMakanan = new Makanan[10];
		}
		
		public void tampilMenuMakanan()
		{
			for(int i = 0; i <= id; i++)
			{
				if(!isOutOfStock(i))
				{
					this.menuMakanan[i].TampilMakanan();
				}	
			}
		}
		
		public void tambahMenuMakanan(String nama, double harga, int stok) {
			this.menuMakanan[id] = new Makanan (nama, harga, stok);
		}
		
		
		public boolean isOutOfStock(int id){
			
			return menuMakanan[id].getStok() == 0;
		}
		
		public static void nextId(){
			id++;
		}
		
		public void Pemesanan (String namaMakanan, int jumlah)
		{
			for (int i = 0 ; i <= id; i++)
			{
				if(namaMakanan.equals(menuMakanan[i].getNama_makanan()))
				{
					if(menuMakanan[i].getStok() >= jumlah)
					{
						System.out.println(jumlah + " " + menuMakanan[i].getNama_makanan() + " " + "Terjual!");
						menuMakanan[i].kurangStok(jumlah);
					}
					else System.out.println("Stok" + menuMakanan[i].getNama_makanan() + "tidak cukup !");
				}
			}
		}
}