package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
     
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdAlunos = in.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdNotas = in.nextInt();

        double[][] notasTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int a = 0;a < notasTurma.length; a++) {
            for (int n = 0;n < notasTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", 1 + n, 1 + a);
                    notasTurma [a][n] = in.nextDouble();
                total += notasTurma[a][n];
            }
        }

        double mediaTurma = total / (qtdAlunos * qtdNotas);
            System.out.println("\nMédia geral da turma: " + mediaTurma);
 
       for( double[] notasAluno : notasTurma) {
            System.out.println(Arrays.toString(notasAluno));
       }

        in.close();
     }
}
