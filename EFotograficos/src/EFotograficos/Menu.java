package EFotograficos;

import java.io.IOException;
import java.util.Scanner;
import Model.Model;
import EFotograficos.util.cores;
import Foto.Controller.Controller;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller();

		Scanner leia = new Scanner(System.in);

		int opcao, idProduto, quantidade;

		while (true) {

			System.out.println(cores.TEXT_BLUE + cores.ANSI_WHITE_BACKGROUND +"                                                     ");
			System.out.println("   A.L EQUIPAMENTOS FOTOGRÁFICOS E ACESSÓRIOS LTDA.  ");
			System.out.println("                                                     ");
			System.out.println("                    ░░▄▄░▄███▄                       ");
			System.out.println("                   ▄▀▀▀▀░▄▄▄░▀▀▀▀▄                   ");
			System.out.println("                   █▒▒▒▒█░░░█▒▒▒▒█                   ");
			System.out.println("                   █▒▒▒▒▀▄▄▄▀▒▒▒▒█                   ");
			System.out.println("                   ▀▄▄▄▄▄▄▄▄▄▄▄▄▄▀                   ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                  1 - Equipamentos                   ");
			System.out.println("                  2 - Lentes                         ");
			System.out.println("                  3 - Acessórios                     ");
			System.out.println("                  4 - Lista de compras               ");
			System.out.println("                  5 - Alterar carrinho               ");
			System.out.println("                  6 - Excluir produto                ");
			System.out.println("                  7 - Quem somos                     ");
			System.out.println("                  8 - Fale Conosco                   ");
			System.out.println("                  9 - Sair                           ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nObrigado e volte sempre:) ");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("\n1 - Nikon D7000  R$5.300 \n\n");
				System.out.println("\n2 - Canon T7  R$4.000 \n\n");

				idProduto = leia.nextInt();
				System.out.println("\nInforme a quantidade: ");
				quantidade = leia.nextInt();

				switch (idProduto) {
				case 1:
					controller.adicionarProduto(new Model(1, "Nikon D7000", 5.300f, quantidade));
					break;
				case 2:
					controller.adicionarProduto(new Model(2, "Canon T7", 4.000f, quantidade));

					break;

				default:
					System.out.println("Oprção Inválida");
					break;
				}

				keyPress();
				break;
			case 2:
				System.out.println("\n1 - Lente Canon 50mm R$1.000 \n\n");
				System.out.println("\n2 - Lente Nikon 18-55mm R$1.200 \n\n");

				idProduto = leia.nextInt();
				System.out.println("\nInforme a quantidade: ");
				quantidade = leia.nextInt();

				switch (idProduto) {
				case 1:
					controller.adicionarProduto(new Model(1, "Lente Canon 50mm", 1.000f, quantidade));
					break;
				case 2:
					controller.adicionarProduto(new Model(2, "Lente Nikon 18-55mm", 1.200f, quantidade));

					break;

				default:
					System.out.println("Oprção Inválida");
					break;
				}

				keyPress();
				break;
			case 3:
				System.out.println("\n1 - Baterias - R$150,00\n\n");
				System.out.println("\n2 - Cartão de memória 32 GB - R$ 90,00\n\n");

				idProduto = leia.nextInt();
				System.out.println("\nInforme a quantidade: ");
				quantidade = leia.nextInt();

				switch (idProduto) {
				case 1:
					controller.adicionarProduto(new Model(1, "Baterias", 150.0f, quantidade));
					break;
				case 2:
					controller.adicionarProduto(new Model(2, "Cartão de memória 32 GB", 90.0f, quantidade));

					break;

				default:
					System.out.println("Opção Inválida");
					break;
				}

				keyPress();
				break;
			case 4:
				System.out.println("\nLista de compras  \n\n");

				controller.listarProduto();

				keyPress();
				break;
			case 5:

				controller.listarProduto();
				System.out.println("\nInforme o código que deseja alterar: ");
				idProduto = leia.nextInt();
				var prod = controller.buscarNaCollection(idProduto);
				System.out.println("Informe a quantidade: ");
				quantidade = leia.nextInt();
				
				prod.setQuantidade(quantidade);
				controller.atualizarProduto(prod);
				
				

				keyPress();
				break;
			case 6:
				controller.listarProduto();
				System.out.println("\nInforme o código que deseja excluir:  \n\n");
				idProduto = leia.nextInt();
				controller.deletarProduto(idProduto);
				
				

				keyPress();
				break;
			case 7:
				System.out.println("\nQuem somos?\n\n");
				System.out.println(
						"\nSomos a empresa A.L Equipamentos fotográficos localizada em São Paulo, fundada em 2023 com intuito de trazer para os nosso clientes os melhores produtos do mercado com as melhores tecnologias. \n\n");

				keyPress();
				break;
			case 8:
				System.out.println("Fale Conosco \n\n");
				System.out.println("Whatsapp: 11 986827889 \n\n");
				System.out.println("E-mail: alequipamentos@gmail.com \n\n");
				System.out.println("Site: www.alequipamentosf.com.br \n\n");
				System.out.println("Instagram: @ALEQUIPAMENTOSF \n\n");

				keyPress();
				break;
			case 9:
				System.out.println("Sair\n\n");

				keyPress();
				break;

			default:
				System.out.println("\nOpção Inválida!\n");

				keyPress();
				break;

			}
		}
	}

	public static void keyPress() {

		try {

			System.out.println(cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}

	}

}
