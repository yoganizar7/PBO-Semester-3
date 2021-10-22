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
import java.io.*;
import java.util.*;

public class Employee {  
int id;  
String name;  
Address address;  
  
public Employee(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.kota+" "+address.provinsi+" "+address.negara);  
}  
  

} 