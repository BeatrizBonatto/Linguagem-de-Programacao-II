package edu.fatec.lp2.exercicio2;

public class ListaCompra {
    private ItemCompra itensCompra;
    private int qtdeMax;

    public ListaCompra(int qtdeMax, ItemCompra itensCompra) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = itensCompra;
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
