package controleacademico;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Usuario
 * @author Samara e Adriele
 */
public class Usuario {

	protected String id;
	protected String nome;
	protected List<Disciplina> disciplinas;

	/**
	 * Construtor
	 * @param id
	 * @param nome
	 */
	public Usuario(String id, String nome) {
		this.id = id;
		this.nome = nome;
		this.disciplinas = new ArrayList<Disciplina>();
	}

	/**
	 * Métodos get e set
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {

		StringBuffer string = new StringBuffer();
		for (Disciplina disciplina : disciplinas) {
			string.append(disciplina.getNome());
		}
		return string.toString();
	}
}
