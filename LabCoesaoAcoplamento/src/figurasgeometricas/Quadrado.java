package figurasgeometricas;

/**
 * Classe Quadrado
 * @author Adriele e Samara
 */
public class Quadrado implements FiguraGeometrica {

	private double lado;

	/**
	 * Construtor da classe Quadrado
	 * @param lado
	 */
	public Quadrado(double lado) {
		this.lado = lado;
	}

	/**
	 * Retorna o lado
	 * @return lado
	 */
	public double getLado() {
		return lado;
	}

	/**
	 * Seta o lado
	 * @param lado
	 */
	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		return Math.pow(this.lado, 2);
	}

	@Override
	public double calculaPerimetro() {
		return 4 * this.lado;
	}

	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + ", área=" + calculaArea() + ", perímetro="
				+ calculaPerimetro() + "]";
	}
}
