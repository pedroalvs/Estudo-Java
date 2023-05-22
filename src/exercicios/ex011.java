package exercicios;

import java.util.Scanner;

//list page: https://www.w3resource.com/java-exercises/basic/index.php
public class Ex011 {
    
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o raio do círculo: ");
        double raio = entrada.nextDouble();
    
    entrada.close();
        
    System.out.println("Perímetro: " + (2 * raio * Math.PI));
    System.out.println("Área: " + (Math.PI * raio * raio));
   }
}