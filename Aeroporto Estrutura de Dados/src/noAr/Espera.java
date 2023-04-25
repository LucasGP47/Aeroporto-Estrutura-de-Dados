package noAr;
import java.util.Random;

import nodo.Nodo;

public class Espera {
	
	private Nodo inicio = null;
	private Nodo fim;
	private int limite = 0;
	private int tamanho = 0;
	
	public Espera () {
		this.limite = 15;
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public boolean temEspaço() {
		return limite > tamanho;
	}
	
	public int getInicio() {
		if (!estaVazio()) {
			return inicio.getDado();
		}else {
			System.out.println("0");
			return -1;
		}
	}

	
	public void inserir (int dado) {
		if (temEspaço()) {
			Nodo novo = new Nodo(dado);  
			novo.setCombustivel(geraCombustivel());
			if (estaVazio()) {
				inicio = novo;
				fim = novo;
			} else {
				fim.setProx(novo);
				fim = novo;
			}
			tamanho++;
		} else {
			System.out.println("Filha cheia!!");
		}
	}
	
	public Integer remover() {
	    if (inicio == null) {
	        return null;
	    } else {
	        int valor = inicio.getDado();
	        inicio = inicio.getProx();
	        if (inicio == null) {           
	            fim = null;
	        }
	        tamanho--;
	        return valor;
	    }
	}
	
	public void ordenarFila() {
	    if (estaVazio()) {
	        return;
	    }
	    Nodo anterior = null;
	    Nodo atual = inicio;
	    while (atual != null) {
	        if (atual.getCombustivel() < 4) { 
	            if (anterior != null) {
	                anterior.setProx(atual.getProx());
	            } else {
	                inicio = atual.getProx();
	            }
	            atual.setProx(inicio);
	            inicio = atual;
	            atual = anterior != null ? anterior.getProx() : inicio;
	        } else {
	            anterior = atual;
	            atual = atual.getProx();
	        }
	    }
	}

	public void imprimirFila() {
        Nodo atual = inicio;
        while (atual != null) {
            System.out.print("(Aviao " + atual.getDado() + " // Combustivel atual: " + atual.getCombustivel()+ "); " );
            atual = atual.getProx();
        }
        System.out.println();
    }
	
	public int geraCombustivel() {
		Random random = new Random();
        return random.nextInt(20) + 1;
	}
	
	 public void reduzCombustivel() {
	        Nodo atual = inicio;
	        while (atual != null) {
	            atual.setCombustivel(atual.getCombustivel() - 1);
	            atual = atual.getProx();
	        }
	 }
	 
}
