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
public class InputOutput {

	public static void main(String[] args) {
		String kata;
		Scanner keyboard = new Scanner(System.in);
		kata = keyboard.nextLine();
		kata.trim();
		if(kata.length()==0) {
			System.out.println("String kosong");
		}else {
			
			String[] data = kata.split("[, !._?'@]");
			System.out.println(data.length);
			int i;
			for(i=0;i<=data.length-1 ;i++) {
				System.out.println(data[i]);
				}
			}
		
		
	}
}

    

