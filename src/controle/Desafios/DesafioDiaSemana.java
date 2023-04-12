package controle.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
    
    public static void main(String[] args) {
        
        //Domingo -> 1 | Quarta -> 4 | Sabado -> 7

        Scanner entrada =  new Scanner(System.in);

        System.out.print("Digite o nome de um dia da semana para lhe retornar o numero referente:");
            String semana = entrada.next();

        entrada.close();

        //início condicional
        //Não use == com String
        if(semana.equalsIgnoreCase("domingo")) { 
            System.out.println("1");
        } else if(semana.equalsIgnoreCase("segunda")) {
            System.out.println("2");
        } else if(semana.equalsIgnoreCase("terca") 
                || semana.equalsIgnoreCase("terça") ) {
            System.out.println("3");
        } else if(semana.equalsIgnoreCase("quarta")) {
            System.out.println("4");
        } else if(semana.equalsIgnoreCase("quinta")) {
            System.out.println("5");
        } else if(semana.equalsIgnoreCase("sexta")) {
            System.out.println("6");
        } else if(semana.equalsIgnoreCase("sabado") 
                || semana.equalsIgnoreCase("sábado")) {
            System.out.println("7");
        } else 
            System.out.println("Dia inválido"); //fim condicional
    }

}
