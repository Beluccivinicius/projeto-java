package ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import ecommerce.model.Produtos;
import ecommerce.repository.CarrinhoRepository;

public class CarrinhoController implements CarrinhoRepository{

	private List<Produtos> conteudoCarrinho = new ArrayList<Produtos>();
	private int quantidadeProduto = 0;
	private float totalCompra = 0;

	@Override
	public void listarProdutoCarrinho() {
		
		if(conteudoCarrinho.isEmpty()) {
			System.out.println("Sua lista está vazia!!");
			return;
		}
		
		listaDeProdutos();
		System.out.println("**** total: " + totalCompra + " ****");
	}

	@Override
	public void adicionarElementoCarrinho(Produtos produto, int qtd) {
		produto.setQuantidade(qtd);
		
		quantidadeProduto = quantidadeProduto + qtd;
		
		totalCompra = totalCompra + (produto.getPreco() * qtd);
		
		conteudoCarrinho.add(produto);
		
	}

	@Override
	public void excluirProdutoCarrinho(int posicaoCarrinho) {
		try {
			
			conteudoCarrinho.get(posicaoCarrinho);
			System.out.println("Produto apagado com sucesso");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Posição não encontrado");
			return;
		}

		conteudoCarrinho.remove(posicaoCarrinho);	
		
	}

	@Override
	public void excluirTodosOsProdutos() {
	conteudoCarrinho.clear();	
		
	}
	
//	public void editarProdutosCarrinho() {
//		
//		
//	}

	@Override
	public void comprarProdutos(float totalCompra, float saldo, int idCliente) {
		System.out.println("Muito obrigado por comprar com a amazonia");
		
		if(saldo < totalCompra) {
			System.out.println("Não foi possivel realizar a compra, saldo insuficiente!!");
			return;
		}
		
		totalCompra = 0;
	}
	
	private void listaDeProdutos() {
		int i = 0;
		int total = 0;
		
		for(var produto : this.conteudoCarrinho) {
			System.out.println(i + " - " + produto.getTipoProduto() + "Quantidade: " + produto.getQuantidade());		
			i++;
		}
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public float getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(float totalCompra) {
		this.totalCompra = totalCompra;
	}

	
}
