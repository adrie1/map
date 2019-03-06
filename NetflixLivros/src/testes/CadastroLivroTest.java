package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exception.livro.CreateLivroException;
import exception.livro.DeleteLivroException;
import exception.livro.ReadLivroException;
import manutencao.livro.CadastroLivro;
import manutencao.livro.Livro;

/**
 * Classe de teste CadastroLivroTest
 * @author Adriele e Samara
 */
public class CadastroLivroTest {
	
	Livro livro1;
	Livro livro2;
	CadastroLivro cad2;

	@Before
	public void setUp() throws Exception {
		
		livro1 = new Livro();
		livro2 = new Livro();
		cad2 = new CadastroLivro();
		
		livro1.setAno("2017");
		livro1.setAssunto("Pol�tica");
		livro1.setAutor("Lima Andrade");
		livro1.setDescricao("Como entender a pol�tica do Brasil e seus eleitores");
		livro1.setEdicao(2);
		livro1.setEditora("Intr�seca");
		livro1.setIdioma("Portugu�s - PtBR");
		livro1.setIsbn("123456789");
		livro1.setTitulo("Pol�tica com Lima");
		
		livro2.setAno("2018");
		livro2.setAssunto("Com�dia Rom�ntica");
		livro2.setAutor("John Green");
		livro2.setDescricao("Se divertir e amar � poss�vel");
		livro2.setEdicao(1);
		livro2.setEditora("Arqueiro");
		livro2.setIdioma("Ingl�s");
		livro2.setIsbn("987654321");
		livro2.setTitulo("Antes de voc�");
		
	}

	
	/**
	 * Teste para cadastrar um livro.
	 * @throws CreateLivroException
	 */
	@Test
	public void testCreate() throws CreateLivroException {
		assertEquals(true, cad2.create(livro1));
	}
	
	
	/**
	 * Teste para cadastrar um livro que j� foi cadastrado anteriormente.
	 * @throws CreateLivroException
	 */
	@Test (expected = CreateLivroException.class) 
	public void testCreateFalse() throws CreateLivroException {
		cad2.create(livro1);
		cad2.create(livro1);
	}
	
	
	/**
	 * Teste para remover um livro cadastrado.
	 * @throws DeleteLivroException
	 * @throws CreateLivroException
	 */
	@Test 
	public void testDelete() throws DeleteLivroException, CreateLivroException {
		cad2.create(livro1);
		assertEquals(true, cad2.delete("123456789"));
	}
	
	
	/**
	 * Teste para remover um livro que n�o foi cadastrado ou que foi removido anteriormente.
	 * @throws DeleteLivroException
	 * @throws CreateLivroException
	 */
	@Test (expected = DeleteLivroException.class)
	public void testDeleteFalse() throws DeleteLivroException, CreateLivroException {
		cad2.create(livro1);
		//Que n�o foi cadastrado
		cad2.delete("987654321");
		//Que j� foi deletado anteriormente
		cad2.delete("123456789");
	}
	
	
	/**
	 * Teste para ler um livro que est� cadastrado.
	 * @throws ReadLivroException
	 * @throws CreateLivroException
	 */
	@Test
	public void testRead() throws ReadLivroException, CreateLivroException {
		cad2.create(livro1);
		assertEquals(true, cad2.read("123456789"));
	}
	
	
	/**
	 * Teste para ler um livro que n�o est� cadastrado ou que foi deletado.
	 * @throws ReadLivroException
	 * @throws CreateLivroException
	 * @throws DeleteLivroException
	 */
	@Test (expected = ReadLivroException.class)
	public void testReadFalse() throws ReadLivroException, CreateLivroException, DeleteLivroException {
		//Que n�o est� cadastrado
		cad2.read("987654321");
		//Que j� foi removido anteriormente
		cad2.delete("123456789");
		cad2.read("123456789");
	}

}
