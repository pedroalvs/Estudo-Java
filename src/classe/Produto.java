package classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
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