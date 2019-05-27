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
import operacoes.VisitorCalculaPerimetro;

/**
 * Classe VisitorCalculaPerimetroTest
 * @author Adriele e Samara
 */
public class VisitorCalculaPerimetroTest {
	
	VisitorIF visitor;
	
	Circulo circulo;
	Retangulo retangulo;
	Trapezio trapezio;
	Triangulo triangulo;

	@BeforeEach
	public void setUp() throws Exception {
		visitor = new VisitorCalculaPerimetro();
		
		circulo = new Circulo(2);
		retangulo = new Retangulo(2, 3);
		trapezio = new Trapezio(12, 2, 3, 3, 1);
		triangulo = new Triangulo(2, 4, 1);
	}

	/**
	 * M�todo que verifica o perimetro certo das figuras
	 */
	@Test
	public void testValorPerimetroCerto() {
		assertEquals("O per�metro do circulo �: 12.566370614359172", visitor.visitaCirculo(circulo));
		assertEquals("O per�metro do ret�ngulo �: 10.0", visitor.visitaRetangulo(retangulo));
		assertEquals("O per�metro do trap�zio �: 20.0", visitor.visitaTrapezio(trapezio));
		assertEquals("O per�metro do tri�ngulo �: 7.0", visitor.visitaTriangulo(triangulo));
	}
	
	/**
	 * M�todo que verifica o perimetro errado das figuras
	 */
	@Test
	public void testValorPerimetroErrado() {
		assertNotEquals("O per�metro do circulo �: 22", visitor.visitaCirculo(circulo));
		assertNotEquals("O per�metro do ret�ngulo �: 0", visitor.visitaRetangulo(retangulo));
		assertNotEquals("O per�metro do trap�zio �: 200", visitor.visitaTrapezio(trapezio));
		assertNotEquals("O per�metro do tri�ngulo �: 37", visitor.visitaTriangulo(triangulo));
	}
}
