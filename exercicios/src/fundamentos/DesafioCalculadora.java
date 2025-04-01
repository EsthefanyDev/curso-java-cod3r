package fundamentos;
import java.util.Scanner;
import java.util.Locale;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Pedir qual operação ( + - * / % )
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);
		
		System.out.print("Digite um número:");
		double num1 = entrada.nextDouble();
		System.out.print("Digite outro número:");
		double num2 = entrada.nextDouble();
		System.out.print("Qual operação?");
		String operacao = entrada.next();
		
		//Lógica
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;		  
		
		System.out.printf("%.2f %s %.2f = %.2f",num1, operacao, num2, resultado);
		entrada.close();
	}
}
