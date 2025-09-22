package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); // Instância o scanner

		int opcao; // Inserção das variáveis

		// Desenvolvimento do menu

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+"*******************************************************");
			System.out.println("                                                       ");
			System.out.println("             BANCO DO BRAZIL COM Z                     ");
			System.out.println("                                                       ");
			System.out.println("*******************************************************");
			System.out.println("                                                       ");
			System.out.println("              1 - Criar Conta                          ");
			System.out.println("              2 - Listar todas as Contas               ");
			System.out.println("              3 - Buscar Conta por Número              ");
			System.out.println("              4 - Atualizar Dados da Conta             ");
			System.out.println("              5 - Apagar Conta                         ");
			System.out.println("              6 - Sacar                                ");
			System.out.println("              7 - Depositar                            ");
			System.out.println("              8 - Transferir valores entre Contas      ");
			System.out.println("              0 - Sair                                 ");
			System.out.println("                                                       ");
			System.out.println("*******************************************************");
			System.out.println("Entre com a opção desejada:                            ");
			System.out.println("                                                       ");

			opcao = leia.nextInt();

			// Implementação do slogan do banco

			if (opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD +"\nBANCO DO BRAZIL COM Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			// Construção do switc case - caso a caso

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Buscar Conta por Número\n\n");
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar Dados da Conta\n\n");
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar Conta\n\n");
				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Sacar\n\n");
				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depositar\n\n");
				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferir valores entre Contas\n\n");
				break;
			case 0:
				System.out.println(Cores.TEXT_WHITE + "Sair\n\n");
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida! Digite novamente!\n");
				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("*******************************************************");
		System.out.println("Projeto Desenvolvido por Cristina Martins Coelho");
		System.out.println("github.com/crissmcoelho");
		System.out.println("*******************************************************");
	}

}
