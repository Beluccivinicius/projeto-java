package ecommerce.model;

public class Produtos {
	private int id;
	private float preco;
	private int quantidade;
	private String tipoProduto;

	public Produtos(int id, float preco, String tipoProduto, int quantidade) {
		this.id = id;
		this.preco = preco;
		this.tipoProduto = tipoProduto;
		this.quantidade = quantidade;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
