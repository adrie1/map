package testes.operacoes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import interfaces.VisitorIF;
import operacoes.VisitorMaximizaFigura;

/**
 * Classe VisitorMaximizaFiguraTest
 * @author Adriele e Samara
 */
public class VisitorMaximizaFiguraTest {

	VisitorIF visitor;

	Circulo circulo;
	Retangulo retangulo;
	Trapezio trapezio;
	Triangulo triangulo;

	@BeforeEach
	public void setUp() throws Exception {
		visitor = new VisitorMaximizaFigura();

		circulo = new Circulo(2);
		retangulo = new Retangulo(2, 3);
		trapezio = new Trapezio(12, 2, 3, 3, 1);
		triangulo = new Triangulo(2, 4, 1);
	}

	/**
	 * Método que verifica a maximizacao certa das figuras
	 */
	@Test
	public void testMaximizaFiguraCerto() {
		assertEquals("Círculo maximizado igual a: 4.0", visitor.visitaCirculo(circulo));
		assertEquals("Retângulo maximizado igual a: 10.0", visitor.visitaRetangulo(retangulo));
		assertEquals("Trapézio maximizado igual a: 42.0", visitor.visitaTrapezio(trapezio));
		assertEquals("Triângulo maximizado igual a: 14.0", visitor.visitaTriangulo(triangulo));
	}
	
	/**
	 * Método que verifica a maximizacao errada das figuras
	 */
	@Test
	public void testMaximizaFiguraErrado() {
		assertNotEquals("Círculo maximizado igual a: 22", visitor.visitaCirculo(circulo));
		assertNotEquals("Retângulo maximizado igual a: 0", visitor.visitaRetangulo(retangulo));
		assertNotEquals("Trapézio maximizado igual a: 200", visitor.visitaTrapezio(trapezio));
		assertNotEquals("Triângulo maximizado igual a: 37", visitor.visitaTriangulo(triangulo));
	}

}
