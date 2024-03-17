package org.example;

public class Main {
    public static void main(String[] args) {
        Acao acao = new Acao("BBAS3", 100.0);
        AcaoBroker corretor = new AcaoBroker();

        Investidor investidor1 = new Investidor("Tiago", 150.0, 200.0, corretor);
        Investidor investidor2 = new Investidor("Beneti", 180.0, 250.0, corretor);

        acao.addObserver(investidor1);
        acao.addObserver(investidor2);

        // Simulando uma variação de preço
        acao.setPreco(201.0);
        acao.setPreco(224.0);

    }
}