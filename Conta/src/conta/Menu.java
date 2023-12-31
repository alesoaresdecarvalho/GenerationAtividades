package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.model.conta;
import conta.util.Cores;

public class Menu {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ContaController conta = new ContaController();
		

		int opcao, numero, agencia, tipo, aniversario, numeroDestino;
		String titular;
		float saldo, limite, valor;
		
		System.out.println("\nCriar Contas\n");
		
		ContaCorrente cc1 = new ContaCorrente(conta.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		conta.cadastrar (cc1);
		ContaCorrente cc2 = new ContaCorrente(conta.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		conta.cadastrar (cc2);
		ContaPoupanca cp1 = new ContaPoupanca (conta.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		conta.cadastrar (cp1);
		ContaPoupanca cp2 = new ContaPoupanca (conta.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
		conta.cadastrar (cp2);
		
		conta.listarTodas();
		
		
		
		
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     "); 
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     "+ Cores.TEXT_RESET);
			opcao = leia.nextInt();
			
			
			try {
				opcao = leia.nextInt();
			}catch (InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			if(opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("\n Criar Conta");
				
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				
				do {
					System.out.println("Digite o Tipo da Conta (1-CC ou 2-CP): ");
				tipo = leia.nextInt();
				}while(tipo < 1 && tipo > 2);
				
				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();
				
				switch(tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();
					conta.cadastrar(new ContaCorrente(conta.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				
				
				case 2 -> {
					System.out.println("Digite o dia do Aniversario da Conta: ");
					aniversario = leia.nextInt();
					conta.cadastrar(new ContaPoupanca (conta.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				
				}
				
				}
				keyPress();
                 break;
			case 2:
				System.out.println("\n Listar todas as Contas");
				conta.listarTodas();
				keyPress();
				
				
                 break;
			case 3:
				System.out.println("\n Buscar Conta por número");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				conta.procurarPorNumero (numero);
				
				keyPress();
				break;
			case 4:
				System.out.println("\n Atualizar dados da Conta");
				
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				if (conta.buscarNaCollection(numero) != null) {
					
			
				System.out.println("Digite o Numero da Agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				
				System.out.println("Digite o Saldo da Conta (R$): ");
				saldo = leia.nextFloat();
				
				tipo = conta.retornaTipo (numero);
				
				switch (tipo) {

				case 1 -> {
				System.out.println("Digite o Limite de Crédito (R$): ");
				limite = leia.nextFloat();
				conta.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
				System.out.println("Digite o dia do Aniversario da Conta: ");
				aniversario = leia.nextInt();
				conta.atualizar (new ContaPoupanca (numero, agencia, tipo, titular, saldo, aniversario));
				}
				default -> {
				System.out.println("Tipo de conta inválido!");
				System.out.println("\nConta não encontrada!");
				}
				}
				} else
				keyPress();
                 break;
			case 5:
				System.out.println("\n Apagar Conta");
				System.out.println("Digite o numero da conta : ");
				numero = leia.nextInt();
				
				conta.deletar(numero);
				
				
				keyPress();
                 break;
			case 6:
				System.out.println("\n Sacar");
				
				System.out.println("Digite o Numero da conta: ");
				numero = leia.nextInt();
				
				do {
				System.out.println("Digite o Valor do Saque (R$): ");
				valor = leia.nextFloat();
				}while(valor <= 0);
				
				conta.sacar (numero, valor);
				keyPress();
				
				break;
             case 7:
				System.out.println("\n Depositar");
				
				System.out.println("Digite o Numero da conta: ");
				numero = leia.nextInt();
				
				do {
					System.out.println("Digite o Valor do Depósito (R$): ");
					valor = leia.nextFloat();
				} while(valor <= 0);
				conta.depositar (numero, valor);
				
				keyPress();
				break;
             case 8:
				System.out.println("\n Transferir");
				
				System.out.println("Digite o Numero da Conta de Origem: ");
				numero = leia.nextInt();
				System.out.println("Digite o Numero da Conta de Destino: ");
				numeroDestino = leia.nextInt();
				do {
				System.out.println("Digite o Valor da Transferência (R$): ");
				valor = leia.nextFloat();
				} while(valor <= 0);
				
				conta.transferir(numero, numeroDestino, valor);
				keyPress();
				
				break;
			default:
				System.out.println("\nOpção Inválida");
                 break;
			}
        }
	}



public static void keyPress() {

	try {

		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
		System.in.read();

	} catch (IOException e) {

		System.out.println("Você pressionou uma tecla diferente de enter!");

	}
	
	
}
}