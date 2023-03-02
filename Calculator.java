public class Calculator {
    float Num1;
    float Num2;

    public Calculator(){
        Num1 = 0;
        Num2 = 0;
    }

    public Calculator(float num1, float num2) {
        Num1 = num1;
        Num2 = num2;
    }

    public float add(){
        return Num1 + Num2;
    }

    public float subs(){
        return Num1 - Num2;
    }

    public float mult(){
        return Num1 * Num2;
    }

    public float div(){
        return Num1 / Num2;
    }
}