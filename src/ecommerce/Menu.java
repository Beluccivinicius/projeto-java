package ecommerce;



import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.CarrinhoController;
import ecommerce.controller.Estoque;
import ecommerce.model.Cliente;
import ecommerce.model.Produtos;
import util.Cores;

public class Menu {

	static Scanner leia = new Scanner(System.in);
	static CarrinhoController carrinho = new CarrinhoController();
	
	public static void main(String[] args) {
		
		System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + 
				"************************************************************************");
		System.out.println("                                                                        ");
		System.out.println("                           AMAZONIA                                     ");
		System.out.println("                                                                        ");

		int tipoUsuario = 0;
		
		do {
			System.out.println("************************************************************************");
			System.out.println("                                                                        ");
			System.out.println("                         1- Vendedor                                    ");
			System.out.println("                         2- Cliente                                     ");
			System.out.println("Olá, favor se identifique: ");
		
			try {
				tipoUsuario = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite um numero");
			}

		
		if(tipoUsuario == 1) {
			
			System.out.println("Seja bem vindo Lojista: ");
			System.out.println("Estamos trabalhando nessa funcionalidade: Erro 404 ");
//			cadastroProduto();
			tipoUsuario = 0;
			
		}else if(tipoUsuario == 2) {
			System.out.println("Seja bem vindo Cliente: ");
			loja();
		}else {
			System.out.println("opção inválida");
		}
		}while(tipoUsuario > 1 || tipoUsuario < 2);

		}
	
	public static void loja() {
		Estoque estoque = new Estoque();
		
		//inicializar Clientes
		Cliente cliente1 = new Cliente(1, "Maria", 30, 400.0f);
		Cliente cliente2 = new Cliente(2, "João", 20, 400.0f);
		
		//Produtos Para comprar
		Produtos produto1 = new Produtos(1, 250.0f, "Bicicleta", 3);
		
		Produtos produto2 = new Produtos(2, 50.0f, "Capacete", 0);
		
		Produtos produto3 = new Produtos(3, 150.0f, "Bota de fazer trilha", 4);
		
		Produtos produto4 = new Produtos(4, 100.0f, "Halter de academia", 5);
		
		//Criar um estoque
		estoque.adicionarElemento(produto4);
		estoque.adicionarElemento(produto1);
		estoque.adicionarElemento(produto2);
		estoque.adicionarElemento(produto3);


		int inputUsuario = 0;
		do {
			System.out.println("************************************************************************");
			System.out.println("                                                                        ");
			System.out.println("                    1- Adicionar produto no carrinho                     ");
			System.out.println("                    2- Ver Carrinho                                     ");
			System.out.println("                    3- Comprar                                          ");
			System.out.println("                    4- Excluir um produto                               ");
			System.out.println("                    5- Sair                                             ");
			System.out.println("                                                                        ");
			System.out.println("************************************************************************");
			
			try {
        		inputUsuario = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite um numero");
			}
			
			leia.nextLine();
			
		switch (inputUsuario) {
        case 1:
        	
        	int produto = 0;
        	int qtd = 0;
        	
			do {
        	estoque.listarProdutoEstoque();
        	
        	System.out.println("Qual produto deseja??\nou aperte -1 para voltar ao menu principal");
        	
        	try {
        		produto = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("**Erro**  Digite um numero");
				leia.nextLine();
				continue;
			}
        	
        	if(estoque.verificarProduto(produto) == false) {
        		System.out.println("Elemento não identificado ");
        		continue;
        	}
        	
        	System.out.println("Quantos produtos deseja?? ");
        	
        	try {
        		qtd = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite um numero");
			}
        	
        	
        	var produtoRetiradoDoEstoque = estoque.retirarElemento(produto, qtd);
        	
        	if(produtoRetiradoDoEstoque == null) {
        		continue;
        	}
        	
        	carrinho.adicionarElementoCarrinho(produtoRetiradoDoEstoque, qtd);
        	
        	}while(produto != -1);
        	
            break;
        case 2:
            carrinho.listarProdutoCarrinho();
            break;
        case 3:
        	//Cliente getSaldo sendo instanciado manualment linha 66/67
    		carrinho.comprarProdutos(carrinho.getTotalCompra(), cliente1.getSaldo(), cliente1.getId());
            break;
        case 4:
        	carrinho.listarProdutoCarrinho();
        	
        	System.out.println("Qual poduto deseja excluir??");
        	int indexProdutoDaLista = 0;
        	
        	try {
        		indexProdutoDaLista = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite um numero");
			}
        	
        	carrinho.excluirProdutoCarrinho(indexProdutoDaLista);
          
            break;
        case 5:
            System.out.println("Obrigado pela visita, seu carrinho será esvaziado!");
            carrinho.excluirTodosOsProdutos();
            inputUsuario = -1;
            break;     
        default:
            System.out.println("Escolha inválida");
            inputUsuario = 0;
    }
		}while(inputUsuario > 0);
		
		System.out.println("************************************************************************");
		System.out.println("                                                                        ");
		System.out.println("AMAZONIA tudo com os melhores preços                                    ");
		System.out.println("                                                                        ");
	
	}
		
		
	}
