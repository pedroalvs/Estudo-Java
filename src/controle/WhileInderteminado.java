package controle;

import java.util.Scanner;

public class WhileInderteminado {
    
    //voce diz: sair 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String exit = "";
        while( !exit.equalsIgnoreCase("sair") ){
            System.out.println("Você diz: ");
            exit = entrada.nextLine();
        }

        entrada.close();
    }
}