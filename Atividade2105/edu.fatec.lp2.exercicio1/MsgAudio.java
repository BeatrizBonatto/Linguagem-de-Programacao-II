
public class MsgAudio extends Mensagem {
    private int duracao;
    
    public Mensagem sendMensege(String aString){
        return this;
    }

    public MsgAudio(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}