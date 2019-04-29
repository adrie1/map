package filme;

import java.util.ArrayList;
import java.util.List;

import funcionarios.Funcionario;

/**
 * Classe Filme com seus atributos
 * 
 * @author Adriele e Samara
 */
public class Filme {

	private String nome;
	private int ano;
	private String duracao;
	private String genero;
	private String trilhasonora;
	private Funcionario ator;
	private Funcionario diretor;
	private Funcionario camera;
	private Funcionario roteirista;
	private List<Funcionario> funcionarios;
	
	/**
	 * Construtor da classe Filme
	 * 
	 * @param nome
	 * @param ano
	 * @param duracao
	 * @param genero
	 * @param trilhasonora
	 */
	public Filme(String nome, int ano, String duracao, String genero, String trilhasonora, Funcionario ator, Funcionario diretor, Funcionario camera, Funcionario roteirista) {
		this.nome = nome;
		this.ano = ano;
		this.duracao = duracao;
		this.genero = genero;
		this.trilhasonora = trilhasonora;
		this.ator = ator; 
		this.diretor = diretor; 
		this.camera = camera;
		this.roteirista = roteirista;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public Filme() {
		
	}

	/**
	 * @return o nome do filme
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Seta o nome do filme
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return o ano do filme
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Seta o ano do filme
	 * 
	 * @param ano
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * @return a duracao do filme
	 */
	public String getDuracao() {
		return duracao;
	}

	/**
	 * Seta a duracao do filme
	 * 
	 * @param duracao
	 */
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	/**
	 * @return o genero do filme
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Seta o genero do filme
	 * 
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return a trilha sonora do filme
	 */
	public String getTrilhasonora() {
		return trilhasonora;
	}

	/**
	 * Seta a trilha sonora do filme
	 * 
	 * @param trilhasonora
	 */
	public void setTrilhasonora(String trilhasonora) {
		this.trilhasonora = trilhasonora;
	}

	/**
	 * @return o ator do filme
	 */
	public Funcionario getAtor() {
		return ator;
	}

	/**
	 * Seta o ator do filme
	 * 
	 * @param ator
	 */
	public void setAtor(Funcionario ator) {
		this.ator = ator;
	}

	/**
	 * @return o diretor do filme
	 */
	public Funcionario getDiretor() {
		return diretor;
	}

	/**
	 * Seta o diretor do filme
	 * 
	 * @param diretor
	 */
	public void setDiretor(Funcionario diretor) {
		this.diretor = diretor;
	}

	/**
	 * @return o camera do filme
	 */
	public Funcionario getCamera() {
		return camera;
	}

	/**
	 * Seta o camera do filme
	 * 
	 * @param camera
	 */
	public void setCamera(Funcionario camera) {
		this.camera = camera;
	}

	/**
	 * @return o roteirista do filme
	 */
	public Funcionario getRoteirista() {
		return roteirista;
	}

	/**
	 * Seta o roteirista do filme
	 * 
	 * @param roteirista
	 */
	public void setRoteirista(Funcionario roteirista) {
		this.roteirista = roteirista;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public String toString() {
		return "Filme \nNome = " + nome + "\nAno = " + ano + "Duração = " + duracao + "\nGênero = " + genero
				+ "\nTrilha Sonora = " + trilhasonora + "\nEquipe = " + funcionarios + "";
	}

}
