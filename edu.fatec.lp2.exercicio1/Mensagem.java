public class Mensagem {
    private  Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(String conteudo, Contatinho destinatario, String horaEnvio) {
        this.conteudo = conteudo;
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
    }

    //@Override
    //public String toString() {}

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Contatinho destinatario) {
        this.destinatario = destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(String horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}