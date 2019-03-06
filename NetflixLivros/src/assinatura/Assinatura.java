package assinatura;

import java.util.Scanner;
import manutencao.leitor.Leitor;
import pacote.Pacote;

public class Assinatura {
	
	private Leitor leitor;
	private Pacote pacote;
	
	/**
	 * Construtor da classe Assinatura.
	 * @param leitor
	 * @param pacote
	 */
	public Assinatura(Leitor leitor, Pacote pacote) {
		this.leitor = leitor;
		this.pacote = pacote;
	}
	
	public Assinatura() {
		
	}

	Scanner in = new Scanner(System.in);

	/**
	 * Seleciona o tipo de pacote.
	 * @param leitor
	 * @param pacote
	 */
	public void fazerAssinatura(Leitor leitor, Pacote pacote) {
		System.out.println(
				"\n---------ASSINATURA----------\n\n1 - BASIC: SELECIONE AT� 3 LIVROS PARA LER.  R$240,00/ano\n2 - CORE: SELECIONE AT� 5 LIVROS PARA LER.  R$360,00/ano\n3 - PREMIUM: SELECIONE AT� 10 LIVROS PARA LER.  R$600,00/ano");
		System.out.println("\nINFORME O PACOTE: ");
		int opc = in.nextInt();

		switch (opc) {
		case 1:
			pacote.setNome("Basic");
			pacote.setQuantidadeLivros(3);
			pacote.setPreco(240.00);
			break;
		case 2:
			pacote.setNome("Core");
			pacote.setQuantidadeLivros(5);
			pacote.setPreco(360.00);
			break;
		case 3:
			pacote.setNome("Premium");
			pacote.setQuantidadeLivros(10);
			pacote.setPreco(600.00);
			break;
		default:
			System.out.println("Op��o inv�lida");
		}

		leitor.setPacote(pacote);
	}
	
	
	/**
	 * M�todos get e set
	 * @return
	 */
	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}

	public Pacote getPacote() {
		return pacote;
	}

	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}
}
