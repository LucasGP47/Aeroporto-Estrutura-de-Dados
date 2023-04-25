package nodo;

public class Nodo {
	
	private int dado;
	private Nodo prox;
	private int id;
	private int combustivel;
	private int prioridade;
	
	public Nodo(int dado) {
		this.dado = dado;
		this.prox = null;
	}
	
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public Nodo getProx() {
		return prox;
	}
	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;		
	}
	
	public int getCombustivel() {
		return combustivel;
	}
	
	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public void reduzCombustivel() {
		if (combustivel > 0 && combustivel % 2 == 0) {
            combustivel--;
            
	    }
	}
}