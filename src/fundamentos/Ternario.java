package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultado = media >= 7.0 ? "aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultado);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String sDesconto = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto? " + sDesconto);
	}
	
}
