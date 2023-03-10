package fundamentos;

import java.util.Scanner;

public class Console {

	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
			String nome = entrada.nextLine();
		
		System.out.println("Digite seu Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
	    System.out.printf("Seu nome é %s %s e você tem %d anos.", nome, sobrenome, idade);	 
			
			
		
		
		entrada.close();		
		
		
		Scanner teclado = new Scanner(System.in);
		 
	    System.out.println("Qual a sua idade?");
		    int idade2 = teclado.nextInt();
		    teclado.nextLine();
		System.out.println("Qual o seu nome?");
	    	String nome2 = teclado.nextLine();
	    System.out.println("Qual o seu sobrenome?");
	    	String sobrenome2 = teclado.nextLine();


	    System.out.printf("Seu nome é %s %s e você tem %d anos.", nome2, sobrenome2, idade2);	 
	    
	    teclado.close();
	}
}
