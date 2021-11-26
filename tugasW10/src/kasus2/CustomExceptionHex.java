package kasus2;

import java.util.Scanner;
public class CustomExceptionHex {

	public static int cekHexa2Dec(String hexa) {
	    try {
	        return Integer.parseInt(hexa, 16);
	    } catch (NumberFormatException ex) {
	        return 0;
	    }
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Karakter / Bilangan: ");
		String hexaDec = input.next();
		input.close();
		
		int cekHexa = cekHexa2Dec(hexaDec);
		if(cekHexa != 0) { // jika input merupakan hexadesimal
			System.out.println(hexaDec + " merupakan bilangan hexadesimal");
			System.out.println("Nilai desimal: " + cekHexa);
		}else { // jika input bukan merupakan hexadesimal
			System.out.println(hexaDec + " bukan merupakan bilangan hexadesimal");
		}
	}
}