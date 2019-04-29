package figurasgeometricas;

/**
 * Classe FiguraGeometrica
 * @author Adriele e Samara
 */
public class Circulo implements FiguraGeometrica {

	private double raio;

	/**
	 * Construtor da Classe Circulo
	 * @param raio
	 */
	public Circulo(double raio) {
		this.raio = raio;
	}

	/**
	 * Retorna o raio
	 * @return raio
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * Seta o raio
	 * @param raio
	 */
	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double calculaPerimetro() {
		return 2 * Math.PI * raio;
	}

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", área=" + calculaArea() + ", perímetro="
				+ calculaPerimetro() + "]";
	}
}
