package leitura;

import java.util.Scanner;

import manutencao.leitor.Leitor;
import manutencao.livro.Livro;

/**
 * Classe Comentario
 * @author Adriele e Samara
 */
public class Comentario {
	
	private String comentario;

	/**
	 * Construtor da classe Comentario.
	 * @param comentario
	 */
	public Comentario(String comentario) {
		this.comentario = comentario;
	}

	public Comentario() {

	}

	Scanner in = new Scanner(System.in);

	/**
	 * Adiciona o comentário nem uma lista de comentários.
	 * @param status
	 * @param livro
	 */
	public void adicionarComentario(Status status, Livro livro) {
		Comentario c = null;
		
		System.out.println("Deixe uma impressão sobre o livro: ");
		
		if (Status.LIDO.name().equals("LIDO") || Status.LENDO.name().equals("LENDO")) {
		    c = new Comentario(in.nextLine());
		} else if (Status.QUEROLER.name().equals("QUEROLER") || Status.ABANDONADO.name().equals("ABANDONADO")) {
			c = new Comentario(in.nextLine());
		} 
		
		Leitor.comentarios.add(c);
		livro.setComentario(c);
	}

	/**
	 * Métodos get e set
	 * @return
	 */
	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "" + comentario + "";
	}

}
