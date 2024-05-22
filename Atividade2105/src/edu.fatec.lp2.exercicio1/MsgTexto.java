package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem {
    private int numChar;

    public Mensagem sendMensege(String aString){
        return this;
    }

    public MsgTexto(int numChar) {
        this.numChar = numChar;
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }
}