package controle;

import java.util.Scanner;

public class SwitchComBreak {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        String conceito = "";

        System.out.println("Infome a nota: ");
            int nota = entrada.nextInt();

        switch(nota){
            case 10: case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4,3:
                conceito = "D";
                break;
            case 2, 1, 0:
                conceito = "F";
                break;
            default:
                conceito = "Não informado!";
        }

        System.out.println("Conceito: " + conceito);
        entrada.close();
    }
}
