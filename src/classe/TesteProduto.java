package classe;

public class TesteProduto {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 4356.89, 0.25);

        var p2 = new Produto();
            p2.nome = "Caneta Preta";
            p2.preco = 12.56;
            p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoDesconto(0);
        double precoFinal2 = p2.precoDesconto(0.02);
        double MediaCarrinho = (precoFinal1 + precoFinal2)/2;

        System.out.printf("Média carrinho: R$%.2f.", MediaCarrinho);
    }
}
