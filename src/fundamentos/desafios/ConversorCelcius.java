package fundamentos.desafios;

import java.util.Scanner;

public class ConversorCelcius {

    public static void main(String[] args) {
        
        System.out.println("Bem-vindo ao conversor de Fahrenheit em Celcius".toUpperCase());

        Scanner entrada = new Scanner(System.in);
        
        //entrada valor e execução do cálculo
        System.out.println("\n Digite a baixo valor em Fahrenheit para ser convertido:");
            double fahrenheit = entrada.nextDouble();
            double celcius = (5.0/9.0)*(fahrenheit-32);
        
        entrada.close();

        System.out.printf("\n O valor em Celcius é: %.2f", celcius);
    }
}
