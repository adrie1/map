package exception.livro;

/**
 * Classe ReadLivroException
 * @author Adriele e Samara
 */
public class ReadLivroException extends Exception  {
	
	public static final String READLIVRO_MSG = "N�o � poss�vel ler um livro que n�o est� cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public ReadLivroException(String codigo) {
		super(String.format(READLIVRO_MSG, codigo.toString()));
	}

}
