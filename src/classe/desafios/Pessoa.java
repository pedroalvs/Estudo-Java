package classe.desafios;

public class Pessoa {
    //peso e nome da pessoa

    String nomePessoa;
    double pesoPessoa;

    public Pessoa(String nome, double peso){
        nomePessoa = nome;
        pesoPessoa = peso;
    }

    void comer(Comida comida) {
        if(comida != null) {
            pesoPessoa += comida.pesoComida;
        }
    }

    String apresentar() {
        final String apresentação = "Olá eu sou o %s e tenho %.2f KG.";
        return  String.format(apresentação, nomePessoa, pesoPessoa);
    }
}