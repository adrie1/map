package menu;

import java.util.Scanner;

import exception.livro.ReadLivroException;

public class Menu {

	MenuLeitor menuLeitor = new MenuLeitor();
	MenuLivro menuLivro = new MenuLivro();

	Scanner in = new Scanner(System.in);

	public void menuPrincipal() throws ReadLivroException {

		int opcao = 0;

		do {

			System.out.println("--------------------BEM VINDOS AO LEIO SEMPRE---------------------\n");
			System.out.println("1 - LEITOR\n2 - LIVRO\n3 - SAIR\n\nINFORME A OPÇÃO: ");
			opcao = in.nextInt();

			switch (opcao) {
			case 1:
				menuLeitor.menu();
				break;
			case 2:
				menuLivro.menu();
				break;
			case 3:
				System.out.println("Sistema encerrado");
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != 3);
	}
}
