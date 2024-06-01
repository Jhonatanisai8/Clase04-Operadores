public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===========Operadores en Java");

        operadorTernario();
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

    public static void operadoresIncrementoDecremento() {

        System.out.println("===========Operadores de incremento y decremento===========");
        // variables
        int x, y;
        x = 7;
        y = 5;

        x++; // post incremento
        x--; // post decremento

        ++x; // pre incremento
        --y; // post decremento
    }

    public static void operadorTernario() {
        System.out.println("===========Operador Ternario===========");
        int numeroA = 5 > 3 ? 1 : 2; 
        System.out.println(numeroA);

        int edad = 18;
        System.out.println((edad >= 18) ? "Es mayor de edad":"es menor de edad");

        int numero = 6;
        System.out.println((numero % 2 == 0) ? "Es par":"Es impar");
    }
}
