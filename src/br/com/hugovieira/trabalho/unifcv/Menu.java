package br.com.hugovieira.trabalho.unifcv;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
////////// UTILIZANDO O DO WHILE PARA FAZER O MENU E EXECUTAR////////////////////////

		System.out.println("\n\n### Sistema de Controle de Biblioteca ###");
		System.out.println("\n                    ====================================");
		System.out.println("                  |     1 - Cadastrar Livro            |");
		System.out.println("                  |     2 - Alugar um livro            |");
		System.out.println("                  |     3 - Remover um livro           |");
		System.out.println("                  |     4 - Devolver um livro          |");
		System.out.println("                  |     5 - Apresentar todos os livros |");
		System.out.println("                  |     0 - Fechar o sistema           |");
		System.out.println("                   ====================================\n");
		System.out.print("\n");

/////////////INSTANCIANDO OS METODOS /////////////////////
		Biblioteca livros = new Biblioteca();
		Scanner opcao = new Scanner(System.in);
		boolean continuar = true;
		String nomeLivro, autor, editora;

///////////////// DO WHILE PARA REPETIR O MENU //////////////////////
		do {
			System.out.print("Escolha uma opção: ");

			switch (opcao.nextInt()) {

			case 1: ///// OPCAO FUNCIONANDO
				System.out.println("Digite o nome do Livro: ");
				nomeLivro = opcao.next();
				System.out.print("Digite o autor: ");
				autor = opcao.next();
				System.out.print("Digite a editora: ");
				editora = opcao.next();
				livros.adicionarLivros(nomeLivro, autor, editora);
				break;

			case 2:
				System.out.println("Digite o nome do livro a ser alugado: ");
				nomeLivro = opcao.next();
				livros.alugarLivro(nomeLivro);
				break;

			case 3:///// OPCAO FUNCIONANDO
				System.out.println("Digite o nome do livro que deseja retirar: ");
				nomeLivro = opcao.next();
				livros.removerLivro(nomeLivro);
				break;

			case 4:
				System.out.println("Digite o nome do livro a ser devolvido: ");
				nomeLivro = opcao.next();
				livros.devolverLivro(nomeLivro);
				break;
				
			case 5:///// OPCAO FUNCIONANDO
				System.out.println("Livros cadastrados: ");
				livros.apresentarLivro();
				break;

			case 0:///// OPCAO FUNCIONANDO
				continuar = false;
				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}

		} while (continuar = true);
	}

}
