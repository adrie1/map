package setor.subsistema_aluno;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Aluno representando um "sistema" relacionado aos alunos
 * @author Adriele e Samara
 */
public class Aluno {

	private List<Componente> historico;
	private List<Disciplina> rdm;

	/**
	 * Construtor da classe Aluno instanciando o hist�rico e o rdm
	 */
	public Aluno() {
		this.historico = new ArrayList<Componente>();
		this.rdm = new ArrayList<Disciplina>();
	}

	/**
	 * Insere um componente curricular no hist�rico do aluno
	 * @param componente
	 * @return true caso o componente n�o tenha sido inserido ainda, se n�o false
	 */
	public boolean historico(Componente componente) {
		if (!historico.contains(componente)) {
			historico.add(componente);
			return true;
		}
		return false;
	}
	
	/**
	 * Insere uma disciplina no rdm do aluno
	 * @param disciplina
	 * @return true caso a disciplina n�o tenha sido inserida ainda, se n�o false
	 */
	public boolean rdm(Disciplina disciplina) {
		if (!rdm.contains(disciplina)) {
			rdm.add(disciplina);
			return true;
		}
		return false;
	}

	/**
	 * @return o rdm do aluno
	 */
	public List<Disciplina> getRdm() {
		return rdm;
	}

	/**
	 * @return o hist�rico do aluno
	 */
	public List<Componente> getHistorico() {
		return historico;
	}

}
