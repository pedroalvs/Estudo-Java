package fundamentos.desafios;

import java.util.Scanner;

public class CalculadoraPoten2e3 {
    
    public static void main(String[] args) {
        
        System.out.println("BEM-VINDO A CALCULADORA DE POTÊNCIA!");

        Scanner entrada = new  Scanner(System.in);

        //Entrada Valor
        System.out.println("\nDigite abaixo o valor que deseja elevar a potência:");
            String ValorTxt = entrada.next().replace(",", ".");
            double Valor = Double.parseDouble(ValorTxt);

        entrada.close();

        //Cálculo
        double pot2 = Math.pow(Valor, 2);
        double pot3 = Math.pow(Valor, 3);

        System.out.printf("\nQuadrado: %.2f   Cubo: %.2f", pot2, pot3);
    }

}
