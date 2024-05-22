package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public Mensagem sendMensege(String aString){
        return this;
    }

    public MsgFoto(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}