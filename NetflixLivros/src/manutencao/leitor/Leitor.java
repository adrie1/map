package manutencao.leitor;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import leitura.Comentario;
import leitura.Leitura;
import leitura.Status;
import pacote.Pacote;

/**
 * Classe Leitor contendo seus atributos.
 * @author Adriele e Samara
 */
@XStreamAlias("leitor")
public class Leitor {

	private String cpf;
	private String nome;
	private String email;
	private String dataNascimento;
	private Pacote pacote;
	public static List<Comentario> comentarios = new ArrayList<Comentario>();
	public static List<Leitura> leituras = new ArrayList<Leitura>();
	
	/**
	 * Construtor da classe Leitor.
	 * @param cpf
	 * @param nome
	 * @param email
	 * @param dataNascimento
	 * @param pacote
	 * @param leituras
	 */
	public Leitor(String cpf, String nome, String email, String dataNascimento, Pacote pacote){
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.pacote = pacote;
	}
	
	public Leitor(){
		
	}

	/**
	 * Métodos get e set de cada atributo.
	 * @return
	 */
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Pacote getPacote() {
		return pacote;
	}

	public void setPacote(Pacote pacote) {
		this.pacote = pacote;
	}

	public List<Leitura> getLeituras() {
		return leituras;
	}

	public void setLeituras(List<Leitura> leituras) {
		Leitor.leituras = leituras;
	}
	
	
	public static List<Comentario> getComentarios() {
		return comentarios;
	}

	public static void setComentarios(List<Comentario> comentarios) {
		Leitor.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "\nCpf = " + cpf + "\nNome = " + nome + "\nEmail = " + email + "\nData de nascimento = " + dataNascimento
				+"\nPacote = " + pacote + "\n\n----------Leituras----------" + leituras + "\n\nComentários do leitor = " + comentarios + "";
	}

}
