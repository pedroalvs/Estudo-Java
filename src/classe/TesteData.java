package classe;

public class TesteData {
    
    public static void main(String[] args) {
        
        Data d1 = new Data();
            d1.dia = 01;
            d1.mes = 02;
            d1.ano = 2022;

        var d2 = new Data();
            d2.dia = 29;
            d2.mes = 03;
            d2.ano = 1999;

            System.out.printf("Data1: %d/%d/%d", d1.dia, d1.mes, d1.ano);
            System.out.printf("\nData2: %d/%d/%d", d2.dia, d2.mes, d2.ano);
    }
}
