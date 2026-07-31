/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basiccalculator;

import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class BasicCalculator {

    /**
     * @param args the command line arguments
     * this is a basic calculator. You need to be able to preform basic calculations
     * use arithmetic operations 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum;
        int secondNum;
        String operater;
        double result;
        
        
        System.out.println("Insert Fist Number: ");
        firstNum = sc.nextInt();
        
         System.out.println("Insert second Number: ");
        secondNum = sc.nextInt();
        
        System.out.println("Insert an operation: ");
        operater = sc.next();
       
        switch(operater){
            case "+":
                result = firstNum + secondNum;
                System.out.println("result: " + result);
                break;
            case "-":
                result = firstNum - secondNum;
                System.out.println("result: " + result);
                break;
            case "*":
                result = firstNum * secondNum;
                System.out.println("result: " + result);
                break;
            case "/":
                if (secondNum != 0){
                    result = firstNum / secondNum;
                    System.out.println("result: " + result);
            } else{
                System.out.println("Invalid input - cannot devide a number by 0");
             
                }
                break;
                default:
                System.out.println("Invalid operator.");
                break;
          
    }//switch
    
} //main
} //class
