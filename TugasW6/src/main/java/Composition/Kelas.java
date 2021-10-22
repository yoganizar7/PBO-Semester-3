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

public class Kelas {
	private final List<Siswa> s_siswa;
		Kelas(List<Siswa> s_siswa)
	{
	this.s_siswa = s_siswa;
	}
	public List<Siswa> getTotalSiswaDiKelas(){
	return s_siswa;
	}

}