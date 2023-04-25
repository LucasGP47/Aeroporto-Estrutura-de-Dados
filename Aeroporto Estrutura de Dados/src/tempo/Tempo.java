package tempo;

import noAr.Aterrissagem;
import noAr.Decolagem;
import noAr.Espera;
import noAr.Pousado;
import nodo.Nodo;

public class Tempo {
    private int tempo;
    private int k;
    private Nodo inicio;
    private int tamanho;

    public Tempo(int tempo, int k) {
        this.tempo = tempo;
        this.k = k;
    }

    public void PassaTempo() {

        Espera aux = new Espera();
        Aterrissagem aux1 = new Aterrissagem();
        Decolagem aux2 = new Decolagem();
        Pousado aux3 = new Pousado();

        for (int i = 0; i < tempo; i++) {

            if (i == 0) {
                for (int j = 1; j <= k; j++) {
                    aux.inserir(j);
                }
            }
        
            if (i >= 1 && !aux.estaVazio()) {
                Integer valor = aux.remover();
                aux1.inserir(valor);
            }

            if (i >= 2 && !aux1.estaVazio()) {
                Integer valor = aux1.remover();
                aux3.inserir(valor);
            }

            if (i >= 4 && !aux3.estaVazio()) {
                Integer valor = aux3.remover();
                aux2.inserir(valor);
            } 

            if (i >= 5 && !aux2.estaVazio()) {
                Integer valor = aux2.remover();
            }
            
            System.out.println("Passo: " + i);
            System.out.println("Avioes em espera no ar: ");
            if (i > 0) {
            aux.ordenarFila();
            }
            aux.imprimirFila();

            System.out.println("Aviões pousando: ");
            aux1.imprimirFila();

            System.out.println("Aviões pousados e abastecendo: ");
            aux3.imprimirFila();

            System.out.println("Aviões decolando: ");
            aux2.imprimirFila();

            System.out.println(" ");
            System.out.println("////////////////////////////////////////////////////////////////////////////");
            System.out.println(" ");

            if (i >= 0) {
                aux.reduzCombustivel();
            }

        }

    }
    
    

       
}
