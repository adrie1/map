package controleacademico;

import java.util.List;

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
     * Mostra o nome das disciplinas que o professor irá ministrar
     */
    public void disciplinasProfessor() {
    	System.out.println("Disciplinas ministradas pelo(a) professor(a) " + nome + ":\n");
    	for (Disciplina disciplina : disciplinas) {
    		System.out.println(disciplina.getNome());
    	}
    }

}
