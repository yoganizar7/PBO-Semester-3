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
public class Order {
    public int OrderCustomerId;
    public String OrderName;

    public Order(Customer customer) {
        OrderCustomerId = customer.getCustomerId();
        OrderName = customer.getCustomerName();

        System.out.println(OrderName);
        System.out.println(OrderCustomerId);
    }
}