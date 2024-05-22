package edu.fatec.lp2.exercicio2;

public class ListaCompra implements Calculavel{
    private ItemCompra itensCompra;
    private int qtdeMax;

    public ListaCompra(int qtdeMax, ItemCompra itensCompra) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = itensCompra;
    }

    public void incluir(ItemCompra itensCompra) {
        this.itensCompra = itensCompra;
    }

    @Override
    public double calcularPreco() {
        int qnt = this.itensCompra.getQuantidade();
        double desconto = this.itensCompra.getDesconto();
        double preco = this.itensCompra.calcularPreco();
        return qnt * preco * desconto ;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public void setQtdeMax(int qtdeMax) {
        this.qtdeMax = qtdeMax;
    }

    public ItemCompra getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(ItemCompra itensCompra) {
        this.itensCompra = itensCompra;
    }
}
