package setor.subsistema_infra;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Infraestrutura representando um "sistema" relacionado as salas alocadas
 * @author Adriele e Samara
 */
public class Infraestrutura {
	
	private List<String> salas;
	
	/**
	 * Construtor da classe Infraestrutura
	 */
	public Infraestrutura() {
		this.salas = new ArrayList<String>();
	}
	
	/**
	 * Aloca a sala
	 * @param sala
	 * @return true caso não tenha sido alocada ainda, se não false
	 */
	public boolean alocarSala(String sala) {
		if (!salas.contains(sala)) {
			salas.add(sala);
			return true;
		}
		return false;
	}

	/**
	 * @return as salas alocadas
	 */
	public List<String> getSalas() {
		return salas;
	}

}
