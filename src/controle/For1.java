package controle;

public class For1 {
    
    public static void main(String[] args) {
        
      /*int contador = 0;
        while(contador <= 20) {
            System.out.printf("i = %d \n", contador);
            contador += 2;
        } */

        //As variáveis criadas dentro do for somente são acessadas dentro do mesmo
        for(int contador = 0; contador <= 20; contador += 2) {
            System.out.printf("i = %d \n", contador);
        }

        for(int num = 10;num >= 0;num -= 2){
            System.out.println("Contador = " + num);
        }

        // Laço infinito!!!
//      for(;;){
//          System.out.println("Fim!");
//      }

    }

}
