/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yoga Nizar H
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Berhitung {
    public static void main(String[] argss){
        String[] number;
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            number = (input.readLine().split("\\s+"));
            if(Integer.parseInt(number[0]) >= 1 && Integer.parseInt(number[2]) <= 1000){
                switch (number[1]) {
                    case "+":
                        System.out.println(Integer.parseInt(number[0]) + Integer.parseInt(number[2]));
                        break;
                    case "-":
                        System.out.println(Integer.parseInt(number[0]) - Integer.parseInt(number[2]));
                        break;
                    case "*":
                        System.out.println(Integer.parseInt(number[0]) * Integer.parseInt(number[2]));
                        break;                
                    case "/":
                        System.out.println(Integer.parseInt(number[0]) / Integer.parseInt(number[2]));
                        break;
                    case "%":
                        System.out.println(Integer.parseInt(number[0]) % Integer.parseInt(number[2]));
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("invalid number please do the instructions (1 ≤ A, B ≤ 1.000)");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
