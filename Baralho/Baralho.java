public class Baralho {
    //array - baralho
    private Carta[] baralhoCartas = new Carta[56];
    
    //Construtor - criação do bararalho
    public Baralho(){
        this.baralhoCartas = baralhoCartas;
        
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
    public void embaralhar () {
        //usar Math.random para gerar indices aleatorios
    	for (int i = 0; i < 700000; i++)  {
    		int indiceAleatorio1 = (int) (Math.random () * 56);
    		int indiceAleatorio2 = (int) (Math.random () * 56);
    
    		Carta auxiliar = this.baralhoCartas[indiceAleatorio1];
    		this.baralhoCartas[indiceAleatorio1] = this.baralhoCartas[indiceAleatorio2];
    		this.baralhoCartas[indiceAleatorio2] = auxiliar;
    	  }
    }
    
    /*distribuirCarta(){}*/
    /*hasCarta()*/
    /*imprimirBaralho()*/
}
