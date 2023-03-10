package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		/*
		System.out.println("Olá Pessoal".charAt(7));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().startsWith("BOA"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
	
			*/
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.674;
	
		
		String maisUmaFrase = "Nome : " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: R$" + salario;
		
		System.out.println(maisUmaFrase + "\n\n");
		
		String frase = String.format("O senhor %s %s tem %d anos e recebe %.2f reais.", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		System.out.printf("\n\nO senhor %s %s tem %d anos e recebe %.2f reais.", nome, sobrenome, idade, salario);
		
		
	}
	
}
