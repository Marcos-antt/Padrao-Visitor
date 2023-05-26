package org.example;

public class VisitorDesconto implements Visitor{
    private double desconto;

    public VisitorDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public void visitar(Produto produto) {
        double precoComDesconto = produto.getPreco() * (1 - desconto);
        System.out.println("Produto: " + produto.getNome() + ", Preço com desconto: " + precoComDesconto);
    }

}
