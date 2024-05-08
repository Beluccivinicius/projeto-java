package ecommerce;



import java.util.Scanner;

import ecommerce.model.Loja;
import ecommerce.model.Produtos;
import util.Cores;

public class Menu {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + 
				"************************************************************************");
		System.out.println("                                                                        ");
		System.out.println("                           AMAZONIA                                     ");
		System.out.println("                                                                        ");
		System.out.println("************************************************************************");
		System.out.println("                                                                        ");
		System.out.println("                         1- Vendedor                                    ");
		System.out.println("                         2- Cliente                                     ");

		int tipoUsuario;
		
		do {
		System.out.println("Olá, favor se identifique: ");
		
		tipoUsuario = leia.nextInt();
		
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
		}while(tipoUsuario > 1 && tipoUsuario < 2);
			
		System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLUE_BACKGROUND + 
				"************************************************************************");
		System.out.println("                                                                        ");
		System.out.println("AMAZONIA tudo com os melhores preços                                    ");
		System.out.println("                                                                        ");
		System.out.println("************************************************************************");

		}
	
	public static boolean loja() {

		int inputUsuario;
		do {
			System.out.println("************************************************************************");
			System.out.println("                                                                        ");
			System.out.println("                    1- Bicicleta                                        ");
			System.out.println("                    2- Capacete                                         ");
			System.out.println("                    3- Bota de fazer trilha                             ");
			System.out.println("                    4- Finalizar Compra                                 ");
			System.out.println("                    5- Ver Carrinho                                     ");
			System.out.println("                    6- Sair                                             ");
			System.out.println("                                                                        ");
			System.out.println("************************************************************************");
			
			inputUsuario = leia.nextInt();
			leia.nextLine();
			
		switch (inputUsuario) {
        case 1:
        	System.out.println("Você escolheu Bicicleta. Preço: R$ 250,00");
            break;
        case 2:
            System.out.println("Você escolheu Capacete. Preço: R$ 50,00");
            break;
        case 3:
            System.out.println("Você escolheu Bota de fazer trilha. Preço: R$ 150,00");
            break;
        case 4:
            System.out.println("Sua compra deu: "); //Valor final carrinho
            break;
        case 5:
            System.out.println("seu carrinho contém: "); //listar Produtos carrinho);
            break;
        case 6:
            System.out.println("Obrigado pela visita, seu carrinho será esvaziado!");
            break;
        default:
            System.out.println("Escolha inválida");
    }
		}while(inputUsuario != 6);
		
		return true;
	}
		
		
	}
