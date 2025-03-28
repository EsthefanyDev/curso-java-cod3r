package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        // Operações básicas com números inteiros
        System.out.println("Operações com inteiros:");
        System.out.println("2 + 3 = " + (2 + 3));  // Adição

        // Variáveis do tipo double
        var x = 34.56;  // Tipo double
        double y = 2.2;  // Tipo double

        System.out.println("\nOperações com doubles:");
        System.out.println(x + y);  // Adição
        System.out.println(x - y);  // Subtração
        System.out.println(x * y);  // Multiplicação
        System.out.println(x / y);  // Divisão

        // Operações com inteiros
        int a = 8;
        int b = 3;

        System.out.println("\nOperações com inteiros (a = 8, b = 3):");
        System.out.println(a + b);  // Adição
        System.out.println(a - b);  // Subtração
        System.out.println(a * b);  // Multiplicação
        System.out.println(a / b);  // Divisão inteira (resultado truncado)
        
        // Convertendo um dos operandos para double ou float
        System.out.println(a / (double) b);  // Divisão com resultado em double
        System.out.println(a / (float) b);   // Divisão com resultado em float

        // Operação de módulo (resto da divisão)
        System.out.println("\nOperações de módulo:");
        System.out.println(a % b);  // Resto da divisão
        System.out.println(8 % 3);  // Resto da divisão de 8 por 3

        // Operações mistas
        System.out.println("\nOperações misturando tipos:");
        System.out.println(x + y - a * b);  // Precedência de operadores
    }
}
