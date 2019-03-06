package manutencao.livro;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import leitura.Comentario;

/**
 * Classe Livro contendo seus atributos.
 * @author Adriele e Samara
 */

@XStreamAlias("livro")
public class Livro {

	private String isbn;
	private String titulo;
	private int edicao;
	private String autor;
	private String ano;
	private String editora;
	private String idioma;
	private String assunto;
	private String descricao;
	private Comentario comentario;
	
	/**
	 * Construtor da classe Livro.
	 * @param isbn
	 * @param titulo
	 * @param edicao
	 * @param autor
	 * @param ano
	 * @param editora
	 * @param idioma
	 * @param assunto
	 * @param descricao
	 */
	public Livro(String isbn, String titulo, int edicao, String autor, String ano, String editora, String idioma, String assunto, String descricao) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicao = edicao;
		this.autor = autor;
		this.ano = ano;
		this.editora = editora;
		this.idioma = idioma;
		this.assunto = assunto;
		this.descricao = descricao;
	//	comentario = new ArrayList<Comentario>();
	}
	
	public Livro() {
		
	}

	/**
	 * Métodos get e set de cada atributo.
	 * @return
	 */
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}	

	@Override
	public String toString() {
		return "\nISBN = " + isbn + "\nTítulo = " + titulo + "\nEdição = " + edicao + "\nAutor = " + autor + "\nAno = " + ano
				+ "\nEditora = " + editora + "\nIdioma = " + idioma + "\nAssunto = " + assunto + "\nDescrição = " + descricao
				+ "\nComentário do livro = " + comentario + "";
	}


}
