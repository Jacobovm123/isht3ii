/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palindro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ricardo
 */
public class PalindromesTest {
    
  
    

    @Test
    public void testEvaluate() {
        System.out.println("prueba de palindromo impar ");
        String word = "ala";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result); 
        
    }
    
    
    
    @Test
    public void testEvaluatePar() {
        System.out.println("prueba de palindromo par ");
        String word = "raddar";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
     
    
     
    @Test
    public void testEvaluateCadenavacia() {
        System.out.println("cadena vacia");
        String word = "";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
    
     @Test
    public void testIncorrecta() {
        System.out.println("prueba de palindromo par incorrecta ");
        String word = "Raddar";
        Palindromes instance = new Palindromes();
        boolean expResult = false;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testCarecterEspacio() {
        System.out.println("prueba de espacio");
        String word = " ";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testTab() {
        System.out.println("prueba de tabulador ");
        String word = " ";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
    
      @Test
    public void testCambioLinea() {
        System.out.println("prueba cambio de linea");
        String word = "\n";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
      @Test
    public void testBinario() {
        System.out.println("prueba de binario ");
        String word = "0110";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
}
