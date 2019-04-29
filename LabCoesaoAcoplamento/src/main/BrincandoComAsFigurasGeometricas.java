package main;

import figurasgeometricas.Circulo;
import figurasgeometricas.Quadrado;
import figurasgeometricas.Retangulo;

/**
 * Classe principal
 * @author Adriele e Samara
 */
public class BrincandoComAsFigurasGeometricas {
	
	public static void main(String[] args) {
		
		//Instanciando as figuras
		Quadrado quadrado = new Quadrado(8);
		Retangulo retangulo = new Retangulo(4, 8);
		Circulo circulo = new Circulo(9);
		
		//Calculando a área 
		quadrado.calculaArea();
		retangulo.calculaArea();
		circulo.calculaArea();
		
		//Calculando o perímetro
		quadrado.calculaPerimetro();
		retangulo.calculaPerimetro();
		circulo.calculaPerimetro();
		
		//Resultado
		System.out.println(quadrado);
		System.out.println(retangulo);
		System.out.println(circulo);
		
	}

}
