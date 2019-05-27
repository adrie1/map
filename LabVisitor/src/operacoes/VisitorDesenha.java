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
		return "C�rculo desenhado com sucesso";
	}

	@Override
	public String visitaRetangulo(Retangulo r) {
		return "Ret�ngulo desenhado com sucesso";
	}

	@Override
	public String visitaTrapezio(Trapezio tra) {
		return "Trap�zio desenhado com sucesso";
	}

	@Override
	public String visitaTriangulo(Triangulo tri) {
		return "Tri�ngulo desenhado com sucesso";
	}

}
