package controle.Desafios;

import java.util.Random;
import java.util.Scanner;

public class ex06 {
    
    /* Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se o número inserido é maior ou menor do que o número armazenado. */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        //Inserindo número aleatório
        Random aleatorio = new Random();
            int numAleatorio = aleatorio.nextInt(100);
        
        System.out.println("Você tem 10 chances para advinhar um númeoro de 0 a 100!\n digite um digite o primeiro número para começar: ");
            int tentativa = in.nextInt();
            
        if(tentativa != numAleatorio) {
            for(int i = 9; i > 0; i--) {
                if(tentativa < numAleatorio) {
                    System.out.printf("\nResposta incorreta! a resposta é um número maior!\nAinda restam %d tentativas: ", i);
                        tentativa = in.nextInt();
                } else if(tentativa > numAleatorio) {
                    System.out.printf("\nResposta incorreta! a resposta é um número menor\nAinda restam %d tentativas: ", i);
                        tentativa = in.nextInt();
                } else {
                    System.out.println("\nParabens! Você acertou.");
                    break;
                }
            }
        } else {
            System.out.println("Você perdeu!");
        }

        in.close();
    }
}
