package controle.Desafios;

import java.util.Scanner;

public class Ex02 {
    
    /* Criar um programa informa se o ano informado é um ano bissexto */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um ano para saber se é bissexto: ");
            int ano = in.nextInt();

        if(ano %4 == 0 && ano %100 != 0) {
            System.out.printf("O ano %d é bissexto", ano);
        } else {
            System.out.printf("O ano não %d é bissexto", ano);
        }

        in.close();
    }
}
