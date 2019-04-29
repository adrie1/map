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
	 * @param idAluno
	 * @param nomeAluno
	 * @param codigo
	 * @param nomeDisc
	 * @param curso
	 * @param horario
	 * @return
	 */
	public boolean cadastrarAluno(String idAluno, String nomeAluno, String codigo, String nomeDisc, String curso, String horario) {
		Aluno aluno = new Aluno(idAluno, nomeAluno);
		Disciplina disc = new Disciplina(codigo, nomeDisc, curso, horario);
		
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
	 * Mostra os alunos cadastrados em uma determinada disciplina
	 * @param nomeDisciplina
	 */
	public void getAlunos(String nomeDisciplina) {
        int i = 0;

		System.out.println("\nAlunos cadastrados na disciplina " + nomeDisciplina + ":");
		for (Aluno aluno : alunos) {
			if (aluno.getDisciplinas().get(i).getNome().equals(nomeDisciplina)) {
				System.out.println(aluno);
			}
		}
	}
	
	
	/**
	 * Retorna a quantidade de alunos em uma determinada disciplina
	 * @param nomeDisciplina
	 * @return
	 */
	public int quantidadeAlunos(String nomeDisciplina) {
		int i = 0;
		int contador = 0;
		
		for (Aluno aluno : alunos) {
			if (aluno.getDisciplinas().get(i).getNome().equals(nomeDisciplina)) {
				contador++;
			}
		}
		return contador;
	}
	
	
	/**
	 * Mostra as disciplinas do aluno
	 * @param nomeAluno
	 */
	public void disciplinasAluno(String nomeAluno) {
		System.out.println("Disciplinas cadastradas do(a) aluno(a) " + nomeAluno + ":\n");
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equals(nomeAluno)) {
				aluno.disciplinas();
			}
		}		
	} 
	
	/**
	 * Mostra o horário do aluno
	 * @param nomeAluno
	 */
	public void horarioAluno(String nomeAluno) {
		System.out.println("\nHorário do(a) aluno(a) " + nomeAluno + ":\n");
		for (Aluno aluno : alunos) {
			if (aluno.getNome().equals(nomeAluno)) {
				aluno.horario();
			}
		}
	}
	
	
	/**
	 * Retorna a lista de alunos
	 * @return
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * Seta a lista de alunos
	 * @param alunos
	 */
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}	

}

