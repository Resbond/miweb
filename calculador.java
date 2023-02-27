public class calculador {
    public static void main(String[] args) throws Exception {
        float Numero1 = 0;
        float Numero2 = 0;
        int ope = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número");
        Numero1 = sc.nextFloat();
        System.out.println("Digite el segundo número");
        Numero2 = sc.nextFloat();
        System.out.println("Digite el numero de la operacion a realizar");
        ope = sc.nextInt();

        operaciones oper = new operaciones(Numero1, Numero2);
        float resul = 0;

        switch(ope){
            case 1: resul = oper.suma(); break;
            case 2: resul = oper.resta(); break;
            case 3: resul = oper.multiplicacion(); break;
            case 4: resul = oper.division(); break;
        }
        System.out.println("El resultado de la operacion es " + resul);
    }
}
