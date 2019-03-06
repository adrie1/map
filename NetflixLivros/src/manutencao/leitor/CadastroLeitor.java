package manutencao.leitor;

import arquivo.Arquivo_XML_Leitor;
import exception.leitor.CreateLeitorException;
import exception.leitor.DeleteLeitorException;
import exception.leitor.ReadLeitorException;
import exception.leitor.UpdateLeitorException;


import java.util.Scanner;

/**
 * Classe CadastroLeitor para a manutenção do cadastro.
 * @author Adriele e Samara
 */
public class CadastroLeitor {
	
	Scanner in = new Scanner(System.in);
	
	/**
	 * Insere o leitor em um ArrayList e salva os dados em um arquivo XML.
	 * @param leitor
	 * @return true se o leitor for inserido com sucesso, se não, false.
	 */
	public boolean create(Leitor leitor) throws CreateLeitorException {
		if (!Arquivo_XML_Leitor.leitores.contains(leitor)) {
			Arquivo_XML_Leitor.leitores.add(leitor);
			Arquivo_XML_Leitor.salvarXML();	
			return true;
		} else throw new CreateLeitorException(leitor);
	}

	/**
	 * Procura o cadastro de um leitor através do código.
	 * @param codigo
	 * @return true caso seja encontrado, se não, false.
	 */
	public boolean read(String codigo) throws ReadLeitorException {
		
		boolean resultado = false;

		Arquivo_XML_Leitor.lerXML();

		for (int i = 0; i < Arquivo_XML_Leitor.leitores.size(); i++) {
			if (Arquivo_XML_Leitor.leitores.get(i).getCpf().equals(codigo)) {
				System.out.println(Arquivo_XML_Leitor.leitores.get(i));
				resultado = true;
			}
		}

		if (resultado != true) {
				throw new ReadLeitorException(codigo);
		}
		return resultado;
	}
		
	
	/**
	 * Atualiza os atributos do leitor.
	 * @param codigo
	 * @return true caso a atualização seja bem sucedida, se não, false.
	 */
	public boolean update(String codigo) throws UpdateLeitorException{
		
		boolean resultado = false;
		
		Arquivo_XML_Leitor.lerXML();
		
		for (Leitor aux : Arquivo_XML_Leitor.leitores) {
			if (aux.getCpf().equals(codigo)) {
				System.out.println("----------ATUALIZAR LEITOR----------\nNome: ");
				aux.setNome(in.nextLine());
				System.out.println("Email: ");
				aux.setEmail(in.nextLine());
				System.out.println("Data de Nascimento: ");
				aux.setDataNascimento(in.nextLine());
			//	System.out.println("Pacote: ");
			//	aux.setPacote(in.nextLine());
				
				Arquivo_XML_Leitor.salvarXML();
				
				resultado = true;
			} 
			
			if (resultado != true) {
				throw new UpdateLeitorException(codigo);
			}
			
		}
		return resultado;
	}

	/**
	 * Deleta o leitor através do código.
	 * @param codigo
	 * @return
	 * @throws DeleteLeitorException
	 */
	public boolean delete(String codigo) throws DeleteLeitorException{
		
		boolean resultado = false;
		
		Arquivo_XML_Leitor.lerXML();
		
		for (int i = 0; i < Arquivo_XML_Leitor.leitores.size(); i++) {
			if (Arquivo_XML_Leitor.leitores.get(i).getCpf().equals(codigo)) {
				Arquivo_XML_Leitor.leitores.remove(i);
				Arquivo_XML_Leitor.salvarXML();
				resultado = true;
			}
		}
		
		if (resultado != true) {
			throw new DeleteLeitorException(codigo);
		}
		return resultado;
	}	
	
}
