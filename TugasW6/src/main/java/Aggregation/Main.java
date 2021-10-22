/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aggregation;

/**
 *
 * @author Yoga Nizar H
 */
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Address address1=new Address("bandung","jawa barat","indonesia");  
			Address address2=new Address("garut","jawa barat","indonesia");  
			  
			Employee e=new Employee(1,"Yoga",address1);  
			Employee e2=new Employee(2,"Nizar",address2);  
			      
			e.display();  
			e2.display();  

	}

}