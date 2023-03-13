package controle;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        System.out.print("Digite uma nota de 1 a 10: ");
            int nota = entrada.nextInt();

        if(nota > 10 || nota < 0){
            System.out.println("Nota inválida!");
        } else if(nota > 8 ) {
            System.out.println("Conceito A");
        } else if(nota > 6) {
            System.out.println("Conceito B");
        } else if(nota > 4) {
            System.out.println("Conceito C");
        } else if(nota > 2) {
            System.out.println("Conceito D");
        } else { 
            System.out.println("Conceito F");
        }

        entrada.close();
    }
    
}
