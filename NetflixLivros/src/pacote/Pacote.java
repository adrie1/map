package pacote;

import exception.livro.ReadLivroException;
import manutencao.leitor.Leitor;

/**
 * Classe Pacote
 * @author Adriele e Samara
 */
public class Pacote {
	
	protected String nome;
	protected int quantidadeLivros;
	protected double preco;
	
	/**
	 * Construtor da classe Pacote.
	 * @param nome
	 * @param quantidadeLivros
	 * @param preco
	 */
	public Pacote(String nome, int quantidadeLivros, double preco) {
		this.nome = nome;
		this.quantidadeLivros = quantidadeLivros;
		this.preco = preco;
	}
	
	public Pacote() {
		
	}

	/**
	 * Métodos get e set
	 * @return
	 */
	public int getQuantLivros() {
		return quantidadeLivros;
	}

	public void setQuantidadeLivros(int quantidadeLivros) {
		this.quantidadeLivros = quantidadeLivros;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean selecionarLivros(Leitor leitor) {
		return true;
	}

	@Override
	public String toString() {
		return ""+ nome + ", até " + quantidadeLivros + " livros, R$" + preco + "";
	}

}
