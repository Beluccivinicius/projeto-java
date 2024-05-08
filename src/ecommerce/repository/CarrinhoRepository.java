package ecommerce.repository;

import ecommerce.model.Produtos;

public interface CarrinhoRepository {
	
	public void listarProdutoCarrinho();
	public void adicionarElementoCarrinho(Produtos produto, int qtd);
	public void excluirProdutoCarrinho(int posicaoCarrinho);
	public void excluirTodosOsProdutos();
//	public void editarProdutosCarrinho();
	
	//Método de compra produto
	public void comprarProdutos(float totalCompra, float saldo, int idCliente);

}
