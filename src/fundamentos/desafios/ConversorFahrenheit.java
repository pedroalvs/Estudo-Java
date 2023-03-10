package fundamentos.desafios;

import java.util.Scanner;

public class ConversorFahrenheit {

    public static void main(String[] args) {
        
        System.out.println("Bem-vindo ao Conversor de Celcius para Fahrenheit!".toUpperCase());

        Scanner entrada = new Scanner(System.in);

            System.out.println("Digite abaixo o valor em Celcius que deseja converter:");
                String celciusTxt = entrada.next().replace(",", ".");
                double celciusNum = Double.parseDouble(celciusTxt);

                double fahrenheit = (celciusNum*1.8)+32;

        entrada.close();

        System.out.printf("\n O valor em Fahrenheit é: %.2f", fahrenheit);            
    }
    
}
