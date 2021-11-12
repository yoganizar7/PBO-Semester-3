/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat73;
public class Commission extends Hourly {

	private double total_sales;
	private double commission_rate;
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commission) {
		 super(eName, eAddress, ePhone, socSecNumber, rate);
		 commission_rate = commission;
	}
	public void addSales(double sale) {
		total_sales = sale;
	}
	public double pay() {
		double payment = super.pay() + (super.pay() * commission_rate);
		return payment;
	}
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sale: " + total_sales;
		return result;
	}
	
}