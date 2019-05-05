package setor.subsistema_professor;


/**
 * Classe Professor representando um "sistema" relacionado aos professores
 * @author Adriele e Samara
 */
public class Professor {

	private String tempo;
    private String disciplina;
    
    /**
     * Construtor da classe Professor
     * @param tempo
     * @param disciplina
     */
    public Professor(String tempo, String disciplina) {
    	this.tempo = tempo;
    	this.disciplina = disciplina;
    }
    
	/**
	 * @return tempo de casa que o professor possui
	 */
	public String getTempo() {
		return tempo;
	}

	/**
	 * Seta o tempo de casa do professor
	 * @param tempo
	 */
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	/**
	 * @return disciplina que o professor foi alocado
	 */
	public String getDisciplina() {
		return disciplina;
	}

	/**
	 * Seta a disciplina para alocar o professor
	 * @param disciplina
	 */
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Professor [tempo=" + tempo + ", disciplina=" + disciplina + "]";
	}


}
