package sanduiche;

import ingredientes.Tomate;
import ingredientes.ovo.Ovo;
import ingredientes.ovo.OvoGranja;
import ingredientes.pao.Pao;
import ingredientes.pao.PaoFrances;
import ingredientes.presunto.Presunto;
import ingredientes.presunto.PresuntoPeru;
import ingredientes.queijo.Queijo;
import ingredientes.queijo.QueijoMussarela;

/**
 * Representa o sanduiche tipo dois
 * 
 * @author Adriele e Samara
 */
public class SanduicheTipoDois extends FactorySanduiche {

	/**
	 * Coloca o pão francês do sanduiche
	 * 
	 * @param pao
	 * @return pao frances
	 */
	public Pao adicionarPao(String pao) {
		return new PaoFrances(pao);
	}
	
	/**
	 * Coloca o ovo no sanduiche
	 * 
	 * @param ovo
	 * @return ovo de granja
	 */
	public Ovo adicionarOvo(String ovo) {
		return new OvoGranja(ovo);
	}
	
	/**
	 * Coloca o presunto de peru no sanduiche
	 * 
	 * @param presunto
	 * @return presunto de peru
	 */
	public Presunto adicionarPresunto(String presunto) {
		return new PresuntoPeru(presunto);
	}
	
	/**
	 * Coloca o queijo mussarela no sanduiche
	 * 
	 * @param queijo
	 * @return queijo mussarela
	 */
	public Queijo adicionarQueijo(String queijo) {
		return new QueijoMussarela(queijo);
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
