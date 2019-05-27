package main;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import interfaces.VisitorIF;
import operacoes.VisitorCalculaArea;
import operacoes.VisitorCalculaPerimetro;
import operacoes.VisitorDesenha;
import operacoes.VisitorMaximizaFigura;

/**
 * Classe Main
 * @author Adriele e Samara
 */
public class FigurasGeometricas {

	public static void main(String[] args) {
		
		//Inst�ncia de Figuras
		Circulo circulo = new Circulo(2);
		Retangulo retangulo = new Retangulo(2, 3);
		Trapezio trapezio = new Trapezio(12, 2, 3, 3, 1);
		Triangulo triangulo = new Triangulo(2, 4, 1);
		
		//Inst�ncia para Visitor de calcular �rea
		VisitorIF visitor = new VisitorCalculaArea();
		
		System.out.println("C�lculos de �reas: C�rculo, Ret�ngulo, Trap�zio, Tri�ngulo\n");
		System.out.println(circulo.aceitaVisita(visitor) + " - " + visitor.visitaCirculo(circulo));
		System.out.println(retangulo.aceitaVisita(visitor) + " - " + visitor.visitaRetangulo(retangulo));
		System.out.println(trapezio.aceitaVisita(visitor) + " - " + visitor.visitaTrapezio(trapezio));
		System.out.println(triangulo.aceitaVisita(visitor) + " - " + visitor.visitaTriangulo(triangulo));
		
		//Inst�ncia para Visitor de calcular per�metro
		VisitorIF visitor2 = new VisitorCalculaPerimetro();
	
		System.out.println("\nC�lculos de Per�metros: C�rculo, Ret�ngulo, Trap�zio, Tri�ngulo\n");
		System.out.println(circulo.aceitaVisita(visitor2) + " - " + visitor2.visitaCirculo(circulo));
		System.out.println(retangulo.aceitaVisita(visitor2) + " - " +visitor2.visitaRetangulo(retangulo));
		System.out.println(trapezio.aceitaVisita(visitor2) + " - " +visitor2.visitaTrapezio(trapezio));
		System.out.println(triangulo.aceitaVisita(visitor2) + " - " + visitor2.visitaTriangulo(triangulo));
		
		//Inst�ncia para Visitor de calcular maximiza��o de figuras geom�tricas
		VisitorIF visitor3 = new VisitorMaximizaFigura();

		System.out.println("\nMaximiza��o de Figuras: C�rculo, Ret�ngulo, Trap�zio, Tri�ngulo\n");
		System.out.println(circulo.aceitaVisita(visitor3) + " - " + visitor3.visitaCirculo(circulo));
		System.out.println(retangulo.aceitaVisita(visitor3) + " - " + visitor3.visitaRetangulo(retangulo));
		System.out.println(trapezio.aceitaVisita(visitor3) + " - " + visitor3.visitaTrapezio(trapezio));
		System.out.println(triangulo.aceitaVisita(visitor3) + " - " + visitor3.visitaTriangulo(triangulo));
		
		//Inst�ncia para Visitor de desenhar as figuras geom�tricas
		VisitorIF visitor4 = new VisitorDesenha();
		
		System.out.println("\nDesenhos das Figuras: C�rculo, Ret�ngulo, Trap�zio, Tri�ngulo\n");
		System.out.println(circulo.aceitaVisita(visitor4) + " - " + visitor4.visitaCirculo(circulo));
		System.out.println(retangulo.aceitaVisita(visitor4) + " - " + visitor4.visitaRetangulo(retangulo));
		System.out.println(trapezio.aceitaVisita(visitor4) + " - " + visitor4.visitaTrapezio(trapezio));
		System.out.println(triangulo.aceitaVisita(visitor4) + " - " + visitor4.visitaTriangulo(triangulo));
	}

}
