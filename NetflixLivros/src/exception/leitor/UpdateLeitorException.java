package exception.leitor;

/**
 * Classe UpdateLeitorException
 * @author Adriele e Samara
 */
public class UpdateLeitorException extends Exception{

	public static final String UPDATELEITOR_MSG = "Não é possível atualizar um leitor que não está cadastrado";

	/**
	 * Mostra a mensagem da exception.
	 * @param codigo
	 */
	public UpdateLeitorException(String codigo) {
		super(String.format(UPDATELEITOR_MSG, codigo.toString()));
	}
}
