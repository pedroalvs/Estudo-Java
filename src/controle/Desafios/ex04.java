package controle.Desafios;

import java.util.Scanner;

public class Ex04 {
    
    /* Criar um programa que receba um número e diga se ele é um número primo. */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para saber se ele é primo: ");
            int num = in.nextInt();

        if(
            num == 2 || num == 3 ||
            num %2 != 0 && num %3 != 0 &&
            num %5 != 0 && num %7 != 0
        ) {
            System.out.printf("\n O número %d é primo", num);
        } else {
            System.out.printf("\n O número %d não é primo", num);
        }

        in.close();
    }
}

    