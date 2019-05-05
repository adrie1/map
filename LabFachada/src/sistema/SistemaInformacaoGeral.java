package sistema;

import fachada.SetoresFachada;
import setor.subsistema_adm.Administrativo;
import setor.subsistema_alm.Almoxarifado;
import setor.subsistema_alm.PedidoCompra;
import setor.subsistema_alm.Produto;
import setor.subsistema_aluno.Aluno;
import setor.subsistema_aluno.Componente;
import setor.subsistema_aluno.Disciplina;
import setor.subsistema_infra.Infraestrutura;
import setor.subsistema_professor.Professor;

/**
 * Métodos Avançados de Programação - Fachada
 * 
 * @author Adriele e Samara
 */
public class SistemaInformacaoGeral {

	public static void main(String[] args) {

		// Instanciando as classes
		Administrativo adm = new Administrativo();
		Almoxarifado alm = new Almoxarifado();
		Aluno aluno = new Aluno();

		Infraestrutura infra = new Infraestrutura();
		Professor prof = new Professor("2 horas", "Algoritmos");

		Disciplina disciplina = new Disciplina(1, "Cálculo I", "João Oliveira", "Terça 7h - 9h/Quinta 9h - 11h");
		Componente componente = new Componente(1, "Algoritmo", "2015.2", 8.4, "AP");

		Produto produto = new Produto(1, "Celular Galaxy", 1350);
		PedidoCompra pedido = new PedidoCompra("Celular Galaxy", 1);

		// Instanciando a fachada
		SetoresFachada fachada = new SetoresFachada(adm, alm, aluno, infra, prof);

		// Chamando os métodos
		System.out.println("----------ADMINISTRAÇÃO----------");
		fachada.reuniao("Reunião agendada segunda as 10hrs");
		fachada.entrevista("Entrevista agendada terça as 12hrs");
		System.out.println(fachada.getReunioes());
		System.out.println(fachada.getEntrevistas());

		System.out.println("\n----------ALMOXARIFADO----------");
		fachada.adicionarProduto(produto);
		fachada.verificarEstoque(pedido, produto);
		System.out.println(fachada.pedido(pedido));

		System.out.println("\n----------RELACIONADO AO ALUNO----------");
		fachada.historico(componente);
		fachada.rdm(disciplina);
		System.out.println(fachada.getHistorico());
		System.out.println(fachada.getRdm());

		System.out.println("\n----------INFRAESTRUTURA----------");
		fachada.alocarSala("A204");
		System.out.println(fachada.salas());

		System.out.println("\n----------RELACIONADO AO PROFESSOR----------");
		System.out.println(fachada.tempoDeCasa());
		System.out.println(fachada.disciplina());
	}

}
