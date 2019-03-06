package controleacademico;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe ControleAluno
 * @author Samara e Adriele
 */
public class ControleAluno {
	
	private List<Aluno> alunos;
	
	/**
	 * Construtor 
	 */
	public ControleAluno() {
		this.alunos = new ArrayList<Aluno>();
	}
	
	/**
	 * Cadastra o aluno na disciplina
	 * @param aluno
	 * @param disc
	 * @return
	 */
	public boolean cadastrarAluno(Aluno aluno, Disciplina disc) {
		if (!aluno.disciplinas.contains(disc)) {
			if (aluno.disciplinas.size() < aluno.LIMITE_DISCIPLINAS) {
				aluno.disciplinas.add(disc);

				if (!alunos.contains(aluno)) {
					alunos.add(aluno);
				}
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Retorna a quantidade de alunos em uma determinada disciplina
	 * @param disc
	 * @return
	 */
	public int quantidadeAlunos(Disciplina disc) {
		int contador = 0;
		
		for (Aluno aluno : alunos) {
			if (aluno.disciplinas.contains(disc)) {
				contador++;
			}
		}
		return contador;
	}
	
	/**
	 * Mostra os alunos cadastrados em uma determinada disciplina
	 */
	public void getAlunos(Disciplina disc) {
		System.out.println("\nAlunos cadastrados na disciplina " + disc.getNome() + ":");
		for (Aluno aluno : alunos) {
			if (aluno.disciplinas.contains(disc)) {
				System.out.println(aluno);
			}
		}
	}

	/**
	 * Métodos get e set
	 * @return
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
}

