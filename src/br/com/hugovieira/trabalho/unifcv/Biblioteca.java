package br.com.hugovieira.trabalho.unifcv;

import java.util.ArrayList;
import java.util.List;

////////////////ATRIBUTOS DA CLASSE BIBLIOTECA ////////////////////////
public class Biblioteca {
	private String nomeLivro;
	private String editora;
	private ArrayList<String> autor;
	private StatusLivro status;

//////////////// MÉTODO DA CLASSE BIBLIOTECA/////////////////////////// 
	public Biblioteca(String nomeLivro, String editora, String autor, StatusLivro status) {
		this.nomeLivro = nomeLivro;
		this.autor = new ArrayList<String>();
		this.autor.add(autor);
		this.editora = editora;
	}
	
///////////////FAZENDO UMA LISTA DA CLASSE BIBLIOTECA E A NOMEANDO COMO LIVROS/////////////////////////
	List<Biblioteca> livros = new ArrayList<>();

//////////////METODO "ADD" PARA ADICIONAR LIVROS NA CLASSE BIBLIOTECA/////////////////////
	public void add(Biblioteca livro) {
		livros.add(livro);
	}

//////////////MÉTODO PARA ADICIONAR LIVROS, PASSANDO OS PARAMETROS DO QUE É NECESSÁRIOE USANDO O METODO ADD //////////////
	public void adicionarLivro(String nomeLivro, String editora, String autor, StatusLivro status) {
		Biblioteca livros = new Biblioteca(nomeLivro, autor, editora, status);
		livros.add(livros);
	}

///////////////MÉTODO PARA ALUGAR LIVRO DA BIBLIOTECA ////////////////////////////
	public void alugarLivro() {
		System.out.println("Alugar livro");

	}

//////////////////METODO "REMOVER"/////////////////////////
	public void remover(Biblioteca livro) {
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
	public Biblioteca apresentarLivro(String titulo) {
		for (int i = 0; i < livros.size(); i++) {
			if (livros.get(i).getNomeLivro().equals(titulo))
				return livros.get(i);
		}
		return null;
	}

/////////////////  GETS E SETS DOS ATRIBUTOS   //////////////
	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public ArrayList getAutor() {
		return autor;
	}

	public void setAutor(ArrayList autor) {
		this.autor = autor;
	}

	public StatusLivro getStatus() {
		return status;
	}

	public void setStatus(StatusLivro status) {
		this.status = status;
	}
}
