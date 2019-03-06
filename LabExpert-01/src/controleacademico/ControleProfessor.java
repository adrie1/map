package controleacademico;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe ControleProfessor
 * @author Samara e Adriele
 */
public class ControleProfessor {
	
	private List<Professor> professores;
	
	/**
	 * Construtor
	 */
	public ControleProfessor() {
		this.professores = new ArrayList<Professor>();
	}
	
	/**
	 * Cadastra o professor na disciplina
	 * @param prof
	 * @param disc
	 * @return
	 */
	public boolean cadastrarProfessor(Professor prof, Disciplina disc) {
		if (!prof.disciplinas.contains(disc)) {
			prof.disciplinas.add(disc);
			professores.add(prof);
			return true;
		}
		return false;
	}

	/**
	 * Métodos get e set
	 * @return
	 */
	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

}
