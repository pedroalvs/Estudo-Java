package classe.desafios;

public class Jantar {
    
    public static void main(String[] args) {
        //criar duas comidas e fazer a pessoa comer a comida assim adicionando o peso da comida ao da pessoa referida
        var p1 = new Pessoa("João", 78);
        var c1 = new Comida("Feijoada", 0.9);
        var c2 = new Comida("Macarronada", 0.51);

        System.out.println(p1.apresentar());
        p1.comer(c1);

        System.out.println(p1.apresentar());
        p1.comer(c2);

        System.out.println(p1.apresentar());
    }
}