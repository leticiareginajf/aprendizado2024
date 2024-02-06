package classes.Produto;

import classes.Produto.Produto;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {


        int a = 3;

        Scanner entrada = new Scanner(System.in);

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 43652.0;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.50;
        p2.desconto = 0.29;


        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$ %.2f." , mediaCarrinho);

    }
}
