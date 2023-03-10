package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Apresentação
        System.out.println("Bem-vindo a Calculadora\n".toUpperCase());
        System.out.println("Digite a baixo somente o que for solicitado!\n");

        //Solicitando números da operação
        System.out.println("\nDigite o primeiro número da operação:");
            double num1 = entrada.nextDouble();

        //Solicitando Operador
        System.out.println("\nDigite qual o operador desejado(+ - * / %):");
            String operador = entrada.next();
        
        System.out.println("\nDigite o segundo número da operação:");
            double num2 = entrada.nextDouble();

        entrada.close();
        
        //Calculo
        double resultadoF = "+".equals(operador) ? (num1 + num2) : 0;
            resultadoF = "-".equals(operador) ? (num1 - num2) : resultadoF;
            resultadoF = "*".equals(operador) ? (num1 * num2) : resultadoF;
            resultadoF = "/".equals(operador) ? (num1 / num2) : resultadoF;
            resultadoF = "%".equals(operador) ? (num1 % num2) : resultadoF;
        
        //Exibição
        System.out.printf("\nO resultado da operação %.2f %s %.2f é %.2f \n", 
            num1, operador, num2, resultadoF);
    }
}