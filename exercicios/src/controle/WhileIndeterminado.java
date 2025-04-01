package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String x = "";
		
		while(!x.equalsIgnoreCase("sair")) {
			System.out.print("Você diz:\n");
			 x = entrada.nextLine();
		}
		
		
		entrada.close();
	}
}
