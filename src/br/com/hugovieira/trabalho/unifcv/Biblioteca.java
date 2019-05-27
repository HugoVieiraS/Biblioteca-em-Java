package br.com.hugovieira.trabalho.unifcv;

import java.util.ArrayList;
import java.util.List;



public class Biblioteca {
	private String nomeLivro;
	private String editora;
	private String autor;
	private StatusLivro status;

	public void adicionarLivro() {
		System.out.println("Adicionar Livro");
		
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

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public StatusLivro getStatus() {
		return status;
	}

	public void setStatus(StatusLivro status) {
		this.status = status;
	}

}
