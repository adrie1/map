package controleacademico;

/**
 * Classe Professor
 * @author Samara e Adriele
 */
public class Professor extends Usuario {
	
    /**
     * Construtor
     * @param id
     * @param nome
     */
    public Professor(String id, String nome) {
		super(id, nome);
	}
    
    /**
     * Mostra o nome das disciplinas que o professor ir� ministrar
     */
    public void disciplinas() {
    	for (Disciplina disciplina : disciplinas) {
    		System.out.println(disciplina.getNome());
    	}
    }
    
    /**
	 * Mostra o hor�rio do professor
	 */
	public void horario() {
		System.out.println(getDisciplinas());
	}

	@Override
	public String toString() {
		return "\nProfessor:\nID = " + id + "\nNome = " + nome + "";
	}

}
