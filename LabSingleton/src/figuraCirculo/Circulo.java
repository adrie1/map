package figuraCirculo;

/**
 * Classe Circulo que tem sua propria instancia
 * 
 * @author Adriele e Samara
 */
public class Circulo {

	private static Circulo instanciaCirculo;

	/**
	 * Construtor privado do Circulo
	 */
	private Circulo() {
	}

	/**
	 * Metodo estatico getInstancia que instancia o circulo
	 * 
	 * @return instanciaCirculo
	 */
	public static Circulo getInstancia() {
		if (instanciaCirculo == null) {
			synchronized (Circulo.class) {
				if(instanciaCirculo == null) {
					instanciaCirculo = new Circulo();
				}
			}
			
		}
		return instanciaCirculo;
	}

	/**
	 * Metodo criarCirculo, passando como parametro um raio
	 * 
	 * @param raio
	 * @return String
	 */
	public String criarCirculo(double raio) {
		return "Circulo criado com raio: " + raio;
	}
}
