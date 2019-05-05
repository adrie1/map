package setor.subsistema_adm;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Administrativo representando um "sistema" para a parte administrativa
 * @author Adriele e Samara
 */
public class Administrativo {

	private List<String> reunioes;
	private List<String> entrevistas;

	/**
	 * Construtor da classe Administrativo instanciando as reunioes e entrevistas
	 */
	public Administrativo() {
		this.reunioes = new ArrayList<String>();
		this.entrevistas = new ArrayList<String>();
	}
	
	/**
	 * Agenda a reunião
	 * @param reuniao
	 * @return true caso a reunião não tenha sido agendada, se não false
	 */
	public boolean agendarReuniao(String reuniao) {
		if (!reunioes.contains(reuniao)) {
			reunioes.add(reuniao);
			return true;
		} 
		return false;
	}
	
	/**
	 * Agenda a entrevista
	 * @param entrevista
	 * @return true caso a entrevista não tenha sido agendada, se não false
	 */
	public boolean agendarEntrevista(String entrevista) {
		if (!entrevistas.contains(entrevista)) {
			entrevistas.add(entrevista);
			return true;
		}
		return false;
	}

	/**
	 * @return a agenda de reuniões
	 */
	public List<String> getReunioes() {
		return reunioes;
	}

	/**
	 * @return a agenda de entrevistas
	 */
	public List<String> getEntrevistas() {
		return entrevistas;
	}

}
