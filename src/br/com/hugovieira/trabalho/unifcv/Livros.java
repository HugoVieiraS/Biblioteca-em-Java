package br.com.hugovieira.trabalho.unifcv;

import java.util.ArrayList;

public class Livros {
		private String nomeLivro;
		private String editora;
		private ArrayList<String> autor;
		private StatusLivro status;
		
		public Livros(String nomeLivro, String editora, String autor) {
			this.nomeLivro = nomeLivro;
			this.autor = new ArrayList<String>();
			this.autor.add(autor);
			this.editora = editora;
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
		public ArrayList<String> getAutor() {
			return autor;
		}
		public void setAutor(ArrayList<String> autor) {
			this.autor = autor;
		}
		public StatusLivro getStatus() {
			return status;
		}
		public void setStatus(StatusLivro status) {
			this.status = status;
		}


	}

