package leitura;
import manutencao.livro.Livro;

/**
 * Classe Leitura
 * @author Adriele e Samara
 */
public class Leitura {

	private Status status;
	private Livro livro;


	/**
	 * Construtor da classe Leitura.
	 * @param status
	 * @param livro
	 */
	public Leitura(Status status, Livro livro) {
		this.status = status;
		this.livro = livro;
	}

	/**
	 * Métodos get e set
	 * @return
	 */
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "\n\nStatus = " + status + "\n" + livro + "";
	}

}
