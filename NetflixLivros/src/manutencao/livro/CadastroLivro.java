package manutencao.livro;

import arquivo.Arquivo_XML_Livro;
import exception.livro.CreateLivroException;
import exception.livro.DeleteLivroException;
import exception.livro.ReadLivroException;
import exception.livro.UpdateLivroException;

import java.util.Scanner;

/**
 * Classe CadastroLivro para a manutenção do cadastro.
 * @author Adriele e Samara
 */
public class CadastroLivro {

	Scanner in = new Scanner(System.in);

	/**
	 * Insere o livro em um ArrayList e salva os dados em um arquivo XML.
	 * @param livro
	 * @return true caso seja bem sucedido, se não, false.
	 * @throws CreateLivroException 
	 */
	public boolean create(Livro livro) throws CreateLivroException {

		if (!Arquivo_XML_Livro.livros.contains(livro)) {
			Arquivo_XML_Livro.livros.add(livro);
			Arquivo_XML_Livro.salvarXML();
			return true;
		} else throw new CreateLivroException(livro);
	}

	
	/**
	 * Procura um livro para ler através do código.
	 * @param codigo
	 * @return true caso encontre o livro, se não, false.
	 * @throws ReadLivroException 
	 */
	public boolean read(String codigo) throws ReadLivroException {

		boolean resultado = false;

		Arquivo_XML_Livro.lerXML();

		for (int i = 0; i < Arquivo_XML_Livro.livros.size(); i++) {
			if (Arquivo_XML_Livro.livros.get(i).getIsbn().equals(codigo)) {
				System.out.println(Arquivo_XML_Livro.livros.get(i));
				resultado = true;
			}
		}

		if (resultado != true) {
				throw new ReadLivroException(codigo);
		}
		return resultado;
	}

	/**
	 * Atualiza os atributos do livro.
	 * @param codigo
	 * @return true caso seja bem sucedido, se não, false.
	 * @throws UpdateLivroException 
	 */
	public boolean update(String codigo) throws UpdateLivroException {

		boolean resultado = false;

		Arquivo_XML_Livro.lerXML();

		for (Livro aux : Arquivo_XML_Livro.livros) {
			if (aux.getIsbn().equals(codigo)) {
				System.out.println("----------ATUALIZAR LIVRO----------\nTítulo: ");
				aux.setTitulo(in.nextLine());
				System.out.println("Edição: ");
				aux.setEdicao(in.nextInt());
				System.out.println("Autor: ");
				aux.setAutor(in.nextLine());
				System.out.println("Ano: ");
				aux.setAno(in.next());
				System.out.println("Editora: ");
				aux.setEditora(in.nextLine());
				System.out.println("Idioma: ");
				aux.setIdioma(in.nextLine());
				System.out.println("Assunto: ");
				aux.setAssunto(in.nextLine());
				System.out.println("Descrição: ");
				aux.setDescricao(in.nextLine());

				Arquivo_XML_Livro.salvarXML();

				resultado = true;
			}
		}

		if (resultado != true) {
				throw new UpdateLivroException(codigo);
		}
		return resultado;
	}

	/**
	 * Deleta o livro através do código.
	 * @param codigo
	 * @return true caso a remoção seja bem sucedida, se não, false.
	 * @throws DeleteLivroException 
	 */
	public boolean delete(String codigo) throws DeleteLivroException {

		boolean resultado = false;

		Arquivo_XML_Livro.lerXML();

		for (int i = 0; i < Arquivo_XML_Livro.livros.size(); i++) {
			if (Arquivo_XML_Livro.livros.get(i).getIsbn().equals(codigo)) {
				Arquivo_XML_Livro.livros.remove(i);
				Arquivo_XML_Livro.salvarXML();
				resultado = true;
			}
		}

		if (resultado != true) {
				throw new DeleteLivroException(codigo);
		}
		return resultado;
	}
}
