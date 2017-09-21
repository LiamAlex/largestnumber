/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author daley
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        System.out.printf("enter the first number: ");
        double number1=keyboard.nextDouble();
        System.out.printf("enter the secound number: ");
        double number2=keyboard.nextDouble();
        System.out.printf("enter the third number: ");
        double number3=keyboard.nextDouble();
        System.out.printf("The largest number is %s", largestNumber(number1, number2, number3));
    }
    public static double largestNumber (double n1, double n2, double n3)
    {
        double large =1;
        if(n1>=n2 && n1>=n3)
            large = n1;
        if(n2>=n1 && n2>n3)
            large = n2;
        if(n3>n1 && n3>=n2)
            large =n3;
        return(large);
    }
    
}
