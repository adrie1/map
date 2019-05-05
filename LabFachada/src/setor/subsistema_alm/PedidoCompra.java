package setor.subsistema_alm;

public class PedidoCompra {
	
	private String nomeProduto;
	private int quantidade;

	public PedidoCompra(String nomeProduto, int quantidade) {
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "PedidoCompra [nomeProduto=" + nomeProduto + ", quantidade=" + quantidade + "]";
	}

}
