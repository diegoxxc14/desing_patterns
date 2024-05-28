package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    
    @Test
    public void testSumar() {
        // Given - Teniendo
        Example ex = new Example();
        int numA = 3;
        int numB = 4;
        
        // When - Cuando
        int res = ex.sumar(numA, numB);
        
        // Then - Entonces
        assertNotNull(res);
        assertInstanceOf(Integer.class, res);
        assertEquals(7, res);
    }
    
    @Test
    public void testCheckPositivo(){
        Example ex = new Example();
        int num = 4;
        
        boolean res = ex.checkPositivo(num);
        
        assertTrue(res);
    }
    
    @Test
    public void testCheckPositivoError(){
        // Given
        Example ex = new Example();
        int num = -2;
        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            ex.checkPositivo(num);
        });
    }
    
    public void testContarLetrasA() {
        Example ex = new Example();
        String cad = "ala";
        
        int res = ex.contarLetrasA(cad);
        
        assertEquals(2, res);
    }
}
