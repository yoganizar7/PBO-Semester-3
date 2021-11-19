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
import java.text.DecimalFormat;

public class Paint {
	private double coverage; // number of square feet per gallon
	
	public Paint(double c) { // constructor
		coverage = c;
	}
	
	public double amount(Shape s) { 
		// return the amount of paint (number of gallons)
		// needed to paint the shape given as the parameter
		System.out.println("Computing amount for " + s);
		return s.area()/coverage; // corrected
		// before:
		// return 0;
	}
}