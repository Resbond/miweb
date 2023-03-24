package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * El requerimiento
 * la calculadora debe tener la funcion de sumar dos valores proporcionados por el usuario
 * y cumplir con las siguientes validaciones
 *-Si la suma de ambos valores da mas de 100, debe retornar =-1
 *-Si alguno de los valores ingresados es negativo debe retornar =-1
 * la calculadora solo puede realizar divisiones exactas.
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

    @Test(expected = AddOperationException.class)
    public void addTwoHugeNumbers_Failed() throws AddOperationException{
        //Arrange
        int numberOne = 60;
        int numberTwo = 70;
    
        //Act
        Calculator calculator = new Calculator();
        calculator.add(numberOne, numberTwo);
        //Assert
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

    //multiplicacion de numeros enteros resultados menores a 100;
    @Test
    public void multiplyTwoNumbers_Success() throws MultiplyOperationException{
        //Arrange (defición del estado de objetos a participar en la prueba)
        int numberOne = 4;
        int numberTwo = 7;
        int resultExpected = 28 ;

        //Actc (donde ejecuto la función que quiero probar)
        Calculator calculator = new Calculator();
        int result = calculator.multiply(numberOne, numberTwo);
        
        //Asert (validación)
        assertEquals(resultExpected, result);
    }

    @Test (expected = MultiplyOperationException.class)
    public void multiplyTwoBigNumbers_Failed() throws MultiplyOperationException{
        //Arrange (defición del estado de objetos a participar en la prueba)
        int numberOne = 14;
        int numberTwo = 17;

        //Actc (donde ejecuto la función que quiero probar)
        Calculator calculator = new Calculator();
        calculator.multiply(numberOne, numberTwo);
        
        //Asert (validación)
    }
    //Solo se pueden dividir un primer numero mayor al segundo numero
    @Test
    public void divideTwoNumbers_Success() throws DivideOperationException{
        //Arrange (defición del estado de objetos a participar en la prueba)
        int numberOne = 15;
        int numberTwo = 5;
        int resultExpected = 3 ;

        //Actc (donde ejecuto la función que quiero probar)
        Calculator calculator = new Calculator();
        int result = calculator.divide(numberOne, numberTwo);
        
        //Asert (validación)
        assertEquals(resultExpected, result);
    }
    @Test(expected = DivideOperationException.class)
    public void divideOneSmallNumberToOneBigNumber_Fail() throws DivideOperationException{
        int numberOne = 3;
        int numberTwo = 7;
        Calculator calculator = new Calculator();
        calculator.divide(numberOne, numberTwo);


    }
}

