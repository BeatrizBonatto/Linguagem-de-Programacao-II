public class Carta {
    private Nome nome;
    private Naipe naipe;

    public Carta(Nome nome, Naipe naipe){  //funcao que e executada quando a classe for instanciada
        this.naipe = naipe;
        this.nome = nome;
    }

    //get e set
    public Nome getNome() {
        return nome;
    }
    public void setNome(Nome nome) {
        this.nome = nome;
    }
    public Naipe getNaipe() {
        return naipe;
    }
    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return "- " +this.nome + this.naipe;
    }
    
}
