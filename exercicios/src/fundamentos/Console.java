package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");
		
		System.out.println("bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6, 7);
		System.out.printf("Salário: %.1f%n", 1223.8987);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		entrada.close();
	}

}
