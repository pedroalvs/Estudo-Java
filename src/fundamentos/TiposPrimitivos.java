package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações funcionarios
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcomulados = 3_234_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcomuladas = 2_991_797_103.01;
		
		//TIpo booleano
		boolean estaDeFerias = false; //Falso
		
		//Tipo caractere
		char status = 'A'; //Ativo
		
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de Viajens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por Real
		System.out.println(pontosAcomulados / vendasAcomuladas);
		
		System.out.println("ID:" + id + " ganha -> R$:" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
