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

public class InputOutput2 {

	public static void main(String[] args) {
		String[] a;
		short[] b;
		a = new String[3];
		b = new short[3];
		Scanner sc = new Scanner(System.in);
		
		
		a[0] = sc.next();
		b[0] = sc.nextShort();
		a[1] = sc.next();
		b[1] = sc.nextShort();
		a[2] = sc.next();
		b[2] = sc.nextShort();
		
		System.out.println("================================");
		int i;
		for(i=0;i<=2; i++) {
			
			System.out.printf("%-15s%03d\n", a[i], b[i]);
		}
		System.out.println("================================");
		
	}

}