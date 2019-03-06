package exception.leitor;

import manutencao.leitor.Leitor;

/**
 * Classe CreateLivroException
 * @author Samara
 */
public class CreateLeitorException extends Exception {

public static final String CADASTROLEITOR_MSG = "Não é possível cadastrar duas vezes o mesmo leitor";
	
	/**
	 * Mostra a mensagem da exception.
	 * @param leitor
	 */
	public CreateLeitorException(Leitor leitor) {
		super(String.format(CADASTROLEITOR_MSG, leitor.toString()));
	}
}
