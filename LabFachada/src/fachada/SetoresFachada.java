package fachada;

import java.util.List;

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
 * Classe SetoresFachadas com todos os setores do SIG
 * 
 * @author Adriele e Samara
 */
public class SetoresFachada {

	private Administrativo adm;
	private Almoxarifado alm;
	private Aluno aluno;
	private Infraestrutura infra;
	private Professor prof;

	/**
	 * Construtor da classe SetoresFachadas passando todos os setores
	 * 
	 * @param adm
	 * @param alm
	 * @param aluno
	 * @param fin
	 * @param infra
	 * @param prof
	 */
	public SetoresFachada(Administrativo adm, Almoxarifado alm, Aluno aluno, Infraestrutura infra, Professor prof) {
		this.adm = adm;
		this.alm = alm;
		this.aluno = aluno;
		this.infra = infra;
		this.prof = prof;
	}

	/**
	 * Verifica se a reunião foi agendada
	 * 
	 * @param reuniao
	 * @return true se a reuniao for agendada, se não false
	 */
	public boolean reuniao(String reuniao) {
		if (adm.agendarReuniao(reuniao)) {
			return true;
		}
		return false;
	}

	/**
	 * Verifica se a entrevista foi agendada
	 * 
	 * @param entrevista
	 * @return true se a entrevista for agendada, se não false
	 */
	public boolean entrevista(String entrevista) {
		if (adm.agendarEntrevista(entrevista)) {
			return true;
		}
		return false;
	}

	/**
	 * @return a lista de reuniões agendadas
	 */
	public List<String> getReunioes() {
		return adm.getReunioes();
	}

	/**
	 * @return a lista de entrevistas agendadas
	 */
	public List<String> getEntrevistas() {
		return adm.getEntrevistas();
	}

	/**
	 * Verifica se o produto foi adicionado no estoque
	 * 
	 * @param produto
	 * @return true se o produto foi adicionado no estoque, se não false
	 */
	public boolean adicionarProduto(Produto produto) {
		if (alm.adicionarProduto(produto)) {
			return true;
		}
		return false;
	}

	/**
	 * Verifica se tem o produto no estoque para fazer o pedido de compra
	 * 
	 * @param pedido
	 * @param produto
	 * @return true se tiver o produto no estoque, se não false
	 */
	public boolean verificarEstoque(PedidoCompra pedido, Produto produto) {
		if (alm.verificarEstoque(pedido, produto)) {
			return true;
		}
		return false;
	}

	/**
	 * @param pedido
	 * @return o pedido de compra
	 */
	public String pedido(PedidoCompra pedido) {
		return alm.fazerPedido(pedido);
	}

	/**
	 * Mostra as informações do almoxarifado, como o pedido de compra
	 * 
	 * @param produto
	 * @param pedido
	 */
	public void informacoesAlmoxarifado(Produto produto, PedidoCompra pedido) {
		alm.adicionarProduto(produto);
		alm.verificarEstoque(pedido, produto);
		System.out.println(alm.fazerPedido(pedido));
	}

	/**
	 * Verifica se o componente curricular foi adicionado no histórico do aluno
	 * 
	 * @param componente
	 * @return true se o componente curricular foi adicionado no histórico do aluno,
	 *         se não false
	 */
	public boolean historico(Componente componente) {
		if (aluno.historico(componente)) {
			return true;
		}
		return false;
	}

	/**
	 * Verifica se a disciplina foi adicionada no rdm do aluno
	 * 
	 * @param disciplina
	 * @return true se a disciplina foi adicionada no rdm do aluno, se não false
	 */
	public boolean rdm(Disciplina disciplina) {
		if (aluno.rdm(disciplina)) {
			return true;
		}
		return false;
	}

	/**
	 * @return o rdm do aluno
	 */
	public List<Disciplina> getRdm() {
		return aluno.getRdm();
	}

	/**
	 * @return o histórico do aluno
	 */
	public List<Componente> getHistorico() {
		return aluno.getHistorico();
	}

	/**
	 * Verifica se a sala foi alocada
	 * 
	 * @param sala
	 * @return truse se a sala foi alocada, se não false
	 */
	public boolean alocarSala(String sala) {
		if (infra.alocarSala(sala)) {
			return true;
		}
		return false;
	}

	/**
	 * @return a lista de salas alocadas
	 */
	public List<String> salas() {
		return infra.getSalas();
	}

	/**
	 * @return o tempo de casa do professor
	 */
	public String tempoDeCasa() {
		return prof.getTempo();
	}

	/**
	 * @return a disciplina alocada do professor
	 */
	public String disciplina() {
		return prof.getDisciplina();
	}

}