/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloyou;

import java.util.Scanner;

/**
 *
 * @author blign
 */
public class HelloYou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
      
       
       System.out.println("Hello! Welcome to this very basic program!");
       System.out.println("Please input your name: ");
        String name = in.nextLine();
       
       System.out.println("Hello, " + name);
       
    }
    
}
