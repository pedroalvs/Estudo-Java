package exercicios;

import java.util.Scanner;

//list page: https://www.w3resource.com/java-exercises/basic/index.php
public class Ex006 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
            int num1 = entrada.nextInt();
        System.out.print("\nDigite o segundo número: ");
            int num2 = entrada.nextInt();
            
        entrada.close();

        System.out.printf("\n%d + %d = %d", num1, num2, (num1 + num2));
        System.out.printf("\n%d - %d = %d", num1, num2, (num1 - num2));
        System.out.printf("\n%d * %d = %d", num1, num2, (num1 * num2));
        System.out.printf("\n%d / %d = %d", num1, num2, (num1 / num2));
        System.out.printf("\n%d mod %d = %d", num1, num2, (num1 % num2));
    }
}
