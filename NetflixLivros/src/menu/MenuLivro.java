package menu;

import java.util.Scanner;

import exception.livro.CreateLivroException;
import exception.livro.DeleteLivroException;
import exception.livro.ReadLivroException;
import exception.livro.UpdateLivroException;
import manutencao.livro.CadastroLivro;
import manutencao.livro.Livro;

public class MenuLivro {

	Livro livro = new Livro("9788535904116", "A Sangue Frio", 1, "Truman Capote", "2003", "Companhia das Letras",
			"Português", "Jornalismo Literário",
			"Um homem religioso, uma mãe depressiva, um adolescente, uma garota dona de casa, um cachorro amedrontado e dois ladrões frustrados. Esses e outros personagens são os ingredientes chave para o romance jornalístico A sangue frio, de Truman Capote. O livro é uma reportagem investigativa sobre o assassinato de quatro membros da família Clutter, o casal e seus dois filhos caçulas, ocorrido em 1959 na cidade de Holcomb, no Kansas, Estados Unidos.");
	Livro livro1 = new Livro("9788501044457", "O Diário de Anne Frank", 1, "Anneliese Marie Frank", "2008", "Record",
			"Português", "Biografia, autobiografia, memórias",
			"O depoimento da pequena Anne Frank, morta pelos nazistas após passar anos escondida no sótão de uma casa em Amsterdã, ainda hoje emociona leitores no mundo inteiro. Seus diário narra os sentimentos, medos e pequenas alegrias de uma menina judia que, com sua família, lutou em vão para sobreviver ao Holocausto. Lançado em 1947, O Diário de Anne Frank tronou-se um dos maiores sucessos editoriais de todos os tempos. Um livro tocante e importante que conta às novas gerações os horrores da perseguição aos judeus durante a Segunda Guerra Mundial.");
	Livro livro2 = new Livro("9788571647879", "Na Natureza Selvagem", 1, "Jon Krakauer", "1998", "Companhia das Letras",
			"Português", "Biografia, autobiografia, memórias",
			"O corpo em decomposição de um jovem é encontrado no Alasca. A polícia descobre que se trata de um rapaz de família rica do Leste americano que largou tudo, se internou sozinho na aridez gelada e morreu de inanição. O resultado é uma narrativa envolvente, por vezes amarga, em que os sonhos da juventude se transformam em pesadelo.");
	Livro livro3 = new Livro("9788532520661", "O Conto da Aia", 1, "Margaret Atwood", "2017", "Rocco", "Português",
			"Distopia",
			"Escrito em 1985, o romance distópico O conto da aia, da canadense Margaret Atwood, tornou-se um dos livros mais comentados em todo o mundo nos últimos meses, voltando a ocupar posição de destaque nas listas do mais vendidos em diversos países. Além de ter inspirado a série homônima (The Handmaid’s Tale, no original) produzida pelo canal de streaming Hulu, a ficção futurista de Atwood, ambientada num Estado teocrático e totalitário em que as mulheres são vítimas preferenciais de opressão, tornando-se propriedade do governo, e o fundamentalismo se fortalece como força política, ganhou status de oráculo dos EUA da era Trump. Em meio a todo este burburinho, O conto da aia volta às prateleiras com nova capa, assinada pelo artista Laurindo Feliciano.");

	CadastroLivro cadastro = new CadastroLivro();

	Scanner in = new Scanner(System.in);

	public void menu() {

		int opc = 0;

		do {

			System.out.println("--------------------BEM VINDOS AO MENU DO LIVRO---------------------\n");
			System.out.println("\n1 - CREATE\n2 - READ\n3 - UPDATE\n4 - DELETE\n5 - VOLTAR");
			System.out.println("\nINFORME A OPÇÃO: ");
			opc = in.nextInt();

			switch (opc) {

			case 1:
				try {
					cadastro.create(livro);
					cadastro.create(livro1);
					cadastro.create(livro2);
					cadastro.create(livro3);
				} catch (CreateLivroException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					cadastro.read("9788571647879");
				} catch (ReadLivroException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					cadastro.update("9788535904116");
				} catch (UpdateLivroException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					cadastro.delete("9788532520661");
				} catch (DeleteLivroException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				break;
			default:
				System.out.println("Opção inválida");
			}

		} while (opc != 5);

	}

}
