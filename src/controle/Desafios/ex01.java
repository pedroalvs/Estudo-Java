package controle.Desafios;

import java.util.Scanner;

public class Ex01 {
    /* Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par */
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Digite um número para verifcar se é par: ");
            int num = in.nextInt();

        if(num <= 10 && num % 2 == 0) {
            System.out.printf("O número %d é Par", num);
        } else {
            System.out.printf("O número %d é Ímpar", num);
        }

        in.close();
    }
}