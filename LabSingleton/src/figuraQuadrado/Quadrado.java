package figuraQuadrado;

/**
 * Classe Quadrado
 * 
 * @author Adriele e Samara
 */
public class Quadrado {

	private double lado;

	/**
	 * Construtor da classe Quadrado
	 * 
	 * @param lado
	 */
	public Quadrado(double lado) {
		this.lado = lado;
	}

	/**
	 * @return o lado do quadrado
	 */
	public double getLado() {
		return lado;
	}

	/**
	 * Seta o lado do quadrado
	 * 
	 * @param lado
	 */
	public void setLado(double lado) {
		this.lado = lado;
	}

	/**
	 * Metodo para criar um quadrado
	 * 
	 * @return String
	 */
	public String criarQuadrado() {
		return "Quadrado criado com lados no valor de: " + lado;
	}
}
