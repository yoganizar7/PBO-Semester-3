/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dependence;

/**
 *
 * @author Yoga Nizar H
 */
public class Main{
public static void main(String[] args) {
        Customer pelanggan1 = new Customer();
        Customer pelanggan2 = new Customer();
        pelanggan1.setCustomerId(1);
        pelanggan1.setCustomerName("Agoy");
        pelanggan2.setCustomerId(2);
        pelanggan2.setCustomerName("Ganteng");
        
        Order wira1 = new Order(pelanggan1);
        Order wira2 = new Order(pelanggan2);
    }
}