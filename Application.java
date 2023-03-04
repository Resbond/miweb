import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        float numberOne = 0;
        float numberTwo = 0;
        int symbol = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número");
        numberOne = sc.nextFloat();
        System.out.println("Digite el segundo número");
        numberTwo = sc.nextFloat();
        System.out.println("Digite el numero de la operacion a realizar");
        symbol = sc.nextInt();

        Calculator operation = new Calculator(numberOne, numberTwo);
        float result = 0;

        switch(symbol){
            case 1: result = operation.addition(); break;
            case 2: result = operation.substraction(); break;
            case 3: result = operation.multiplication(); break;
            case 4: result = operation.division(); break;
        }
        System.out.println("El resultado de la operacion es " + result);
    }
}
