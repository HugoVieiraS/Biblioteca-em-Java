package br.com.hugovieira.trabalho.unifcv;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
///////////////FAZENDO UMA LISTA DA CLASSE LIVROS/////////////////////////
	List<Livros> livros = new ArrayList<>();

	
	public Biblioteca() {
	}

///////////// METODO ADICIONAR LIVROS////////////
	public void adicionarLivros(String nomeLivro, String editora, String autor) {
		Livros livro = new Livros(nomeLivro, editora, autor);
		livros.add(livro);
	}

	public void adicionarLivros(Livros livro) {
		livros.add(livro);
	}

///////////////MÉTODO PARA ALUGAR LIVRO DA BIBLIOTECA ////////////////////////////
	public void alugarLivro(String nomeLivro) {
	for (Livros a: this.livros) {
		if (a.getNomeLivro().equals(nomeLivro) && !a.Alugado) {
			a.Alugado = true;
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("livro " + a.getNomeLivro()+ " alugado com sucesso!!");
			System.out.println("---------------------------------------------------------------------------------");
			return;
		}else {
			System.out.println("Livro não encontrado");
		}
	}
}
	public void alugarLivro(boolean alugado) {
		if (alugado == true) {
			System.out.println("Livro alugado");
		}else {
			System.out.println("Livro disponivel");
		}
	}

////////////////METODO PARA REMOVER LIVRO DA BIBLIOTECA, USANDO O METODO REMOVER //////////////////////////
	public void removerLivro(String nomeLivro) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getNomeLivro().equals(nomeLivro)) {
				livros.remove(i);
				System.out.println("Livro removido");
			}else { 
				System.out.println("Livro não encontrado");
		}
	}
}

//////////////////METODO "REMOVER"/////////////////////////
	public void removerLivro(Livros livro) {
		livros.remove(livro);
	}

//////////METODO PARA DEVOLVER LIVROS A BIBLIOTECA ////////////////////////////
	public void devolverLivro(String nomeLivro) {
		for (Livros a: livros) {
			if(a.getNomeLivro().equals(nomeLivro) && a.Alugado) {
				a.Alugado = false;
				System.out.println("Livro devolvido");
			} else {
				System.out.println("Livro não encontrado");
			}
		}
	}
//////////METODO PARA APRESENTAR TODOS OS LIVROS DO SISTEMA/////////////
	public void apresentarLivro() {
		for (Livros a : livros) {
			System.out.println(a);
		}
	}
}
