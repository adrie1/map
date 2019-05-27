package interfaces;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

/**
 * Interface VisitorIF que possui os m�todos de visitar as figuras geom�tricas
 * @author Adriele e Samara
 */
public interface VisitorIF {
	
	public String visitaCirculo(Circulo c);
	public String visitaRetangulo(Retangulo r);
	public String visitaTrapezio(Trapezio tra);
	public String visitaTriangulo(Triangulo tri);

}
