package operacoes;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import interfaces.VisitorIF;

/**
 * Classe VisitorCalculaPerimetro que implementa VisitorIF
 * @author Adriele e Samara
 */
public class VisitorCalculaPerimetro implements VisitorIF{

	@Override
	public String visitaCirculo(Circulo c) {
		double perimetroCirculo = (2 * Math.PI * c.getRaio());
		return "O perímetro do circulo é: " + perimetroCirculo;
	}

	@Override
	public String visitaRetangulo(Retangulo r) {
		double perimetroRetangulo = (2 * r.getBase() + 2 * r.getAltura());
		return "O perímetro do retângulo é: " + perimetroRetangulo;
	}

	@Override
	public String visitaTrapezio(Trapezio tra) {
		double perimetroTrapezio = (tra.getBaseMaior() + tra.getBaseMenor() + tra.getLado1() + tra.getLado2());
		return "O perímetro do trapézio é: " + perimetroTrapezio;
	}

	@Override
	public String visitaTriangulo(Triangulo tri) {
		double perimetroTriangulo = (tri.getLadoBase() + tri.getLadoAltura() + tri.getLado3());
		return "O perímetro do triângulo é: " + perimetroTriangulo;
	}

}
