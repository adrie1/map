package operacoes;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import interfaces.VisitorIF;

/**
 * Classe VisitorMaximizaFigura que implementa VisitorIF
 * 
 * @author Adriele e Samara
 */
public class VisitorMaximizaFigura implements VisitorIF {

	@Override
	public String visitaCirculo(Circulo c) {
		double duplicaRaio = (c.getRaio() * 2);
		return "Círculo maximizado igual a: " + duplicaRaio;
	}

	@Override
	public String visitaRetangulo(Retangulo r) {
		double duplicaBase = (r.getBase() * 2);
		double duplicaAltura = (r.getAltura() * 2);
		return "Retângulo maximizado igual a: " + (duplicaBase + duplicaAltura);
	}

	@Override
	public String visitaTrapezio(Trapezio tra) {
		double duplicabaseMaior = (tra.getBaseMaior() * 2);
		double duplicabaseMenor = (tra.getBaseMenor() * 2);
		double duplicaAltura = (tra.getAltura() * 2);
		double duplicaLado1 = (tra.getLado1() * 2);
		double duplicaLado2 = (tra.getLado2() * 2);
		return "Trapézio maximizado igual a: "
				+ (duplicabaseMaior + duplicabaseMenor + duplicaAltura + duplicaLado1 + duplicaLado2);
	}

	@Override
	public String visitaTriangulo(Triangulo tri) {
		double duplicaBase = (tri.getLadoBase() * 2);
		double duplicaAltura = (tri.getLadoAltura() * 2);
		double duplicaLado3 = (tri.getLado3() * 2);
		return "Triângulo maximizado igual a: " + (duplicaBase + duplicaAltura + duplicaLado3);
	}

}
