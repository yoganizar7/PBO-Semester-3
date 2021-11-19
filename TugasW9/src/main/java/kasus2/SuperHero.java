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
import java.util.ArrayList;
import java.util.List;

public abstract class SuperHero {
	private int powerLevel;
	private String name;
	private List<Power> powerList;
	
	public SuperHero(int lvl, String name) {
		this.powerLevel = lvl;
		this.name = name;
		this.powerList = new ArrayList<Power>();
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public void addPower(Power power) {
		powerList.add(power);
	}
	
	public abstract void identity();
	
	public void showPowers() {
		System.out.println("TIME TO SHOW YOU MY POWERS");
		for(Power power : powerList) {
			power.doPower();
		}
	}
}