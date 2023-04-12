package controle.desafios;

public class DesafioFor {
    
    public static void main(String[] args) {
        
        String valorN = "#";
        for(int i = 0; i < 5; i++){
            System.out.println(valorN);
            valorN += "#";
        }
        
        //Desafio:
        //Conseguir mesmo resultado do laço acima sem usar valores numéricos!

        for(String valorS = "#";!valorS.equals("######");valorS += "#"){
            System.out.println(valorS);  
        }
    }
}
