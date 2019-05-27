package figuras;

import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

/**
 * Classe Retangulo que implementa ElementoConcretoIF
 * @author Adriele e Samara
 */
public class Retangulo implements ElementoConcretoIF {

	private double base;
	private double altura;

	/**
	 * Construtor da classe Retangulo
	 * @param base
	 * @param altura
	 */
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public String aceitaVisita(VisitorIF v) {
		v.visitaRetangulo(this);
		return "Visita Aceita ao Retangulo";
	}

	/**
	 * Retorna a base do retangulo
	 * @return base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * Retorna a altura do retangulo
	 * @return altura
	 */
	public double getAltura() {
		return altura;
	}
}
