/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat71;

/**
 *
 * @author Yoga Nizar H
 */
public class Cat extends Animal{
	public void sound() {
		System.out.println("Meow");
	}
	
	public static void main(String[] args) {
		Animal obj = new Cat();
		obj.sound();
	}
}