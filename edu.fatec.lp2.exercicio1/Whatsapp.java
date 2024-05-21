public class Whatsapp {
    private Contatinho contatos;
    private Mensagem mensagens;

    public Whatsapp(Contatinho contatos, Mensagem mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    //metodo 
    public void listarContato() {
    }
    public void listarMensagens() {
    }

    public Contatinho getContatos() {
        return contatos;
    }

    public void setContatos(Contatinho contatos) {
        this.contatos = contatos;
    }

    public Mensagem getMensagens() {
        return mensagens;
    }

    public void setMensagens(Mensagem mensagens) {
        this.mensagens = mensagens;
    }

}