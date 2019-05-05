package setor.subsistema_alm;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Almoxarifado representando um "sistema" que possui o estoque e o
 * pedido de compra
 * 
 * @author Adriele e Samara
 */
public class Almoxarifado {

	private List<Produto> estoque;

	/**
	 * Construtor da classe Almoxarifado instanciando o estoque 
	 */
	public Almoxarifado() {
		this.estoque = new ArrayList<Produto>();
	}

	/**
	 * Adiciona o produto no estoque
	 * 
	 * @param produto
	 * @return true se não tiver o produto no estoque, se não false
	 */
	public boolean adicionarProduto(Produto produto) {
		if (!estoque.contains(produto)) {
			estoque.add(produto);
			return true;
		}
		return false;
	}

	/**
	 * Faz o pedido de compra
	 * 
	 * @param pedido
	 * @return resultado
	 */
	public String fazerPedido(PedidoCompra pedido) {
		 return "Pedido de compra\nNome = " + pedido.getNomeProduto() + " Quantidade = " + pedido.getQuantidade();
	}

	/**
	 * Verifica se tem o produto no estoque e faz o pedido de compra
	 * 
	 * @param pedido
	 * @param produto
	 * @return true se o produto está no estoque e o pedido de compra for realizado,
	 *         se não false
	 */
	public boolean verificarEstoque(PedidoCompra pedido, Produto produto) {
		if (!estoque.contains(produto)) {
			fazerPedido(pedido);
			return true;
		}
		return false;
	}

}
