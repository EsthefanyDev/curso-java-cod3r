package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 5.5;
		String resultadoParcial = media >= 5.0 ? "em Recuperação!" : "Reprovado!";
		String resultadoFinal = media >= 7.0 ? "Aprovado!" : resultadoParcial;
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		 
		 System.out.println("tem desconto? "+resultado);
	}
}
