package figuraTriangulo;

/**
 * Classe TrianguloRetangulo que extende Triangulo
 * 
 * @author Adriele e Samara
 */
public class TrianguloRetangulo extends Triangulo {

	private static TrianguloRetangulo instanciaTrianguloRetangulo;

	/**
	 * Construtor da classe TrianguloRetangulo
	 */
	private TrianguloRetangulo() {
	}

	/**
	 * Metodo estatico getInstancia que instancia o triangulo retangulo
	 * 
	 * @return instanciaTrianguloRetangulo
	 */
	public static TrianguloRetangulo getInstancia() {
		if (instanciaTrianguloRetangulo == null) {
			synchronized (TrianguloRetangulo.class) {
				if (instanciaTrianguloRetangulo == null) {
					instanciaTrianguloRetangulo = new TrianguloRetangulo();
				}
			}
		}
		return instanciaTrianguloRetangulo;
	}

}
