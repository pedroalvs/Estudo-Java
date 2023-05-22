package exercicios;

//import java.util.Scanner;

//list page: https://www.w3resource.com/java-exercises/basic/index.php
public class Ex012 {
    
    public static void main(String[] args) {
 //       Scanner entrada = new Scanner(System.in);
        
        int qtdX = 0;
        double media = 0;
        
        for(; qtdX < 3; qtdX++){
            System.out.printf("Digite o %d° número: ", qtdX+1);
//            double num = entrada.nextDouble();
//            media += num;
        }
        media /= qtdX;
        
//        entrada.close();
        
        System.out.println("A média entre os números apresentados é: " + media);
    }
}
