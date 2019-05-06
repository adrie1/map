package main;

import figuraCirculo.Circulo;
import figuraQuadrado.Quadrado;
import figuraTriangulo.TrianguloEquilatero;
import figuraTriangulo.TrianguloIsosceles;
import figuraTriangulo.TrianguloRetangulo;

/**
 * Métodos Avançados de Programação - Laboratório Singleton
 * 
 * @author Adriele e Samara
 */
public class FabricaFiguras {

	public static void main(String[] args) {

		// Criação do Circulo
		Circulo circulo = Circulo.getInstancia();
		System.out.println(circulo.criarCirculo(2.0));

		System.out.println("\n");

		// Criação de inúmeros Quadrados
		Quadrado quadrado1 = new Quadrado(4);
		System.out.println(quadrado1.criarQuadrado());
		Quadrado quadrado2 = new Quadrado(3);
		System.out.println(quadrado2.criarQuadrado());
		Quadrado quadrado3 = new Quadrado(2);
		System.out.println(quadrado3.criarQuadrado());
		Quadrado quadrado4 = new Quadrado(1);
		System.out.println(quadrado4.criarQuadrado());

		System.out.println("\n");

		// Criação dos três triângulos: Isósceles, Equilatero, Retângulo
		TrianguloIsosceles triangulo1 = TrianguloIsosceles.getInstancia();
		TrianguloRetangulo triangulo2 = TrianguloRetangulo.getInstancia();
		TrianguloEquilatero triangulo3 = TrianguloEquilatero.getInstancia();

		System.out.println("Triângulo Isosceles: " + triangulo1.criarTriangulo(2, 2, 3));
		System.out.println("Triângulo Retangulo: " + triangulo2.criarTriangulo(2, 3, 90));
		System.out.println("Triângulo Equilatero: " + triangulo3.criarTriangulo(2, 2, 2));
	}

}
