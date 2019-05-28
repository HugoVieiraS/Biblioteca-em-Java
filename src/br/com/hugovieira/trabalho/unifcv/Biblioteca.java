package br.com.hugovieira.trabalho.unifcv;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca{
///////////////FAZENDO UMA LISTA DA CLASSE BIBLIOTECA E A NOMEANDO COMO LIVROS/////////////////////////
	List<Livros> livros = new ArrayList<>();
	
	public Biblioteca() {
		
	}


//////////////MÉTODO PARA ADICIONAR LIVROS, PASSANDO OS PARAMETROS DO QUE É NECESSÁRIOE USANDO O METODO ADD //////////////
	public void adicionarLivro(String nomeLivro, String editora, String autor, StatusLivro status) {
		Livros livros = new Livros(nomeLivro, autor, editora, status);
		livros.add(livros);
	}

///////////////MÉTODO PARA ALUGAR LIVRO DA BIBLIOTECA ////////////////////////////
	public void alugarLivro() {
		System.out.println("Alugar livro");

	}

//////////////////METODO "REMOVER"/////////////////////////
	public void remover(Livros livro) {
		livros.remove(livro);
	}

////////////////METODO PARA REMOVER LIVRO DA BIBLIOTECA, USANDO O METODO REMOVER //////////////////////////
	public void removerLivro(String nomeLivro) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getNomeLivro().equals(nomeLivro))
				livros.remove(i);
			else
				System.out.println("Livro não encontrado");
		}
	}

//////////METODO PARA DEVOLVER LIVROS A BIBLIOTECA ////////////////////////////
	public void devolverLivro() {
		System.out.println("Devolver Livro");

	}

////////// METODO PARA APRESENTAR TODOS OS LIVROS DO SISTEMA/////////////
	public void retornaLista() {
		for (int i = 0; i < livros.size(); i++) {
			System.out.println(livros.get(i).getNomeLivro());
		}
	}

//////////METODO PARA APRESENTAR TODOS OS LIVROS DO SISTEMA/////////////
	public Livros apresentarLivro(String titulo) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getNomeLivro().equals(titulo))
				return livros.get(i);
		}
		return null;
	}

}
