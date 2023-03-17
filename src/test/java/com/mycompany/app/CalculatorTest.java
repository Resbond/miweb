package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * El requerimiento
 * la calculadora debe tener la funcion de sumar dos valores proporcionados por el usuario
 * y cumplir con las siguientes validaciones
 *-Si la suma de ambos valores da mas de 100, debe retornar =-1
 *-Si alguno de los valores ingresados es negativo debe retornar =-1
 *
 */
public class CalculatorTest {
    
    @Test
    public void addTwoNumbers_Success() throws AddOperationException{
        //Arrange (defición del estado de objetos a participar en la prueba)
        int numberOne = 1;
        int numberTwo = 2;
        int resultExpected = 3 ;

        //Actc (donde ejecuto la función que quiero probar)
        Calculator calculator = new Calculator();
        int result = calculator.add(numberOne, numberTwo);
        
        //Asert (validación)
        assertEquals(resultExpected, result);
    }
    @Test
    public void addTwoHugeNumbers_Failed() throws AddOperationException{
        //Arrange
        int numberOne = 60;
        int numberTwo = 70;
        int resultExpected = -1;
        //Act
        Calculator calculator = new Calculator();
        int result = calculator.add(numberOne, numberTwo);
        //Assert
        assertEquals(resultExpected, result);
    }
    @Test(expected = AddOperationException.class)
    public void addOneNegativeNumberOnePositiveNumber_Failed() throws AddOperationException{
        //Arrange
        int numberOne = -9;
        int numberTwo = 2;
        //Act
        Calculator calculator = new Calculator();
        calculator.add(numberOne, numberTwo);
        //Assert
    }
    
    //el usuario quiere: suma un 8 mas un -1 y espera un -1 de resultado;
    @Test(expected = AddOperationException.class)
    public void addOneNegativeNumberOnTheEquation_Failed() throws AddOperationException{
        //Arrange
        int numberOne = 8;
        int numberTwo = -1;
        //Act
        Calculator calculator = new Calculator();
        calculator.add(numberOne, numberTwo);
        //Assert
    }
}
