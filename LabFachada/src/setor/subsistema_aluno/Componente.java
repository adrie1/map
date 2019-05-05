package setor.subsistema_aluno;

/**
 * Classe Componente representando um componente curricular
 * @author Adriele e Samara
 */
public class Componente {

	private int codigo;
	private String nomeDisciplina;
	private String periodo;
	private double media;
	private String situacao;

	/**
	 * Construtor da classe Componente
	 * @param codigo
	 * @param nomeDisciplina
	 * @param periodo
	 * @param media
	 * @param situacao
	 */
	public Componente(int codigo, String nomeDisciplina, String periodo, double media, String situacao) {
		this.codigo = codigo;
		this.nomeDisciplina = nomeDisciplina;
		this.periodo = periodo;
		this.media = media;
		this.situacao = situacao;
	}
	
	/**
	 * @return o código do componente
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Seta o código do componente
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return o nome da disciplina do componente
	 */
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	/**
	 * Seta o nome da disciplina do componente
	 * @param nomeDisciplina
	 */
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	/**
	 * @return o período do componente
	 */
	public String getPeriodo() {
		return periodo;
	}

	/**
	 * Seta o período do componente
	 * @param periodo
	 */
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	/**
	 * @return a média do componente
	 */
	public double getMedia() {
		return media;
	}

	/**
	 * Seta a média do componente
	 * @param media
	 */
	public void setMedia(double media) {
		this.media = media;
	}

	/**
	 * @return a situação do componente
	 */
	public String getSituacao() {
		return situacao;
	}

	/**
	 * Seta a situação do componente
	 * @param situacao
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Componente [nomeDisciplina=" + nomeDisciplina + ", periodo=" + periodo + ", media=" + media
				+ ", situacao=" + situacao + "]";
	}

}
