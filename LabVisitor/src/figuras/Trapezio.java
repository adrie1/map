package figuras;

import interfaces.ElementoConcretoIF;
import interfaces.VisitorIF;

/**
 * Classe Trapezio que implementa ElementoConcretoIF
 * @author Adriele e Samara
 */
public class Trapezio implements ElementoConcretoIF {
	
	private double baseMaior;
	private double baseMenor;
	private double lado1;
	private double lado2;
	private double altura;
	
	
	/**
	 * Construtor da classe Trapezio
	 * @param baseMaior
	 * @param baseMenor
	 * @param lado1
	 * @param lado2
	 * @param altura
	 */
	public Trapezio(double baseMaior, double baseMenor, double lado1, double lado2, double altura) {
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}

	@Override
	public String aceitaVisita(VisitorIF v) {
		v.visitaTrapezio(this);
		return "Visita Aceita ao Trapezio";
	}

	/**
	 * Retorna a base maior do trapezio
	 * @return baseMaior
	 */
	public double getBaseMaior() {
		return baseMaior;
	}

	/**
	 * Retorna a base menor do trapezio
	 * @return baseMenor
	 */
	public double getBaseMenor() {
		return baseMenor;
	}
	
	/**
	 * Retorna o lado 1 do trapezio
	 * @return lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Retorna o lado 2 do trapezio
	 * @return lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Retorna a altura do trapezio
	 * @return altura
	 */
	public double getAltura() {
		return altura;
	}

}
