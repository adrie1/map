package controleacademico;

/**
 * Métodos Avançados de Programação - LabExpert
 * @author Samara e Adriele
 */
public class ControleAcademico {

	public static void main(String[] args) {
		
		//Alunos
		Aluno aluno = new Aluno("A01", "Samara Lima");
		Aluno aluno1 = new Aluno("A02", "Adriele Barbosa");
		Aluno aluno2 = new Aluno("A03", "Tamyres Carla");
		Aluno aluno3 = new Aluno("A04", "Breno Henrique");
		Aluno aluno4 = new Aluno("A05", "João Tavares");
		Aluno aluno5 = new Aluno("A06", "Higor Lins");
		
		//Disciplinas
		Disciplina disciplina = new Disciplina("D01", "Laboratório de Programação 2", "Ciência da Computação", "Segunda 11h - 13h/Sexta 11h - 13h");
		Disciplina disciplina1 = new Disciplina("D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Quarta 7h - 9h");
		Disciplina disciplina2 = new Disciplina("D03", "Banco de Dados", "Ciência da Computação", "Terça 7h - 9h/Quinta 9h - 11h");
		Disciplina disciplina3 = new Disciplina("D04", "Cálculo I", "Matemática", "Terça 9h - 11h/Quinta 7h - 9h");
		
		//Professores
		Professor p = new Professor("P01", "Sabrina Souto");
		
		//Controle do aluno
		ControleAluno controlealuno = new ControleAluno();
		
		//Controle do professor
		ControleProfessor controleprofessor = new ControleProfessor();
		
		//Cadastrar aluno na disciplina
		controlealuno.cadastrarAluno(aluno, disciplina);
		controlealuno.cadastrarAluno(aluno, disciplina1);
		controlealuno.cadastrarAluno(aluno, disciplina2);
		controlealuno.cadastrarAluno(aluno, disciplina3);
		controlealuno.cadastrarAluno(aluno1, disciplina2);
		controlealuno.cadastrarAluno(aluno1, disciplina3);
		controlealuno.cadastrarAluno(aluno2, disciplina);
		controlealuno.cadastrarAluno(aluno3, disciplina);
		controlealuno.cadastrarAluno(aluno4, disciplina);
		
		System.out.println("----------DADOS DO ALUNO----------\n");

		//Disciplinas de um aluno
		aluno.disciplinasAluno();
		
		//Alunos de uma disciplina
		controlealuno.getAlunos(disciplina);
		
		//Horário do aluno
		System.out.println("\nHorário do(a) aluno(a) " + aluno.nome + ":\n");
		System.out.println(aluno.getDisciplinas());
		
		//Quantidade de alunos em uma disciplina
		System.out.println("\nQuantidade de alunos na disciplina " + disciplina.getNome() + ":");
		System.out.println(controlealuno.quantidadeAlunos(disciplina));
		
		//Cadastrar professor na disciplina
		controleprofessor.cadastrarProfessor(p, disciplina);
		controleprofessor.cadastrarProfessor(p, disciplina1);
		
		System.out.println("\n----------DADOS DO PROFESSOR----------\n");
		
		//Disciplinas do professor
		p.disciplinasProfessor();
		
		//Horário do professor
		System.out.println("\nHorário do(a) professor(a) " + p.nome + ":\n");
		System.out.println(p.getDisciplinas());		
	}
}
