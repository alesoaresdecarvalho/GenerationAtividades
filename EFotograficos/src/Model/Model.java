package Model;

public class Model {
	
	private int cod;
	private String nome;
	private float preco;
	private int quantidade;
	
	public Model(int cod, String nome, float preco, int quantidade) {
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void visualizar() {
		System.out.println("\n Código do produto " + cod + " Nome Produto: " + nome + " Preço do produto " + preco+ " Quantidade produto " + quantidade+ " Total " +calcularTotal());
	}
	
	public float calcularTotal() {
		
		return preco*quantidade;
		
	}
	
		

}
