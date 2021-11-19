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
public class Rectangle extends Shape{
	
	private double length;
	private double width;
	
	public Rectangle(double l, double w) { // constructor
		super("Rectangle");
		length = l;
		width = w;
	}
	
	@Override
	public double area() { // return the surface area of the rectangle
		return length*width;
	}
	
	public String toString() { // return the rectangle as a string
		return super.toString() + " of length " + length + " and width " + width;
	}
}