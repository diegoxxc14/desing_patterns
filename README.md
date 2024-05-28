El directorio **test** debe ser igual al del **main** principal
Valor esperado
Valor actual
Por defecto todos los test unitarios pasan OK

Algunos tipos de Assert
    assertEquals(8, res);
    assertTrue(res > 2); // Valida si es verdadero
    assertFalse(res < -1);
    assertNotNull(res); // Valida que no sea null
    assertInstanceOf(Integer.class, res); // Validar el tipo de objeto
    assertThrows(expectedType, executable) // Validar excepciones

Siempre que el método a testear tenga condicionales (if) hay branches