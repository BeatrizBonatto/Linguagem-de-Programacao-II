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

    public void embaralhar(Carta[] cartas){
        int qntdCartas = cartas.length;
        Carta[] baralhoCartas = new Carta[qntdCartas];
        Carta carta1;
        Carta carta2;
        Carta auxiliar;

        //usar Math.random para gerar indices aleatórios
       // int indexAleatorio1 = (int)(Math.random() * 10 ) + 1;

        for(int i = 0; i < qntdCartas; i++) {
            int indexAleatorio1 = (int)(Math.random() * 10 ) + 1;
            carta1 = baralhoCartas[indexAleatorio1];  //12

            int indexAleatorio2 = (int)(Math.random() * 10 ) + 1;
            auxiliar = baralhoCartas[indexAleatorio2];  //35

            ;

        }

    }
    /*distribuirCarta(){}*/
    /*hasCarta()*/
    /*imprimirBaralho()*/
}
