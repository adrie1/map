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
import operacoes.VisitorCalculaArea;

/**
 * Classe VisitorCalculaAreaTest
 * @author Adriele e Samara
 */
public class VisitorCalculaAreaTest {
	
	VisitorIF visitor;
	
	Circulo circulo;
	Retangulo retangulo;
	Trapezio trapezio;
	Triangulo triangulo;

	@BeforeEach
	public void setUp() throws Exception {
		visitor = new VisitorCalculaArea();
		
		circulo = new Circulo(2);
		retangulo = new Retangulo(2, 3);
		trapezio = new Trapezio(12, 2, 3, 3, 1);
		triangulo = new Triangulo(2, 4, 1);
	}

	/**
	 * Método que verifica se o circulo aceita a visita do visitor
	 */
	@Test
	public void testVisitaAceita() {
		assertEquals("Visita Aceita ao Circulo", circulo.aceitaVisita(visitor));
		assertEquals("Visita Aceita ao Retangulo", retangulo.aceitaVisita(visitor));
		assertEquals("Visita Aceita ao Trapezio", trapezio.aceitaVisita(visitor));
		assertEquals("Visita Aceita ao Triangulo", triangulo.aceitaVisita(visitor));
	}
	
	/**
	 * Método que verifica a area certa das figuras
	 */
	@Test
	public void testValorAreaCerto() {
		assertEquals("A área do circulo é: 12.566370614359172", visitor.visitaCirculo(circulo));
		assertEquals("A área do retângulo é: 6.0", visitor.visitaRetangulo(retangulo));
		assertEquals("A área do trapézio é: 7.0", visitor.visitaTrapezio(trapezio));
		assertEquals("A área do triângulo é: 4.0", visitor.visitaTriangulo(triangulo));
	}
	
	/**
	 * Método que verifica a area errada das figuras
	 */
	@Test
	public void testValorAreaErrado() {
		assertNotEquals("A área do circulo é: 2", visitor.visitaCirculo(circulo));
		assertNotEquals("A área do retângulo é: 8", visitor.visitaRetangulo(retangulo));
		assertNotEquals("A área do trapézio é: 1", visitor.visitaTrapezio(trapezio));
		assertNotEquals("A área do triângulo é: 40", visitor.visitaTriangulo(triangulo));
	}

}
