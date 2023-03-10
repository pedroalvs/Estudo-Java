package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
	// (°F - 32) x 5/9 = °C
		

		Scanner entrada = new Scanner(System.in); 
		System.out.println("Digite a baixo um valor em °F para ser convertido em °C:");
		
			final double divisao = 5/9.0, sub = 32;
			double fahr = entrada.nextDouble(), celc = (fahr - sub) * divisao;

			System.out.println(celc);
			
		entrada.close();
	}
}