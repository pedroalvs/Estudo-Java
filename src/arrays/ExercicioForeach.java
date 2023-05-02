package arrays;

import java.util.Arrays;

public class ExercicioForeach {
    public static void main(String[] args) {
        
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));

        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);
      //System.out.println(notasAlunoA[4]); ERRO! exede o numero de indices.

        double totalAlunoA = 0;
        for(double nota: notasAlunoA) {
            System.out.print(nota + " ");
            totalAlunoA += nota;
        }
        
        System.out.println("\n\nMédia Aluno A: " + totalAlunoA / notasAlunoA.length + "\n");
        
        double notaArmazenada = 5.9;
        double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 };
        
        double totalAlunoB = 0;
        for(double nota: notasAlunoB) {
            System.out.print(nota + " ");
            totalAlunoB += nota;
        }

        System.out.println("\n\nMédia Aluno B: " + totalAlunoB / notasAlunoB.length);
    }
}
