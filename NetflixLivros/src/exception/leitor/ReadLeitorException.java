package exception.leitor;

/**
 * Classe ReadLeitorException
 * @author Adriele e Samara
 */
public class ReadLeitorException extends Exception {

	public static final String READLEITOR_MSG = "Não é ver informações sobre um leitor que não está cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public ReadLeitorException(String codigo) {
		super(String.format(READLEITOR_MSG, codigo.toString()));
	}
}
