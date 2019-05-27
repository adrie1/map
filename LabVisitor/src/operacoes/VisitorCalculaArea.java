package operacoes;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import interfaces.VisitorIF;

/**
 * Classe VisitorCalculaArea que implementa VisitorIF
 * @author Adriele e Samara
 */
public class VisitorCalculaArea implements VisitorIF {

	@Override
	public String visitaCirculo(Circulo c) {
		double areaCirculo = (Math.PI * Math.pow(c.getRaio(), 2));
		return "A área do circulo é: " + areaCirculo;
	}

	@Override
	public String visitaRetangulo(Retangulo r) {
		double areaRetangulo = (r.getBase() * r.getAltura());
		return "A área do retângulo é: " + areaRetangulo;
	}

	@Override
	public String visitaTrapezio(Trapezio tra) {
		double areaTrapezio = (((tra.getBaseMaior() + tra.getBaseMenor()) * tra.getAltura()) / 2);
		return "A área do trapézio é: " + areaTrapezio;
	}

	@Override
	public String visitaTriangulo(Triangulo tri) {
		double areaTriangulo = ((tri.getLadoBase() * tri.getLadoAltura()) / 2);
		return "A área do triângulo é: " + areaTriangulo;
	}

}
