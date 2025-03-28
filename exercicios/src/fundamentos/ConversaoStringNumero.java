package fundamentos;

import javax.swing.JOptionPane;

/**
 * Classe que demonstra a conversão de Strings para números em Java.
 * O programa solicita dois números ao usuário, realiza a soma e calcula a média.
 */

public class ConversaoStringNumero {
    public static void main(String[] args) {

        // Entrada de dados através de caixas de diálogo
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

        // Conversão das Strings para números do tipo double
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        // Operações matemáticas
        double soma = numero1 + numero2;
        double media = soma / 2;

        // Exibição dos resultados
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        // Exibição usando JOptionPane
        JOptionPane.showMessageDialog(null,"Soma: " + soma + "\nMédia: " + media);
    }
}
