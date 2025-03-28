package fundamentos;

/**
 * A classe demonstra o uso de métodos da classe String no Java.
 * Strings são objetos imutáveis que oferecem diversos métodos para manipulação de texto.
 */

public class TipoString {
    public static void main(String[] args) {
        
        // Obtendo um caractere específico dentro da String
        System.out.println("=== Caracteres ===");
        System.out.println("Caractere na posição 4 de 'Olá pessoal': " + "Olá pessoal".charAt(4));

        // Criando uma string
        String s = "Boa tarde";

        System.out.println("\n=== Manipulação de String ===");
        System.out.println("Concatenação usando concat(): " + s.concat("!!!"));
        System.out.println("Concatenação usando operador +: " + s + "!!!");

        // Métodos para verificar o conteúdo da string
        System.out.println("\n=== Verificações ===");
        System.out.println("Começa com 'Boa'? " + s.startsWith("Boa"));
        System.out.println("Começa com 'boa' (ignorando maiúsculas)? " + s.toLowerCase().startsWith("boa"));
        System.out.println("Termina com 'TARDE' (ignorando maiúsculas)? " + s.toUpperCase().endsWith("TARDE"));
        System.out.println("Tamanho da string: " + s.length());
        System.out.println("É igual a 'boa tarde' (case-sensitive)? " + s.equals("boa tarde"));
        System.out.println("É igual a 'boa tarde' (ignorando maiúsculas)? " + s.equalsIgnoreCase("boa tarde"));

        // Variáveis para demonstração de formatação
        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("\n=== Concatenação de Strings ===");
        String informacao = "Nome: " + nome + "\nSobrenome: " + sobrenome 
                          + "\nIdade: " + idade + "\nSalário: R$" + salario + "\n";
        System.out.println(informacao);

        // Usando printf para formatação de saída
        System.out.println("\n=== Formatação com printf ===");
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.\n", nome, sobrenome, idade, salario);

        // Outra forma de formatação usando String.format()
        var nome1 = "Esthefânia";
        var sobrenome1 = "Alvares";
        var idade1 = 24;
        var salario1 = 2_500.19;

        System.out.println("\n=== Formatação com String.format() ===");
        String frase = String.format("A senhorita %s %s tem %d anos e ganha R$%.2f.\n", 
                                      nome1, sobrenome1, idade1, salario1);
        System.out.println(frase);

        // Métodos para busca e extração de substrings
        System.out.println("\n=== Métodos de Busca e Extração ===");
        String exemplo = "Frase qualquer";
        System.out.println("Contém 'qual'? " + exemplo.contains("qual"));
        System.out.println("Posição de 'qual': " + exemplo.indexOf("qual"));
        System.out.println("Substring a partir da posição 6: " + exemplo.substring(6));
        System.out.println("Substring do índice 6 ao 10: " + exemplo.substring(6, 10));
    }
}
