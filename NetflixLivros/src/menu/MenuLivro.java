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
			"Portugu�s", "Jornalismo Liter�rio",
			"Um homem religioso, uma m�e depressiva, um adolescente, uma garota dona de casa, um cachorro amedrontado e dois ladr�es frustrados. Esses e outros personagens s�o os ingredientes chave para o romance jornal�stico A sangue frio, de Truman Capote. O livro � uma reportagem investigativa sobre o assassinato de quatro membros da fam�lia Clutter, o casal e seus dois filhos ca�ulas, ocorrido em 1959 na cidade de Holcomb, no Kansas, Estados Unidos.");
	Livro livro1 = new Livro("9788501044457", "O Di�rio de Anne Frank", 1, "Anneliese Marie Frank", "2008", "Record",
			"Portugu�s", "Biografia, autobiografia, mem�rias",
			"O depoimento da pequena Anne Frank, morta pelos nazistas ap�s passar anos escondida no s�t�o de uma casa em Amsterd�, ainda hoje emociona leitores no mundo inteiro. Seus di�rio narra os sentimentos, medos e pequenas alegrias de uma menina judia que, com sua fam�lia, lutou em v�o para sobreviver ao Holocausto. Lan�ado em 1947, O Di�rio de Anne Frank tronou-se um dos maiores sucessos editoriais de todos os tempos. Um livro tocante e importante que conta �s novas gera��es os horrores da persegui��o aos judeus durante a Segunda Guerra Mundial.");
	Livro livro2 = new Livro("9788571647879", "Na Natureza Selvagem", 1, "Jon Krakauer", "1998", "Companhia das Letras",
			"Portugu�s", "Biografia, autobiografia, mem�rias",
			"O corpo em decomposi��o de um jovem � encontrado no Alasca. A pol�cia descobre que se trata de um rapaz de fam�lia rica do Leste americano que largou tudo, se internou sozinho na aridez gelada e morreu de inani��o. O resultado � uma narrativa envolvente, por vezes amarga, em que os sonhos da juventude se transformam em pesadelo.");
	Livro livro3 = new Livro("9788532520661", "O Conto da Aia", 1, "Margaret Atwood", "2017", "Rocco", "Portugu�s",
			"Distopia",
			"Escrito em 1985, o romance dist�pico O conto da aia, da canadense Margaret Atwood, tornou-se um dos livros mais comentados em todo o mundo nos �ltimos meses, voltando a ocupar posi��o de destaque nas listas do mais vendidos em diversos pa�ses. Al�m de ter inspirado a s�rie hom�nima (The Handmaid�s Tale, no original) produzida pelo canal de streaming Hulu, a fic��o futurista de Atwood, ambientada num Estado teocr�tico e totalit�rio em que as mulheres s�o v�timas preferenciais de opress�o, tornando-se propriedade do governo, e o fundamentalismo se fortalece como for�a pol�tica, ganhou status de or�culo dos EUA da era Trump. Em meio a todo este burburinho, O conto da aia volta �s prateleiras com nova capa, assinada pelo artista Laurindo Feliciano.");

	CadastroLivro cadastro = new CadastroLivro();

	Scanner in = new Scanner(System.in);

	public void menu() {

		int opc = 0;

		do {

			System.out.println("--------------------BEM VINDOS AO MENU DO LIVRO---------------------\n");
			System.out.println("\n1 - CREATE\n2 - READ\n3 - UPDATE\n4 - DELETE\n5 - VOLTAR");
			System.out.println("\nINFORME A OP��O: ");
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
				System.out.println("Op��o inv�lida");
			}

		} while (opc != 5);

	}

}
