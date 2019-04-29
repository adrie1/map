package controleacademico;

/**
 * Classe Aluno
 * @author Samara e Adriele
 */
public class Aluno extends Usuario {

	final int LIMITE_DISCIPLINAS = 7;

	/**
	 * Construtor
	 * @param id
	 * @param nome
	 */
	public Aluno(String id, String nome) {
		super(id, nome);
	}


	@Override
	public String toString() {
		return "\nAluno:\nID = " + id + "\nNome = " + nome + "";
	}

}
