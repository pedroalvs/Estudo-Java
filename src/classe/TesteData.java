package classe;

public class TesteData {
    
    public static void main(String[] args) {
        
        Data d1 = new Data(01, 02, 2022);

        var d2 = new Data();
            d2.dia = 29;
            d2.mes = 03;
            d2.ano = 1999;

        String dataFormatada1 = d1.obterDataFormatada();
            
            System.out.println("Data 1: " + dataFormatada1);
            System.out.println("Data 2: " + d2.obterDataFormatada());
    }
}
