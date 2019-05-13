package sanduiche;

import ingredientes.Tomate;
import ingredientes.ovo.Ovo;
import ingredientes.pao.Pao;
import ingredientes.presunto.Presunto;
import ingredientes.queijo.Queijo;

/**
 * Sanduiche contendo os ingredientes
 * 
 * @author Adriele e Samara
 */
public class Sanduiche {
	
	private Pao pao;
	private Ovo ovo;
	private Presunto presunto;
	private Queijo queijo;
	private Tomate tomate;

	public Sanduiche() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return o pão
	 */
	public Pao getPao() {
		return pao;
	}

	/**
	 * Seta o pão
	 * 
	 * @param pao
	 */
	public void setPao(Pao pao) {
		this.pao = pao;
	}

	/**
	 * @return o ovo
	 */
	public Ovo getOvo() {
		return ovo;
	}

	/**
	 * Seta o ovo
	 * 
	 * @param ovo
	 */
	public void setOvo(Ovo ovo) {
		this.ovo = ovo;
	}

	/**
	 * @return o presunto
	 */
	public Presunto getPresunto() {
		return presunto;
	}

	/**
	 * Seta o presunto
	 * 
	 * @param presunto
	 */
	public void setPresunto(Presunto presunto) {
		this.presunto = presunto;
	}

	/**
	 * @return o queijo
	 */
	public Queijo getQueijo() {
		return queijo;
	}

	/**
	 * Seta o queijo
	 * 
	 * @param queijo
	 */
	public void setQueijo(Queijo queijo) {
		this.queijo = queijo;
	}

	/**
	 * @return o tomate
	 */
	public Tomate getTomate() {
		return tomate;
	}

	/**
	 * Seta o tomate
	 * 
	 * @param tomate
	 */
	public void setTomate(Tomate tomate) {
		this.tomate = tomate;
	}

	@Override
	public String toString() {
		return "" + pao + "" + ovo + "" + presunto + "" + queijo + "" + tomate;
	}


}
