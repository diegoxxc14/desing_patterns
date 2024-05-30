package com.example;

import java.util.List;
import java.util.stream.Collectors;

public class Example {

    // 1. M�todo para sumar dos n�meros
    public int sumar(int a, int b) {
        return a + b;
    }

    // 2. M�todo que lanza una excepci�n si el argumento es negativo
    public boolean checkPositivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El n�mero no puede ser negativo");
        }
        return true;
    }

    // 3. M�todo para contar el n�mero de letras 'a' en una cadena
    public int contarLetrasA(String cadena) {
        return (int) cadena.chars()
                .filter(letra -> letra == 'a')
                .count();
    }

    // 4. M�todo que retorna un valor booleano si la lista contiene el elemento
    public boolean contieneElemento(List<String> lista, String elemento) {
        return lista.contains(elemento);
    }

    // 5. M�todo para revertir una cadena
    public String revertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // 6. M�todo que calcula el factorial de un n�mero
    public long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Factorial no definido para n�meros negativos");
        }
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // 7. M�todo para verificar si un n�mero es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. M�todo que simula un retraso y retorna un mensaje
    public String mensajeConRetraso() throws InterruptedException {
        Thread.sleep(5000);
        return "Listo despu�s de retraso";
    }

    // 9. M�todo para convertir una lista de enteros a lista de strings
    public List<String> convertirAString(List<Integer> lista) {
        return lista.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    // 10. M�todo que calcula la media de una lista de enteros
    public double calcularMedia(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede ser nula o vac�a");
        }
        return lista.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
    }

    // 11. M�todo para convertir una lista de enteros a lista de strings
    public String convertirListaAString(List<String> lista) {
        return lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
    }
}
