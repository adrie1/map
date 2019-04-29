package figurasgeometricas;

/**
 * Classe Retangulo
 * @author Adriele e Samara
 */
public class Retangulo implements FiguraGeometrica {

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

	/**
	 * Retorna a base
	 * @return base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * Seta a base
	 * @param base
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * Retorna a altura
	 * @return altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Seta a altura
	 * @param altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return base * altura;
	}

	@Override
	public double calculaPerimetro() {
		return (2 * base) + (2 * altura);
	}

	@Override
	public String toString() {
		return "Retangulo [base=" + base + ", altura=" + altura + ", área=" + calculaArea()
				+ ", perímetro=" + calculaPerimetro() + "]";
	}

}
