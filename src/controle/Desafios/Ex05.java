package controle.desafios;

import java.util.Scanner;

public class Ex05 {

    /*  Refatorar o exercício 04, utilizando a estrutura switch */
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número pára saber se é primo: ");
            int num = in.nextInt();
        int countDivisoes = 0;

            for(int i = 1; i <= num; i++){
                if(num == 0 || num %i == 0){
                    countDivisoes++;
                }
            }

        switch(countDivisoes){
            case 0:
                System.out.printf("\nO número %d é primo.", num);
                break;
            default:
                System.out.printf("\nO númeoro %d náo é primo.", num);
        }

        in.close();
    }
}