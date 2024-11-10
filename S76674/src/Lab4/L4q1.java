/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L4q1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);//Scanner ___ = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");//PROMPT user to enter first int
        int num1 = input.nextInt();//READ num1
        
        System.out.print("Enter second integer: ");//PROMPT user to enter sec int
        int num2 = input.nextInt();//READ num2
        
        int square1=num1*num1;
        int square2=num2*num2;
        
        int sumSquare=num1+num2;
        
        int diffSquare=num1-num2;
        
        /**display style1
        System.out.print(square1);
        System.out.print(square2);
        System.out.print(sumSquare);
        System.out.print(diffSquare); **/
        //display style2
        System.out.println("The square of " +num1+ " is: " +square1);
        System.out.println("The square of " +num2+ " is: " +square2);
        
        System.out.println("The sum of the square is: " +sumSquare);
        System.out.println("The difference of the square is: " +diffSquare);
    }
}
