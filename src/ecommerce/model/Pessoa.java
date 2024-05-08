package ecommerce.model;

public abstract class Pessoa {
	private int Id;
	private String nome;
	private int idade;
	
	
	public Pessoa(int id, String nome, int idade) {
		Id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getId() {
		return Id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static void cadastrarProduto() {
		System.out.println("\nCadastrar produto");
	}
	
	
	public abstract boolean comprarProduto(float valorCarrinho);
}
