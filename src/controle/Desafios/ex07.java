package controle.desafios;

import java.util.Scanner;

public class Ex07{
    /* Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while. */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um numero para começar(digite um numero negativo p/ SAIR)");
        int numero = in.nextInt();
        int nSoma = numero;

        while(numero >= 0){    
            System.out.print("\nDigite mais um número e veja a soma entre os anteriores: ");
            numero = in.nextInt();  

            if(numero >= 0){           
            nSoma += numero;
            System.out.println(nSoma);
            }
        }
        in.close();
    }
}