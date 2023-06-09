package noAr;

import java.util.Random;

import nodo.Nodo;

public class Decolagem {

	private Nodo inicio = null;
	private Nodo fim;
	private int limite = 0;
	private int tamanho = 0;
	
	public Decolagem () {
		this.limite = 15;
	}
	
	public boolean estaVazio() {
		return tamanho == 0;
	}
	
	public boolean temEspašo() {
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
	
	public void inserir(int dado) {    
		if (temEspašo()) {
	        Nodo novo = new Nodo(dado);
	        novo.setId(geraID()); 
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
            System.out.print("Aviao " + atual.getDado() + "; ID de decolagem: " + atual.getId());
            atual = atual.getProx();
        }
        System.out.println();
    }
	
	public int geraID() {	
		
		Random gerador = new Random();
	     int id = gerador.nextInt(50) * 2 + 2;
	     return id;
		
	}
	
}
