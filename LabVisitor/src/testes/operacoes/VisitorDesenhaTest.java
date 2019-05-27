package testes.operacoes;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import interfaces.VisitorIF;
import operacoes.VisitorDesenha;

/**
 * Classe VisitorDesenhaTest
 * @author Adriele e Samara
 */
class VisitorDesenhaTest {

	VisitorIF visitor;

	Circulo circulo;
	Retangulo retangulo;
	Trapezio trapezio;
	Triangulo triangulo;
	
	@BeforeEach
	void setUp() throws Exception {
		visitor = new VisitorDesenha();

		circulo = new Circulo(2);
		retangulo = new Retangulo(2, 3);
		trapezio = new Trapezio(12, 2, 3, 3, 1);
		triangulo = new Triangulo(2, 4, 1);
	}

	/**
	 * Método que verifica o desenho das figuras
	 */
	@Test
	void testDesenho() {
		assertEquals("Círculo desenhado com sucesso", visitor.visitaCirculo(circulo));
		assertEquals("Retângulo desenhado com sucesso", visitor.visitaRetangulo(retangulo));
		assertEquals("Trapézio desenhado com sucesso", visitor.visitaTrapezio(trapezio));
		assertEquals("Triângulo desenhado com sucesso", visitor.visitaTriangulo(triangulo));
	}

}
