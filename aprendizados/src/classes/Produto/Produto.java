package classes.Produto;

public class Produto {
    String nome;
    Double preco;
    Double desconto;


    double precoComDesconto(){
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoGerente){
        return preco * (1 - desconto + descontoGerente);
    }


}
