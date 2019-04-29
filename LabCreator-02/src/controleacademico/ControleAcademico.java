package controleacademico;

/**
 * Métodos Avançados de Programação - LabCreator
 * @author Samara e Adriele
 */
public class ControleAcademico {

	public static void main(String[] args) {
		
		//Controle do aluno
		ControleAluno controlealuno = new ControleAluno();
		
		//Controle do professor
		ControleProfessor controleprofessor = new ControleProfessor();
		
		//Cadastra o aluno na disciplina
		controlealuno.cadastrarAluno("A01", "Samara Lima", "D01", "Laboratório de Programação 2", "Ciência da Computação", "Segunda 11h - 13h/Sexta 11h - 13h");
		controlealuno.cadastrarAluno("A01", "Samara Lima", "D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Quarta 7h - 9h");
		controlealuno.cadastrarAluno("A01", "Samara Lima", "D03", "Banco de Dados", "Ciência da Computação", "Terça 7h - 9h/Quinta 9h - 11h");
		controlealuno.cadastrarAluno("A01", "Samara Lima", "D04", "Cálculo I", "Matemática", "Terça 9h - 11h/Quinta 7h - 9h");
		controlealuno.cadastrarAluno("A02", "Adriele Barbosa", "D01", "Laboratório de Programação 2", "Ciência da Computação", "Segunda 11h - 13h/Sexta 11h - 13h");
		controlealuno.cadastrarAluno("A02", "Adriele Barbosa", "D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Quarta 7h - 9h");
		controlealuno.cadastrarAluno("A03", "Tamyres Carla", "D01", "Laboratório de Programação 2", "Ciência da Computação", "Segunda 11h - 13h/Sexta 11h - 13h");
		controlealuno.cadastrarAluno("A04", "Breno Henrique", "D01", "Laboratório de Programação 2", "Ciência da Computação", "Segunda 11h - 13h/Sexta 11h - 13h");
		controlealuno.cadastrarAluno("A05", "João Tavares", "D01", "Laboratório de Programação 2", "Ciência da Computação", "Segunda 11h - 13h/Sexta 11h - 13h");
		
		//Cadastra o professor na disciplina
		controleprofessor.cadastrarProfessor("P01", "Sabrina Souto", "D01", "Laboratório de Programação 2", "Ciência da Computação", "Segunda 11h - 13h/Sexta 11h - 13h");
		controleprofessor.cadastrarProfessor("P01", "Sabrina Souto", "D02", "Métodos Avançados de Programação", "Ciência da Computação", "Segunda 9h - 11h/Quarta 7h - 9h");
		
		System.out.println("----------DADOS DO ALUNO----------\n");

		//Disciplinas de um aluno
		controlealuno.disciplinasAluno("Samara Lima");
		
		//Alunos de uma disciplina
		controlealuno.getAlunos("Laboratório de Programação 2");
		
		//Horário do aluno
	    controlealuno.horarioAluno("Samara Lima");
		
		//Quantidade de alunos em uma disciplina
		System.out.println("\nQuantidade de alunos na disciplina:\n");
		System.out.println(controlealuno.quantidadeAlunos("Laboratório de Programação 2"));
		
		
		System.out.println("\n----------DADOS DO PROFESSOR----------\n");

		//Disciplinas do professor
		controleprofessor.disciplinasProfessor("Sabrina Souto");
		
		//Horário do professor
		controleprofessor.horarioProfessor("Sabrina Souto");		
		
	}
}
