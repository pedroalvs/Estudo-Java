package controle;

public class BreakContinue {
    
    public static void main(String[] args) {
        
        for(int i = 0;i < 10; i++){

            if(i == 5){
                break; //faz sair de um laço de repetição
            }
            System.out.println(i);
        }

        System.out.println("Fim Break!\n");

        for(int i = 0;i < 10;i++){
            if(i % 2 == 1){
                continue; //interrompe apenas uma repetição em vez do laço inteiro 
            }
            System.out.println(i);
        }
        System.out.println();
        for(int i = 1;i <= 10;i++){
            if(i == 5) continue;
            System.out.println(i);
        }

        System.out.println("Fim Continue!");
    }
}
