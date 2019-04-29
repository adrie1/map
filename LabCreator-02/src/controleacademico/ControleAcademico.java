package controleacademico;

/**
 * M�todos Avan�ados de Programa��o - LabCreator
 * @author Samara e Adriele
 */
public class ControleAcademico {

	public static void main(String[] args) {
		
		//Controle do aluno
		ControleAluno controlealuno = new ControleAluno();
		
		//Controle do professor
		ControleProfessor controleprofessor = new ControleProfessor();
		
		//Cadastra o aluno na disciplina
		controlealuno.cadastrarAluno("A01", "Samara Lima", "D01", "Laborat�rio de Programa��o 2", "Ci�ncia da Computa��o", "Segunda 11h - 13h/Sexta 11h - 13h");
		controlealuno.cadastrarAluno("A01", "Samara Lima", "D02", "M�todos Avan�ados de Programa��o", "Ci�ncia da Computa��o", "Segunda 9h - 11h/Quarta 7h - 9h");
		controlealuno.cadastrarAluno("A01", "Samara Lima", "D03", "Banco de Dados", "Ci�ncia da Computa��o", "Ter�a 7h - 9h/Quinta 9h - 11h");
		controlealuno.cadastrarAluno("A01", "Samara Lima", "D04", "C�lculo I", "Matem�tica", "Ter�a 9h - 11h/Quinta 7h - 9h");
		controlealuno.cadastrarAluno("A02", "Adriele Barbosa", "D01", "Laborat�rio de Programa��o 2", "Ci�ncia da Computa��o", "Segunda 11h - 13h/Sexta 11h - 13h");
		controlealuno.cadastrarAluno("A02", "Adriele Barbosa", "D02", "M�todos Avan�ados de Programa��o", "Ci�ncia da Computa��o", "Segunda 9h - 11h/Quarta 7h - 9h");
		controlealuno.cadastrarAluno("A03", "Tamyres Carla", "D01", "Laborat�rio de Programa��o 2", "Ci�ncia da Computa��o", "Segunda 11h - 13h/Sexta 11h - 13h");
		controlealuno.cadastrarAluno("A04", "Breno Henrique", "D01", "Laborat�rio de Programa��o 2", "Ci�ncia da Computa��o", "Segunda 11h - 13h/Sexta 11h - 13h");
		controlealuno.cadastrarAluno("A05", "Jo�o Tavares", "D01", "Laborat�rio de Programa��o 2", "Ci�ncia da Computa��o", "Segunda 11h - 13h/Sexta 11h - 13h");
		
		//Cadastra o professor na disciplina
		controleprofessor.cadastrarProfessor("P01", "Sabrina Souto", "D01", "Laborat�rio de Programa��o 2", "Ci�ncia da Computa��o", "Segunda 11h - 13h/Sexta 11h - 13h");
		controleprofessor.cadastrarProfessor("P01", "Sabrina Souto", "D02", "M�todos Avan�ados de Programa��o", "Ci�ncia da Computa��o", "Segunda 9h - 11h/Quarta 7h - 9h");
		
		System.out.println("----------DADOS DO ALUNO----------\n");

		//Disciplinas de um aluno
		controlealuno.disciplinasAluno("Samara Lima");
		
		//Alunos de uma disciplina
		controlealuno.getAlunos("Laborat�rio de Programa��o 2");
		
		//Hor�rio do aluno
	    controlealuno.horarioAluno("Samara Lima");
		
		//Quantidade de alunos em uma disciplina
		System.out.println("\nQuantidade de alunos na disciplina:\n");
		System.out.println(controlealuno.quantidadeAlunos("Laborat�rio de Programa��o 2"));
		
		
		System.out.println("\n----------DADOS DO PROFESSOR----------\n");

		//Disciplinas do professor
		controleprofessor.disciplinasProfessor("Sabrina Souto");
		
		//Hor�rio do professor
		controleprofessor.horarioProfessor("Sabrina Souto");		
		
	}
}
