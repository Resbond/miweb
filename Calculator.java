public class Calculator {
    float numberOne;
    float numberTwo;

    public Calculator(){
        numberOne = 0;
        numberTwo = 0;
    }

    public Calculator(float n1, float n2) {
        numberOne = n1;
        numberTwo = n2;
    }

    public float addition(){
        return numberOne + numberTwo;
    }

    public float substraction(){
        return numberOne - numberTwo;
    }

    public float multiplication(){
        return numberOne * numberTwo;
    }

    public float division(){
        return numberOne / numberTwo;
    }
}