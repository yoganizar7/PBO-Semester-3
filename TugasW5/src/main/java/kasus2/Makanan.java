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
public class Makanan {
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	public Makanan (String _namaMakanan, double _hargaMakanan, int _stok)
	{
		this.nama_makanan = _namaMakanan;
		this.harga_makanan = _hargaMakanan;
		this.stok = _stok;
	}

	public String getNama_makanan() {
		return nama_makanan;
	}
	
	public int getStok() {
		return stok;
	}

	public void TampilMakanan() {
		System.out.println(nama_makanan + "[" + stok + "]" + "Rp." + harga_makanan);
	}

	public void kurangStok(int jumlah) {
		stok -= jumlah;
	}
}