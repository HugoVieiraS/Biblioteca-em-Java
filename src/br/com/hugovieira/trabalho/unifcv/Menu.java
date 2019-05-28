package br.com.hugovieira.trabalho.unifcv;

import java.util.Scanner;



public class Menu {

	public static void main (String[] args) {
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
		Scanner sc = new Scanner(System.in);
		Integer opcao = null;
		String nomeLivro, autor, editora;
		
		
			do {
			switch (sc.nextInt(opcao)) {
			case 1:
				System.out.println("Digite o nome do Livro: ");
				sc.next(nomeLivro);
				System.out.print("Digite o autor: ");
                sc.next(autor);
                System.out.print("Digite a editora: ");
                sc.next(editora);
                livros.adicionarLivro(nomeLivro, autor, editora, StatusLivro.DISPONIVEL);
				break;
			case 2:
				livros.alugarLivro();
				break;
			case 3:
				/*livros.removerLivro("Branca de neve");*/
				break;
			case 4:
				livros.devolverLivro();
				break;
			case 5:
				livros.apresentarLivro(null);
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
				
			}
		} while (opcao != 0);
		sc.close();
	}
	
}
