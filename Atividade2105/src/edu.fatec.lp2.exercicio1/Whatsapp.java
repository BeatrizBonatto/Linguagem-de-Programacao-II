package edu.fatec.lp2.exercicio1;

import java.util.List;

public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;

    public Whatsapp (List<Contatinho> contatos, List<Mensagem> mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
    }
    
    //metodo 
    public void listarContato(List<Contatinho> contatos) {
        for (Contatinho contato : contatos) {
            System.out.println("Contato: "+ contato.getNome()+ "\n");
        }
    }
    public void listarMensagens(List<Mensagem> mensagens) {
        for (Mensagem mensagen : mensagens) {
            System.out.println("Mensagem: " + mensagen.getConteudo());
        }
    }

    public List<Contatinho> getContatos() {
        return contatos;
    }
    public void setContatos(List<Contatinho> contatos) {
        this.contatos = contatos;
    }
    public List<Mensagem> getMensagens() {
        return mensagens;
    }
    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }  

}