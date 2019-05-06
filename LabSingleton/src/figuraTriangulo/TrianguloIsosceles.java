package figuraTriangulo;

/**
 * Classe TrianguloIsosceles que extende Triangulo
 * 
 * @author Adriele e Samara
 */
public class TrianguloIsosceles extends Triangulo {

	private static TrianguloIsosceles instanciaTrianguloIsosceles;

	/**
	 * Construtor privado da classe TrianguloIsosceles
	 */
	private TrianguloIsosceles() {
	}

	/**
	 * Metodo estatico getInstancia que instancia o triangulo isosceles
	 * 
	 * @return instanciaTrianguloIsosceles
	 */
	public static TrianguloIsosceles getInstancia() {
		if (instanciaTrianguloIsosceles == null) {
			synchronized (TrianguloIsosceles.class) {
				if (instanciaTrianguloIsosceles == null) {
					instanciaTrianguloIsosceles = new TrianguloIsosceles();
				}
			}
		}
		return instanciaTrianguloIsosceles;
	}

}
