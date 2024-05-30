package com.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    
    private Example ex;

    // Se ejecuta antes de cada Test (una instancia)
    @BeforeEach
    public void init() {
        ex = new Example();
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

    @Test
    void testContieneElemento() {
        List<String> countries = new ArrayList<>(Arrays.asList("Colombia", "Ecuador", "Brazil"));
        String country = "Ecuador";

        boolean res = ex.contieneElemento(countries, country);

        assertTrue(res);
    }

    @Test
    void testRevertirCadena() {
        String cadena = "casa";

        String res = ex.revertirCadena(cadena);

        assertEquals("asac", res);
    }

    @Test
    void testFactorial() {
        int num = 5;

        long res = ex.factorial(num);

        assertEquals(120, res);
    }

    @Test
    void testFactorialError() {
        int num = -1;

        assertThrows(IllegalArgumentException.class, () -> {
            ex.factorial(num);
        });
    }

    @Test
    void testEsPrimo() {
        int num = 7;   

        boolean res = ex.esPrimo(num);

        assertTrue(res);
    }

    @Test
    void testEsPrimoMenorQueUno() {
        int num = -1;   

        boolean res = ex.esPrimo(num);

        assertFalse(res);
    }

    @Test
    void testNoEsPrimo() {
        int num = 8;   

        boolean res = ex.esPrimo(num);

        assertFalse(res);
    }

    @Test
    void testMensajeConRetraso() throws InterruptedException {
        String res = ex.mensajeConRetraso();
        
        assertInstanceOf(String.class, res);
    }

    @Test
    void testConvertirAString() {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<String> res = ex.convertirAString(nums);

        assertEquals(Arrays.asList("1","2","3","4","5","6","7","8","9","10"), res);
    }

    @Test
    void testCalcularMedia() {
        List<Integer> nums = Arrays.asList(1,2,3);

        double res = ex.calcularMedia(nums);

        assertEquals(2, res);
    }

    @Test
    void testCalcularMediaErrorNull() {
        List<Integer> nums = null;

        assertThrows(IllegalArgumentException.class, ()->{
            ex.calcularMedia(nums);
        });
    }

    @Test
    void testCalcularMediaErrorVacia() {
        //List<Integer> nums = Arrays.asList();
        List<Integer> nums = Collections.emptyList();

        assertThrows(IllegalArgumentException.class, ()->{
            ex.calcularMedia(nums);
        });
    }
}
