package operacoes;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import interfaces.VisitorIF;

/**
 * Classe VisitorDesenha que implementa VisitorIF
 * @author Adriele e Samara
 */
public class VisitorDesenha implements VisitorIF {

	@Override
	public String visitaCirculo(Circulo c) {
		return "Círculo desenhado com sucesso";
	}

	@Override
	public String visitaRetangulo(Retangulo r) {
		return "Retângulo desenhado com sucesso";
	}

	@Override
	public String visitaTrapezio(Trapezio tra) {
		return "Trapézio desenhado com sucesso";
	}

	@Override
	public String visitaTriangulo(Triangulo tri) {
		return "Triângulo desenhado com sucesso";
	}

}
