package sanduiche;

import ingredientes.Tomate;
import ingredientes.ovo.Ovo;
import ingredientes.ovo.OvoDefault;
import ingredientes.pao.Pao;
import ingredientes.pao.PaoDefault;
import ingredientes.presunto.Presunto;
import ingredientes.presunto.PresuntoDefault;
import ingredientes.queijo.Queijo;
import ingredientes.queijo.QueijoDefault;

/**
 * Chama os Factory Methods
 * 
 * @author Adriele e Samara
 */
public class FactorySanduiche {

	/**
	 * Coloca o pão do sanduiche
	 * 
	 * @param pao
	 * @return pao
	 */
	public Pao adicionarPao(String pao) {
		return new PaoDefault(pao);
	}

	/**
	 * Coloca o ovo no sanduiche
	 * 
	 * @param ovo
	 * @return ovo
	 */
	public Ovo adicionarOvo(String ovo) {
		return new OvoDefault(ovo);
	}

	/**
	 * Coloca o presunto no sanduiche
	 * 
	 * @param presunto
	 * @return presunto
	 */
	public Presunto adicionarPresunto(String presunto) {
		return new PresuntoDefault(presunto);
	}

	/**
	 * Coloca o queijo no sanduiche
	 * 
	 * @param queijo
	 * @return queijo
	 */
	public Queijo adicionarQueijo(String queijo) {
		return new QueijoDefault(queijo);
	}

	/**
	 * Coloca o tomate no sanduiche
	 * 
	 * @param tomate
	 * @return tomate
	 */
	public Tomate adicionarTomate(String tomate) {
		return new Tomate(tomate);
	}

}
