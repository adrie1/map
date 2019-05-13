package sanduiche;

import ingredientes.Tomate;
import ingredientes.ovo.Ovo;
import ingredientes.ovo.OvoCapoeira;
import ingredientes.pao.Pao;
import ingredientes.pao.PaoBola;
import ingredientes.presunto.Presunto;
import ingredientes.presunto.PresuntoFrango;
import ingredientes.queijo.Queijo;
import ingredientes.queijo.QueijoCheddar;

/**
 * Representa o sanduiche do tipo um
 * 
 * @author Adriele e Samara
 */
public class SanduicheTipoUm extends FactorySanduiche {

	/**
	 * Coloca o pão bola do sanduiche
	 * 
	 * @param pao
	 * @return pao bola
	 */
	public Pao adicionarPao(String pao) {
		return new PaoBola(pao);
	}
	
	/**
	 * Coloca o ovo capoeira no sanduiche
	 * 
	 * @param ovo
	 * @return ovo de capoeira
	 */
	public Ovo adicionarOvo(String ovo) {
		return new OvoCapoeira(ovo);
	}
	
	/**
	 * Coloca o presunto de frango no sanduiche
	 * 
	 * @param presunto
	 * @return presunto de frango
	 */
	public Presunto adicionarPresunto(String presunto) {
		return new PresuntoFrango(presunto);
	}
	
	/**
	 * Coloca o queijo cheddar no sanduiche
	 * 
	 * @param queijo
	 * @return queijo cheddar
	 */
	public Queijo adicionarQueijo(String queijo) {
		return new QueijoCheddar(queijo);
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
