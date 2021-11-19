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
public class Sphere extends Shape{
	private double radius; // radius in feet
	
	public Sphere(double r) { // constructor
		super("Sphere");
		radius = r;
	}
	
	@Override
	public double area() { // return the surface area of the sphere
		return 4*Math.PI*radius*radius;
	}
	
	public String toString() { // return the sphere as a string
		return super.toString() + " of radius " + radius;
	}
}