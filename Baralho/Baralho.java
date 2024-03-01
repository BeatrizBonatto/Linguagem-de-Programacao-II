public class Baralho {
    //COnstrutor - criação do bararalho - array
    public Baralho(){
        Carta[] baralhoCartas = new Carta[56]; 
        int i = 0;

        //  tipo variavel : conjunto de elementos
        for(Naipe naipe : Naipe.values()){
            for(Nome nome : Nome.values()){
                if (naipe != Naipe._Coringa && nome != Nome.Coringa) {
                    Carta carta = new Carta(nome, naipe);

                    baralhoCartas[i] = carta;
                    i++;

                    System.out.println(i + " - " + carta.toString());  //-> teste
                }
                else if (naipe == Naipe._Coringa && nome == Nome.Coringa){
                    for(int j = 0; j < 4; j++) {
                        Carta cartaCoringa = new Carta(Nome.Coringa, Naipe._Coringa);
            
                        baralhoCartas[i] = cartaCoringa;
                        i++;
                        System.out.println(i + " - " + cartaCoringa.toString());  //-> teste
                    }
                }
            }
        }
    }

    public void embaralhar(Baralho baralho){
        //usar Math.random
        Carta carta1;
        Carta carta2;
        Carta auxiliar;

        //dpuble indexAleatoria =Math.random();

    }
    /*distribuirCarta(){}*/
    /*hasCarta()*/
    /*imprimirBaralho()*/
}
