package classe;

public class ProdutoTeste {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Notebook", 4356.89);

        var p2 = new Produto();
            p2.nome = "Caneta Preta";
            p2.preco = 12.56;

        Produto.desconto = 0.29;
        
        System.out.println(p1.nome + " " + p1.precoDesconto());
        System.out.println(p2.nome + " " + p2.precoDesconto());

        double precoFinal1 = p1.precoDesconto();
        double precoFinal2 = p2.precoDesconto(0.02);
        double MediaCarrinho = (precoFinal1 + precoFinal2)/2;

        System.out.printf("Média carrinho: R$%.2f.", MediaCarrinho);
    }
}
