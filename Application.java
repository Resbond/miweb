import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        float Num1 = 0;
        float Num2 = 0;
        int ope = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número");
        Num1 = sc.nextFloat();
        System.out.println("Digite el segundo número");
        Num2 = sc.nextFloat();
        System.out.println("Digite el numero de la operacion a realizar");
        ope = sc.nextInt();

        Calculator oper = new Calculator(Num1, Num2);
        float result = 0;

        switch(ope){
            case 1: result = oper.add(); break;
            case 2: result = oper.subs(); break;
            case 3: result = oper.mult(); break;
            case 4: result = oper.div(); break;
        }
        System.out.println("El resultado de la operacion es " + result);
    }
}
