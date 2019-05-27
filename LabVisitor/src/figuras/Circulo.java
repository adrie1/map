package figuras;

import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

/**
 * Classe Circulo que implementa a Classe ElementoConcretoIF
 * @author Adriele e Samara
 */
public class Circulo implements ElementoConcretoIF {
	
	private double raio;
	
	/**
	 * Construtor da classe Circulo
	 * @param raio
	 */
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public String aceitaVisita(VisitorIF v) {
		v.visitaCirculo(this);
		return "Visita Aceita ao Circulo";
	}

	/**
	 * Retorna o raio do circulo
	 * @return raio
	 */
	public double getRaio() {
		return raio;
	}
}
