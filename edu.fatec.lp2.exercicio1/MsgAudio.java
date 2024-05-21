
public class MsgAudio extends Mensagem {
    private int duracao;

    @Override
    public Mensagem sedMensagem(String conteudo) {
        
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