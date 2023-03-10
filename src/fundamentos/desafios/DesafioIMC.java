package fundamentos.desafios;

import java.util.Scanner;

public class DesafioIMC{

    public static void main(String[] args) {
        
        System.out.println("Bem-vindo a Calculadora de IMC!".toUpperCase());

        Scanner entrada =  new Scanner(System.in);

        //Entrada de valores
        System.out.println("\nDigite abaixo o seu peso:");
            String pesoTxt = entrada.next().replace(",", ".");
            double pesoNum = Double.parseDouble(pesoTxt);
        
        System.out.println("\nDigite abaixo a sua altura em metros:");
            String alturaTxt = entrada.next().replace(",", ".");
            double alturaNum = Double.parseDouble(alturaTxt);

        entrada.close();

        //Calculo do IMC ( peso x altura ao quadrado )
        double IMC = pesoNum/(alturaNum*alturaNum);

        System.out.printf("\nSeu IMC é: %.2f", IMC);
    }
}