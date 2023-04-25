package noAr;

import nodo.Nodo;

public class Pousado {

	private Nodo inicio = null;
	private Nodo fim;
	private int limite = 0;
	private int tamanho = 0;
	
	public Pousado () {
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
			System.out.println("Fila esta vazia");
			return -1;
		}
	}
	
	public void inserir (int dado) {
		if (temEspaço()) {
			Nodo novo = new Nodo(dado);
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
	
	public void imprimirFila() {
        Nodo atual = inicio;
        while (atual != null) {
            System.out.print("Aviao " + atual.getDado() + "; ");
            atual = atual.getProx();
        }
        System.out.println();
    }
	
}
