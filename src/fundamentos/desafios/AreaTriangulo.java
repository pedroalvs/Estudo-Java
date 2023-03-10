package fundamentos.desafios;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        
        System.out.println("BEM-VINDO A CALCULADORA DE ÁREA DE TRIÂNGULO!");

        Scanner entrada = new Scanner(System.in);

        //Entrada Valores
        System.out.println("\nDigite abaixo a altura do Triâgulo em Metros:");
            String alturaTxt = entrada.next().replace(",", ".");
            double altura = Double.parseDouble(alturaTxt);

        System.out.println("\nDigite abaixo a base(largura) do Triângulo em Metros:");
            String baseTxt = entrada.next().replace(",", ".");
            double base = Double.parseDouble(baseTxt);

        entrada.close();

        //Cálculo
        double area = (base * altura) / 2;

        //Exibição
        System.out.printf("\nA área de um triângulo de altura %.2f e base %.2f é de: %.2f", altura, base, area);
    }
}