package manutencao.leitor;

import leitura.Comentario;
import manutencao.livro.Livro;

/**
 * Classe Perfil
 * @author Adriele e Samara
 */
public class Perfil {

	private Leitor leitor;

	/**
	 * Mostra os dados do leitor.
	 * @param leitor
	 */
	public void mostrarPerfil(Leitor leitor) {
		System.out.println("\n----------PERFIL----------");
		System.out.println(leitor.toString());
	}

	/**
	 * Métodos get e set
	 * @return
	 */
	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}


}
