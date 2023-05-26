package org.example;

public class test {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 50.0);
        Produto produto2 = new Produto("Calça", 100.0);

        Visitor visitor10Porcento = new VisitorDesconto(0.1);
        Visitor visitor20Porcento = new VisitorDesconto(0.2);

        produto1.aceitar(visitor10Porcento);
        produto2.aceitar(visitor20Porcento);
    }
}
