package arrays.desafios;

import java.util.Scanner;

public class desafioArray {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Digite quantas notas você deseja inserir:");
            int qtdNota = in.nextInt();

        double[] notasAluno = new double[qtdNota];

        for(int i = 0;i < notasAluno.length;i++) {
            System.out.printf("Digite a %d° nota: ", (1 + i));
                notasAluno[i] = in.nextDouble();
        }
        
        double total = 0;
        for (double nota : notasAluno) {
            total += nota;
        }
        
        System.out.printf("A média das %d notas é de: %.2f", qtdNota, (total/qtdNota));

        in.close();
    }
}