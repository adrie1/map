package controleacademico;

/**
 * Classe Disciplina
 * @author Samara e Adriele
 */
public class Disciplina {

	private String codigo;
	private String nome;
	private String curso;
	private String horario;

	/**
	 * Construtor
	 * @param codigo
	 * @param nome
	 * @param curso
	 * @param horario
	 */
	public Disciplina(String codigo, String nome, String curso, String horario) {
		this.codigo = codigo;
		this.nome = nome;
		this.curso = curso;
		this.horario = horario;
	}

	/**
	 * Retorna o c�digo
	 * @return
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Seta o c�digo
	 * @param codigo
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Retorna o nome
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Seta o nome
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o curso
	 * @return
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Seta o curso
	 * @param curso
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * Retorna o hor�rio
	 * @return
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * Seta o hor�rio
	 * @param horario
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Disciplina:\nC�digo = " + codigo + "\nNome = " + nome + "\nCurso = " + curso + "\nHor�rio = "
				+ horario + "";
	}

}
