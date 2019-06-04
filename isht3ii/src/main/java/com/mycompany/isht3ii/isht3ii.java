/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

import Palindro.Palindromes;

/**
 *
 * @author ricardo
 */
public class isht3ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Palindromes variables = new Palindromes ();
        
          System.out.println("Palindrome 1"+variables.evaluate("oso"));
         System.out.println("Palindrome 2"+variables.evaluate("ojo"));
         System.out.println("Palindrome 3"+variables.evaluate("oro"));
          System.out.println("Palindrome 4"+variables.evaluate("oruro"));
           System.out.println("Palindrome 5"+variables.evaluate("radar"));
            System.out.println("Palindrome 6"+variables.evaluate("rallar"));
             System.out.println("Palindrome 7"+variables.evaluate("somos"));
              System.out.println("Palindrome 8"+variables.evaluate("sus"));
               System.out.println("Palindrome 9"+variables.evaluate("aba"));
                System.out.println("Palindrome 10"+variables.evaluate("ama"));
    }
    
}
