/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus1;

/**
 *
 * @author Yoga Nizar H
 */
public abstract class Shape {
	// instance variable
	private String shapeName;
	
	// abstract method
	public abstract double area();
	
	// constructor method, set the shape name
	public Shape(String name) {
		this.shapeName = name;
	}
	
	// toString method, return the name of the shape
	public String toString() {
		return shapeName;
	}
}