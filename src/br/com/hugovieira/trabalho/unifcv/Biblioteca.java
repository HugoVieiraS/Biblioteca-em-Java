package br.com.hugovieira.trabalho.unifcv;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String nomeLivro;
	private String editora;
	private ArrayList<String> autor;
	private StatusLivro status;

	public Biblioteca(String nomeLivro, String editora, String autor, StatusLivro status) {
		this.nomeLivro = nomeLivro;
		this.autor = new ArrayList<String>();
		this.autor.add(autor);
		this.editora = editora;
	}

	List<Biblioteca> livros = new ArrayList<>();

	public void add(Biblioteca livro){
		   livros.add(livro); }  

	public void adicionarLivro(String nomeLivro, String editora, String autor, StatusLivro status) {
		Biblioteca livros = new Biblioteca(nomeLivro, autor, editora, status);
		livros.add(livros);
	}


	public void alugarLivro() {
		System.out.println("Alugar livro");

	}

	public void removerLivro() {
		System.out.println("Remover livro");

	}

	public void devolverLivro() {
		System.out.println("Devolver Livro");

	}

	public void apresentarLivro() {
		System.out.println("Apresentar Livros");

	}

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
