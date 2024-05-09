package ecommerce.controller;

import java.util.List;

import java.util.ArrayList;

import ecommerce.model.Produtos;

public class Estoque{
	
	private List<Produtos> estoque = new ArrayList<Produtos>();
	
	public void listarProdutoEstoque() {
		if(estoque.isEmpty()) {
			System.out.println("Sua lista está vazia!!");
			return;
		}
		
		listaDeProdutos();
	}
	
	public void adicionarElemento(Produtos produtos) {
		estoque.add(produtos);
	}
	
	public Produtos retirarElemento(int posicaoProduto, int quantidadeProduto) {
		try {	
			var objetoNoEstoque = estoque.get(posicaoProduto);
			
			if(objetoNoEstoque.getQuantidade() == 0 || quantidadeProduto > objetoNoEstoque.getQuantidade()) {
				System.out.println("quantidade de produto indisponivel");
			}else {
				objetoNoEstoque.setQuantidade(objetoNoEstoque.getQuantidade() - quantidadeProduto);
				return objetoNoEstoque;
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição não encontrado");
		}
		
		return null;
	}
	
	public boolean verificarProduto(int num){
		if(num < 0 || num > estoque.size()) {
			return false;
		}
		
		var temNoEstoque = estoque.get(num);
		
		if(temNoEstoque == null) {
			return false;
		}
		
		return true;
	}

	private void listaDeProdutos() {
		int i = 0;
		for(var produto : this.estoque) {
			if(produto.getQuantidade() == 0) {
				System.out.println(i + "- " + produto.getTipoProduto() + "  ***Produto Indisponivel***");
				
				i++;
				continue;
			}
			System.out.println(i + "- " + produto.getTipoProduto() + " " + produto.getQuantidade());
			i++;
		}
	}
	
	
}
