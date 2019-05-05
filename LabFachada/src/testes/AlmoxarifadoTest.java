package testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import setor.subsistema_alm.Almoxarifado;
import setor.subsistema_alm.PedidoCompra;
import setor.subsistema_alm.Produto;

public class AlmoxarifadoTest {

	Produto produto;
	PedidoCompra pedido;
	Almoxarifado alm;
	
	@Before
	public void setUp() throws Exception {
		produto = new Produto(1, "Celular", 1230);
		pedido = new PedidoCompra("Celular", 1);
		alm = new Almoxarifado();
	}

	@Test
	public void testAdicionarProduto() {
		assertTrue(alm.adicionarProduto(produto));
		assertFalse(alm.adicionarProduto(produto));
	}
	
	@Test
	public void testVerificarEstoque() {
		alm.adicionarProduto(produto);
		assertFalse(alm.verificarEstoque(pedido, produto));
	}


}
