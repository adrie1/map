package main;

import figuraCirculo.Circulo;
import figuraQuadrado.Quadrado;
import figuraTriangulo.TrianguloEquilatero;
import figuraTriangulo.TrianguloIsosceles;
import figuraTriangulo.TrianguloRetangulo;

/**
 * M�todos Avan�ados de Programa��o - Laborat�rio Singleton
 * 
 * @author Adriele e Samara
 */
public class FabricaFiguras {

	public static void main(String[] args) {

		// Cria��o do Circulo
		Circulo circulo = Circulo.getInstancia();
		System.out.println(circulo.criarCirculo(2.0));

		System.out.println("\n");

		// Cria��o de in�meros Quadrados
		Quadrado quadrado1 = new Quadrado(4);
		System.out.println(quadrado1.criarQuadrado());
		Quadrado quadrado2 = new Quadrado(3);
		System.out.println(quadrado2.criarQuadrado());
		Quadrado quadrado3 = new Quadrado(2);
		System.out.println(quadrado3.criarQuadrado());
		Quadrado quadrado4 = new Quadrado(1);
		System.out.println(quadrado4.criarQuadrado());

		System.out.println("\n");

		// Cria��o dos tr�s tri�ngulos: Is�sceles, Equilatero, Ret�ngulo
		TrianguloIsosceles triangulo1 = TrianguloIsosceles.getInstancia();
		TrianguloRetangulo triangulo2 = TrianguloRetangulo.getInstancia();
		TrianguloEquilatero triangulo3 = TrianguloEquilatero.getInstancia();

		System.out.println("Tri�ngulo Isosceles: " + triangulo1.criarTriangulo(2, 2, 3));
		System.out.println("Tri�ngulo Retangulo: " + triangulo2.criarTriangulo(2, 3, 90));
		System.out.println("Tri�ngulo Equilatero: " + triangulo3.criarTriangulo(2, 2, 2));
	}

}
