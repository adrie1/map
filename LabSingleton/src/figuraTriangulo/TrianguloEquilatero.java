package figuraTriangulo;

/**
 * Classe TrianguloEquilatero que extende Triangulo
 * 
 * @author Adriele e Samara
 */
public class TrianguloEquilatero extends Triangulo {

	private static TrianguloEquilatero instanciaTrianguloEquilatero;

	/**
	 * Construtor privado da classe TrianguloEquilatero
	 */
	private TrianguloEquilatero() {
	}

	/**
	 * Metodo estatico getInstancia que instancia o triangulo equilatero
	 * 
	 * @return instanciaTrianguloEquilatero
	 */
	public static TrianguloEquilatero getInstancia() {
		if (instanciaTrianguloEquilatero == null) {
			synchronized (TrianguloEquilatero.class) {
				if (instanciaTrianguloEquilatero == null) {
					instanciaTrianguloEquilatero = new TrianguloEquilatero();
				}

			}
		}
		return instanciaTrianguloEquilatero;
	}

}
