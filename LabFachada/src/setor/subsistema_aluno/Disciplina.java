package setor.subsistema_aluno;

public class Disciplina {
	
	private int codigo;
	private String nome;
	private String professor;
	private String horario;

	public Disciplina(int codigo, String nome, String professor, String horario) {
		this.codigo = codigo;
		this.nome = nome;
		this.professor = professor;
		this.horario = horario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Disciplina [codigo=" + codigo + ", nome=" + nome + ", professor=" + professor + ", horario=" + horario
				+ "]";
	}

}
