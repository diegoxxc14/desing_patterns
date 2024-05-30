package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    
    private Example ex;

    // Se ejecuta antes de cada Test (una instancia)
    @BeforeEach
    public void init() {
        this.ex = new Example();
    }

    @Test
    public void testSumar() {
        // Given - Teniendo
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
        int num = 4;
        
        boolean res = ex.checkPositivo(num);
        
        assertTrue(res);
    }
    
    @Test
    public void testCheckPositivoError(){
        // Given
        int num = -2;
        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            ex.checkPositivo(num);
        });
    }
    
    @Test
    public void testContarLetrasA() {
        String cad = "ala";
        
        int res = ex.contarLetrasA(cad);
        
        assertNotNull(res);
        assertEquals(2, res);
    }
}
