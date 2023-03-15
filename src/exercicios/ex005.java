package exercicios;

import java.util.Scanner;

//list page: https://www.w3resource.com/java-exercises/basic/index.php
public class ex005 {
    
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Digite o primeiro dígito da multiplicação: ");
            int num1 = entrada.nextInt();
        System.out.println("Digite o segundo dígito da multiplicação: ");
            int num2 = entrada.nextInt();
        entrada.close();

        System.out.printf("%d x %d = %d", num1, num2, (num1 * num2));
    }
}
