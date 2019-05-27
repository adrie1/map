package interfaces;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

/**
 * Interface VisitorIF que possui os métodos de visitar as figuras geométricas
 * @author Adriele e Samara
 */
public interface VisitorIF {
	
	public String visitaCirculo(Circulo c);
	public String visitaRetangulo(Retangulo r);
	public String visitaTrapezio(Trapezio tra);
	public String visitaTriangulo(Triangulo tri);

}
