package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Digite a baixo seus ultimos três salários quando pedido!\n");
		
				//Pedindo valores de Salário
				System.out.println("Digite o primeiro salário: ");
					String v1 = entrada.nextLine().replace(",", ".");
			
				System.out.println("Digite o segundo salário: ");
					String v2 = entrada.nextLine().replace(",", ".");
					
				System.out.println("Digite o terceiro salário: ");
					String v3 = entrada.nextLine().replace(",", ".");
					
		entrada.close();
		
		//Convertendo String para Double
		double sal1 = Double.parseDouble(v1);
		double sal2 = Double.parseDouble(v2);
		double sal3 = Double.parseDouble(v3);
		
		//Calculo de média do Salário
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.println("A média salárial é de: " + media);
	}
	
}
