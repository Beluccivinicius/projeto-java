package ecommerce.model;

public class Produtos {
	private int id;
	private float preco;
	private String tipoProduto;

	public Produtos(int id, float preco, String tipoProduto) {
		this.id = id;
		this.preco = preco;
		this.tipoProduto = tipoProduto;
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
	
	
	
}
