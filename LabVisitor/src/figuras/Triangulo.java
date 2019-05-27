package figuras;

import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

/**
 * Classe Triangulo que implementa ElementoConcretoIF
 * @author Adriele e Samara
 */
public class Triangulo implements ElementoConcretoIF {
	
	private double ladoBase;
	private double ladoAltura;
	private double lado3;
	
	/**
	 * Construtor da classe Triangulo
	 * @param ladoBase
	 * @param ladoAltura
	 * @param lado3
	 */
	public Triangulo(double ladoBase, double ladoAltura, double lado3) {
		this.ladoBase = ladoBase;
		this.ladoAltura = ladoAltura;
		this.lado3 = lado3;
	}

	@Override
	public String aceitaVisita(VisitorIF v) {
		v.visitaTriangulo(this);
		return "Visita Aceita ao Triangulo";
	}

	/**
	 * Retorna o lado do triangulo que é a base do mesmo
	 * @return ladoBase
	 */
	public double getLadoBase() {
		return ladoBase;
	}

	/**
	 * Retorna o lado do triangulo que é a altura do mesmo
	 * @return ladoAltura
	 */
	public double getLadoAltura() {
		return ladoAltura;
	}
	
	/**
	 * Retorna o lado do triangulo
	 * @return lado3
	 */
	public double getLado3() {
		return lado3;
	}
}
