package exception.livro;

import manutencao.livro.Livro;

/**
 * Classe CreateLivroException
 * @author Adriele e Samara
 */
public class CreateLivroException extends Exception {

	public static final String CADASTROLIVRO_MSG = "N�o � poss�vel cadastrar duas vezes o mesmo livro";
	
	/**
	 * Mostra a mensagem da exception.
	 * @param livro
	 */
	public CreateLivroException(Livro livro) {
		super(String.format(CADASTROLIVRO_MSG, livro.toString()));
	}

}
