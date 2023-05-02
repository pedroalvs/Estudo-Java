package exercicios;

import java.util.Scanner;

//list page: https://www.w3resource.com/java-exercises/basic/index.php
public class Ex007 {
    
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.print("Digite um numero para ver a tabúada referente: ");
            int num = entrada.nextInt();
            
        entrada.close();
        
        for(int i = 1; i <= 10; i++){
            System.out.printf("\n%d x %d = %d", num, i, (num * i));
        }
    }
}
