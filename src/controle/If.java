package controle;

import java.util.Scanner;

public class If {
    
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Informe a média: ");
        double media = entrada.nextDouble();

        if(media >= 7.0 && media <= 10){
            System.out.println("Aprovado");
            System.out.println("Parabens!");
            }
      //    System.out.println("Parabens!"); <- para funcionar tem que colocar dentro de um bloco de código{}.
        if(media < 7.0 && media >= 4.5)
            System.out.println("Reprovado");

        if(media < 4.5 && media >= 0){
            System.out.println("Em Recuperação");
        }

    /*  String status = media >= 7.0 ? "Aprovado" : "Reprovado";
            System.out.println(status); */

        entrada.close();
    }

}