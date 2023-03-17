package com.mycompany.app;

public class Calculator {
    // diferencia entre clase y objeto..... 
    // clase plano de como se va a comportar el objeto (blueprint),, 
    // objeto:la instancia de una clase que está dentro del tiempo de 
    // ejecucion de un programa. 
    public Calculator(){} //constuctor

    public int add(int numberOne, int numberTwo) throws AddOperationException{
        int result = numberOne + numberTwo;
        //if numberone + numberto >= 100 :: result = -1 
        if (numberOne <=0 || numberTwo <= 0){
            throw new AddOperationException("Los valores negativos no son permitidos");
        }
        if (result >= 100){
            return -1;
        }
        
        return result;
    }

}
