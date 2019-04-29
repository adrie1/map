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
	
	/**
	 * Mostra o nome das disciplinas do aluno
	 */
	public void disciplinas() {
		for (Disciplina disciplina : disciplinas) {
			System.out.println(disciplina.getNome());
		}
	}
	
	/**
	 * Mostra o horário do aluno
	 */
	public void horario() {
		System.out.println(getDisciplinas());
	}
	
	@Override
	public String toString() {
		return "\nAluno:\nID = " + id + "\nNome = " + nome + "";
	}

}
