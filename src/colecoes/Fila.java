package colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {
    
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();

    //  Offer e Add -> adicionam elementos na fila
    //  A diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); //Lança uma exceção/erro!
        fila.offer("Bia"); //Retorna falso!
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

    //  Peek e Element -> obter o próximo elemento da fila(sem remover)
    //  A diferença é o comportamento quando a fila está vazia! 
        System.out.println(fila.peek()); //Retorna Null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //Lança uma exceção/erro!
        System.out.println(fila.element());
        
    //  Pool e Remove -> obter o próximo elemento da fila(removendo)
    //  A diferença é o comportamento quando a fila está vazia! 
        System.out.println(fila.poll());//Retorna Null
        System.out.println(fila.remove()); //Lança uma exceção/erro!
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        
        //fila.size();        -> Tamanho da fila
        //fila.clear();       -> Limpar a fila
        //fila.isEmpty();     -> Ver se a fila está vaiza
        //fila.contains(...); -> Ver se o item está na lista

        //System.out.println(fila.get()) -> não funciona
    }
}
