package pacote;

import java.util.Scanner;

import arquivo.Arquivo_XML_Livro;
import leitura.Comentario;
import leitura.Leitura;
import leitura.Status;
import manutencao.leitor.Leitor;

/**
 * Classe Core
 * @author Adriele e Samara
 */
public class Core extends Pacote {

	Scanner in = new Scanner(System.in);

	@Override
	public boolean selecionarLivros(Leitor leitor) {
		System.out.println("------SELEÇÃO DE LIVROS----------\nQuantos livros você deseja selecionar?");
		setQuantidadeLivros(in.nextInt());

		if (quantidadeLivros > 0 && quantidadeLivros <= 5) {
			for (int i = 0; i < quantidadeLivros; i++) {

				System.out.println("Digite o código do livro: ");
				String cod = in.next();

				for (int j = 0; j < Arquivo_XML_Livro.livros.size(); j++) {
					if (Arquivo_XML_Livro.livros.get(j).getIsbn().equals(cod)) {
						System.out.println(Arquivo_XML_Livro.livros.get(i));

						System.out.println("Informe o status: ");
						Status status = Status.valueOf(in.next());
						
						Comentario c = new Comentario();
						c.adicionarComentario(Status.valueOf(status.name()), Arquivo_XML_Livro.livros.get(i));
						
						Leitura leitura = new Leitura(Status.valueOf(status.name()), Arquivo_XML_Livro.livros.get(i));
						Leitor.leituras.add(leitura);
					}
				}
			}
			return true;
		} else {
			System.out.println("Você só pode escolher até 5 livros");
		}
		return false;
	}

}
