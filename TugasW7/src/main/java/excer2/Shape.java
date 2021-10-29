/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excer2;

/**
 *
 * @author Yoga Nizar H
 */
public class Shape {
	private String color;
	private boolean filled;

	public Shape() { // 1st no-arg constructor
		color = "green";
		filled = true;
	}
	
	public Shape(String color, boolean filled) { // 2nd constructor
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		if(isFilled() == true)
			return "A Shape with color of " + color + " and filled";
		else
			return "A Shape with color of " + color + " and not filled";
	}
	
}