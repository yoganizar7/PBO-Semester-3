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
public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public Cylinder(double r, double h) { // constructor
		super("Cylinder");
		radius = r;
		height = h;
	}
	
	@Override
	public double area() { // return the surface area of the Cylinder
		return Math.PI*radius*radius*height;
	}
	
	public String toString() { // return the Cylinder as a string
		return super.toString() + " of radius " + radius + " and height " + height;
	}
}