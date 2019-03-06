package exception.leitor;

/**
 * Classe ReadLeitorException
 * @author Adriele e Samara
 */
public class ReadLeitorException extends Exception {

	public static final String READLEITOR_MSG = "N�o � ver informa��es sobre um leitor que n�o est� cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public ReadLeitorException(String codigo) {
		super(String.format(READLEITOR_MSG, codigo.toString()));
	}
}
