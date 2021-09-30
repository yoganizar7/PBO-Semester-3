/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoga Nizar H
 */

import java.util.Scanner;
import java.math.BigInteger;

public class BigNumber {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        BigInteger bigA = new BigInteger(A);
        BigInteger bigB = new BigInteger(B);
        
        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));
       
    }
}
