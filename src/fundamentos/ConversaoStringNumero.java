package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	
	public static void main(String[] args) {
		
		String Valor1 = JOptionPane.showInputDialog("Digite o primero número:");
		String Valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println(Valor1 + Valor2);
		
		double n1 = Double.parseDouble(Valor1); 
		double n2 = Double.parseDouble(Valor2); 
		
		double soma = n1 + n2;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + soma/2);
		
	}
}
