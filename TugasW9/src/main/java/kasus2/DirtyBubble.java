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
public class DirtyBubble extends SuperHero{

	public DirtyBubble(int lvl, String name) {
		super(lvl, name);
		Power strength = new Strength();
		Power fly = new Flying();
		super.addPower(strength);
		super.addPower(fly);
	}

	@Override
	public void identity() {
		System.out.println("It's "+ super.getName() + ", the DirtyBubble! "
				+ "It has the power level of " + super.getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
		
	}

}