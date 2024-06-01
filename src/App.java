public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===========Operadores en Java");
        operadoresAritmeticos();
        operadoresCombinados();
    }

    public static void operadoresAritmeticos() {
        System.out.println("===========Operadores Aritméticos===========");
        // varibles
        int numeroA, numeroB;
        numeroA = 25;
        numeroB = 5;

        System.out.println("Operador de multiplicación * : " + (numeroA * numeroB));
        System.out.println("Operador de división / : " + (numeroA / numeroB));
        System.out.println("Operador de modulo % : " + (numeroA % numeroB));
        System.out.println("Operador de suma + : " + (numeroA + numeroB));
        System.out.println("Operador de resta -: " + (numeroA - numeroB));
        System.out.println("Operador de incremento ++ :" + (++numeroA));
        System.out.println("Operador de decremento -- : " + (--numeroB));
        System.out.println("Operador de Menos Unario - :" + (-(numeroA + numeroB)));
    }

    public static void operadoresCombinados() {
        System.out.println("===========Operadores Combinados===========");
        // variables
        int numeroA, numeroB;
        numeroA = 6;
        numeroB = 8;

        System.out.println("Operador += :" + (numeroA += numeroB));
        System.out.println("Operador -= :" + (numeroA -= numeroB));
        System.out.println("Operador *= :" + (numeroA *= numeroB));
        System.out.println("Operador /= :" + (numeroA /= numeroB));
        System.out.println("Operador  %= :" + (numeroA %= numeroB));

    }
}
