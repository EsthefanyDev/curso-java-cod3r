package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o 1° Salário: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o 2° Salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digire o 3° Salário: ");
		String salario3 = entrada.nextLine().replace(",", ".");
	
		
		
		float valor1 = Float.parseFloat(salario1);
		float valor2 = Float.parseFloat(salario2);
		float valor3 = Float.parseFloat(salario3);
		float media = (valor1 + valor2 + valor3)/3;
		
		System.out.printf(
			"\nA média dos salários %s, %s e %s é => %.2f", salario1, salario2, salario3, media);
		
		entrada.close();
	}
}
