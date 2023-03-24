package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nomeInicial, double precoInicial, double descontoinicial){
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoinicial;
    }
    Produto(){}

    double precoDesconto() {
        return preco * (1 - desconto);
    }

    //Os Métodos podem conter o mesmo nome, porém é necessário que tenha parâmetros diferentes
    double precoDesconto(double descontoGerente) {
        return preco * (1 - (desconto + descontoGerente));
    }
}