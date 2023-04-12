package controle.desafios;

import java.util.Scanner;

public class Ex09 {
    /* Crie um programa que recebe 10 valores e ao final imprima o maior número. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valorMaior = 0;

        System.out.println("Digite abaixo os números assim que solicitado e eu direi qual o maior!");

        for(int i =  1; i <= 10; i++) {
            System.out.printf("\n%d° número: ", i);
                int valor = in.nextInt();

            if(valor > valorMaior) {
                valorMaior = valor;
            }
        }
        in.close();
        
        System.out.println("\nO maior valor foi o: " + valorMaior);
    }
}
