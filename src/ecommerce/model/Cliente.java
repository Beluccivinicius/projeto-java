package ecommerce.model;

public class Cliente extends Pessoa {
	private float saldo;

	public Cliente(int id, String nome, int idade, float saldo) {
		super(id, nome, idade);
		this.setSaldo(saldo);
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public boolean comprarProduto(float valorCarrinho) {
		if(valorCarrinho > this.saldo) {
			return false;			
		}
		
		System.out.println("\nCompra realizada com sucesso!!!");
		return true;
			
	}
	
}
