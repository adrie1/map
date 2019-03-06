package exception.livro;

/**
 * Classe ReadLivroException
 * @author Adriele e Samara
 */
public class ReadLivroException extends Exception  {
	
	public static final String READLIVRO_MSG = "Não é possível ler um livro que não está cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public ReadLivroException(String codigo) {
		super(String.format(READLIVRO_MSG, codigo.toString()));
	}

}
