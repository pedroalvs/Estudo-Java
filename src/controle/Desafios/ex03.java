package controle.Desafios;

import java.util.Scanner;

public class Ex03 {
    
    /* Criar um programa que receba duas notas parciais, calcular a média final. Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado". */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");   
            double nota = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
            nota += in.nextDouble();
            nota /= 2;
        
        in.close();
  
        if(nota <= 10 && nota >= 7) {
            System.out.println("Aprovado");
        } else if(nota < 7 && nota >= 4) {
            System.out.println("Em Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
