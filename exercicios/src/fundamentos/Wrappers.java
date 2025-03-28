package fundamentos;

/**
 * Wrappers são classes que encapsulam tipos primitivos em objetos.
 * Eles permitem o uso de métodos utilitários e são necessários para coleções como List e Map.
 * Exemplo: Integer encapsula o tipo primitivo int, permitindo conversões e manipulações.
 */

public class Wrappers {
    public static void main(String[] args) {
        // Exemplos de Wrappers para Tipos Numéricos
        Byte b = 100;  // Encapsula um byte
        Short s = 1000; // Encapsula um short
        Integer i = 10000; // Encapsula um int
        Long l = 100000000L; // Encapsula um long

        System.out.println("=== Tipos Numéricos ===");
        System.out.println("Byte: " + b.byteValue()); // Converte para primitivo
        System.out.println("Short: " + s.toString()); // Converte para String
        System.out.println("Integer * 3: " + (i * 3));
        System.out.println("Long / 3: " + (l / 3));

        // Float e Double
        Float f = 123.10F; // Encapsula um float
        Double d = 1234.65434; // Encapsula um double

        System.out.println("\n=== Números de Ponto Flutuante ===");
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        // Wrapper para Boolean
        Boolean bo = Boolean.parseBoolean("true"); // Converte String para booleano

        System.out.println("\n=== Booleanos ===");
        System.out.println("Boolean: " + bo);
        System.out.println("Boolean (uppercase): " + bo.toString().toUpperCase());

        // Wrapper para Character
        Character c = '#'; // Encapsula um char

        System.out.println("\n=== Caracteres ===");
        System.out.println("Character: " + c + "...");

        // Exibição formatada
        System.out.printf("\nResumo: b=%d, s=%d, i=%d, l=%d, f=%.2f, d=%.5f, bo=%b, c=%c\n",
                b, s, i, l, f, d, bo, c);
    }
}
