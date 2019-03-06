package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exception.leitor.CreateLeitorException;
import exception.leitor.DeleteLeitorException;
import exception.leitor.ReadLeitorException;
import manutencao.leitor.CadastroLeitor;
import manutencao.leitor.Leitor;
import pacote.Pacote;

/**
 * Classe de teste CadastroLeitorTest
 * @author Adriele e Samara
 */
public class CadastroLeitorTest {
	
	Leitor leitor1;
	Leitor leitor2;
	CadastroLeitor cad1;
	Pacote pacote;

	@Before
	public void setUp() throws Exception {
		leitor1 = new Leitor();
		leitor2 = new Leitor();
		cad1 = new CadastroLeitor();
		pacote = new Pacote();
		
		pacote.setNome("Basic");
		pacote.setPreco(240);
		pacote.setQuantidadeLivros(3);
		
		leitor1.setCpf("12345678-9");
		leitor1.setDataNascimento("22/12/1995");
		leitor1.setEmail("fulaninho@gmail.com");
		leitor1.setNome("Fulano A");
		leitor1.setPacote(pacote);
		
		leitor2.setCpf("98765432-1");
		leitor2.setDataNascimento("19/08/1993");
		leitor2.setEmail("beltraninho@gmail.com");
		leitor2.setNome("Beltrano B");
		leitor2.setPacote(pacote);
		
	}

	
	/**
	 * Teste cadastrando uma vez o leitor.
	 * @throws CreateLeitorException
	 */
	@Test
	public void testCreate() throws CreateLeitorException {
		assertEquals(true, cad1.create(leitor1));
	}
	
	
	/**
	 * Teste cadastrando duas vezes o mesmo leitor.
	 * @throws CreateLeitorException
	 */
	@Test (expected = CreateLeitorException.class)
	public void testCreateFalse() throws CreateLeitorException {
		cad1.create(leitor1);
		cad1.create(leitor1);
	}
	
	
	/**
	 * Teste removendo um leitor já cadastrado.
	 * @throws DeleteLeitorException
	 * @throws CreateLeitorException
	 */
	@Test
	public void testDelete() throws DeleteLeitorException, CreateLeitorException {
		cad1.create(leitor1);
		assertEquals(true, cad1.delete("12345678-9"));
	}
	
	
	/**
	 * Teste removendo um leitor que não está cadastrado ou que ja foi removido anteriormente.
	 * @throws DeleteLeitorException
	 */
	@Test (expected = DeleteLeitorException.class)
	public void testDeleteFalse() throws DeleteLeitorException {
		cad1.delete("12345678-9");
		//Que já foi deletado
		cad1.delete("12345678-9");
		//Que não foi cadastrado
		cad1.delete("98765432-1");
	}
	
	
	/**
	 * Teste para ver informações de um leitor que já foi cadastrado.
	 * @throws ReadLeitorException
	 * @throws CreateLeitorException
	 */
	@Test
	public void testUpdate() throws ReadLeitorException, CreateLeitorException {
		cad1.create(leitor1);
		assertEquals(true, cad1.read("12345678-9"));
	}
	
	
	/**
	 * Teste para ver informações de um leitor que já foi removido ou não foi cadastrado.
	 * @throws ReadLeitorException
	 * @throws DeleteLeitorException
	 * @throws CreateLeitorException
	 */
	@Test (expected = ReadLeitorException.class)
	public void testRead() throws ReadLeitorException, DeleteLeitorException, CreateLeitorException {
		//Que não foi criado
		cad1.read("12345678-9");
		//Que já foi deletado
		cad1.create(leitor2);
		cad1.delete("98765432-1");
		cad1.read("98765432-1");
	}

}
