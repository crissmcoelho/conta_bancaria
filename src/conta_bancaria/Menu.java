package conta_bancaria;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in); // Instância o scanner

		int opcao; // Inserção das variáveis

		// Desenvolvimento do menu

		while (true) {

			System.out.println("*******************************************************");
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
				System.out.println("\nBANCO DO BRAZIL COM Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			// Construção do switc case - caso a caso

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");
				break;
			case 3:
				System.out.println("Buscar Conta por Número\n\n");
				break;
			case 4:
				System.out.println("Atualizar Dados da Conta\n\n");
				break;
			case 5:
				System.out.println("Apagar Conta\n\n");
				break;
			case 6:
				System.out.println("Sacar\n\n");
				break;
			case 7:
				System.out.println("Depositar\n\n");
				break;
			case 8:
				System.out.println("Transferir valores entre Contas\n\n");
				break;
			case 0:
				System.out.println("Sair\n\n");
				break;
			default:
				System.out.println("\nOpção Inválida! Digite novamente!\n");
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
