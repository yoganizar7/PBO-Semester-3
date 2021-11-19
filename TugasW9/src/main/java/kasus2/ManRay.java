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
public class ManRay extends SuperHero{

	public ManRay(int lvl, String name) {
		super(lvl, name);
		Power laser = new LaserEye();
		Power strength = new Strength();
		super.addPower(laser);
		super.addPower(strength);
	}

	@Override
	public void identity() {
		System.out.println("It's "+ super.getName() + ", the ManRay! "
				+ "It has the power level of " + super.getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAAME IS " + super.getName().toUpperCase());
	}

}