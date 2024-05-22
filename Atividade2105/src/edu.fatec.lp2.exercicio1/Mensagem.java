package edu.fatec.lp2.exercicio1;

public abstract class Mensagem {
    private  Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem() {
        this.conteudo = conteudo;
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
    }

    @Override
    public String toString(){
        return "Mensagem para " + destinatario + "[" + horaEnvio + "]" + ": " + conteudo;
    };

    public abstract Mensagem sendMensege(String aString);

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