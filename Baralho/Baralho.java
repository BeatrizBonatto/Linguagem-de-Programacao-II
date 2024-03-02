public class Baralho {
    //array - baralho
    private Carta[] baralhoCartas = new Carta[56];
    
    //Construtor - criação do bararalho
    public Baralho(){        
        int i = 0;
        //  tipo variavel : conjunto de elementos
        for(Naipe naipe : Naipe.values()){
            for(Nome nome : Nome.values()){
                if (naipe != Naipe._Coringa && nome != Nome.Coringa) {
                    Carta carta = new Carta(nome, naipe);
    
                    this.baralhoCartas[i] = carta;
                    i++;
                    //System.out.println(i + carta.toString());  //   -> teste
                }
                else if (naipe == Naipe._Coringa && nome == Nome.Coringa){
                    for(int j = 0; j < 4; j++) {
                        Carta cartaCoringa = new Carta(Nome.Coringa, Naipe._Coringa);
            
                        this.baralhoCartas[i] = cartaCoringa;
                        i++;
                        //System.out.println(i + cartaCoringa.toString());  //   -> teste
                    }
                }
            }
        }
    }

    //metodo embaralhar
    public void embaralhar() {
        //usar Math.random para gerar indices aleatorios
    	for (int i = 0; i < 700000; i++)  {
    		int indiceAleatorio1 = (int) (Math.random () * this.baralhoCartas.length - 1); //acompanhar o tamanho do vetor e -1 para acompanhar indice
    		int indiceAleatorio2 = (int) (Math.random () * this.baralhoCartas.length - 1); //acompanhar o tamanho do vetor e -1 para acompanhar indice
    
    		Carta auxiliar = this.baralhoCartas[indiceAleatorio1];
    		this.baralhoCartas[indiceAleatorio1] = this.baralhoCartas[indiceAleatorio2];
    		this.baralhoCartas[indiceAleatorio2] = auxiliar;
    	  }
    }
    
    //metodo distribuirCarta
    public Carta distribuirCarta() { 
        //baralho null
        if (baralhoCartas == null) {
            return null;  // sem baralho
        }  
 
        for(int i = this.baralhoCartas.length - 1; i > -1; i--) {
            Carta cartaRetirada = this.baralhoCartas[i];
            if (cartaRetirada == null) {
                continue;
            } 
            this.baralhoCartas[i] = null;  // deixando o antigo lugar da carta como null, "menos uma carta"
            //System.out.println(cartaRetirada);  -> teste
            return cartaRetirada;
        }
        return null;
    }
    
    //metodo hasCarta - conferir se baralho tem carta
    public boolean hasCarta() {
        if(this.baralhoCartas == null) {
            return false;
        }
        else {
            return true;
        }
    }
    
    //metodo imprimir
    public void imprimirBaralho() {
        for (int i = 0; i < this.baralhoCartas.length; i++) {
            System.out.println (i + "" + this.baralhoCartas[i]);
        }
    }
    
}
