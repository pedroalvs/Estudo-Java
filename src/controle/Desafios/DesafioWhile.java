package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
    
    public static void main(String[] args) {
        /* Usuário pode digitar nota de 10 a 0(informar se for invalida)
         somar todas as notas apresentadas e dar uma média no final
         para sair do loop digitar -1*/ 
        
        Scanner entrada = new Scanner(System.in);

        int qtdNota = 0;
        double nota = 0;
        double notaF = 0;
        
        System.out.println("Digite as notas em sequência para ver a média entre elas!\n");
        
        while(nota != -1){
            System.out.print("Digite uma nota válida: ");
            nota = entrada.nextDouble();
            if(nota <= 10 && nota >= 0){
                notaF += nota;
                qtdNota++;
            } else if(nota != -1){
                System.out.println("Nota Inválida");
            }
        }
        
        System.out.printf("A Médias entre as %d notas apresentadas é: %.2f",qtdNota ,(notaF / qtdNota));
        
        entrada.close();
    }
}


//Primeiras Tentativas 

/*
while(nota != -1) {
    System.out.println("Digite uma nota válida: \n");
        nota = entrada.nextDouble();
    notaF += nota;
    qtdNota++;
} 
*/

/*
boolean fimLoop = false

while(!fimLoop){
    System.out.println("Digite uma nota válida: \n");
        nota = entrada.nextDouble();
    fimLoop = nota == -1;
    
    if(nota <= 10 && nota >= 0){
        notaF += nota;
        qtdNota++;
    } else if(!fimLoop){
        System.out.println("Nota Inválida");
    }
} 
*/