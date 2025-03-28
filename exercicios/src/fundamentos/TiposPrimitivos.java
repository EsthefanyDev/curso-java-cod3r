package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionário
		
		//Tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_842_223L;
		
		//Tipos númericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Topo caractere
		char status = 'A'; //ativo
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Números de Viagens
		System.out.println(numerosDeVoos / 2);
		
		//Pontos por Real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
}
