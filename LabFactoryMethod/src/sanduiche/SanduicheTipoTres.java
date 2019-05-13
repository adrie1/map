package sanduiche;

import ingredientes.Tomate;
import ingredientes.ovo.Ovo;
import ingredientes.ovo.OvoCapoeira;
import ingredientes.pao.Pao;
import ingredientes.pao.PaoIntegral;
import ingredientes.presunto.Presunto;
import ingredientes.presunto.PresuntoPeru;
import ingredientes.queijo.Queijo;
import ingredientes.queijo.QueijoPrata;

/**
 * Representa o sanduiche tipo três
 * 
 * @author Adriele e Samara
 */
public class SanduicheTipoTres extends FactorySanduiche {

	/**
	 * Coloca o pão integral do sanduiche
	 * 
	 * @param pao
	 * @return pao integral
	 */
	public Pao adicionarPao(String pao) {
		return new PaoIntegral(pao);
	}
	
	/**
	 * Coloca o ovo de capoeira do sanduiche
	 * 
	 * @param ovo
	 * @return ovo de capoeira
	 */
	public Ovo adicionarOvo(String ovo) {
		return new OvoCapoeira(ovo);
	}
	
	/**
	 * Coloca o presunto de peru do sanduiche
	 * 
	 * @param presunto
	 * @return presunto de peru
	 */
	public Presunto adicionarPresunto(String presunto) {
		return new PresuntoPeru(presunto);
	}
	
	/**
	 * Coloca o queijo prata no sanduiche
	 * 
	 * @param queijo
	 * @return queijo prata
	 */
	public Queijo adicionarQueijo(String queijo) {
		return new QueijoPrata(queijo);
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
