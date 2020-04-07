package br.com.pessoal.internationalization;

/**
 * Enum responsável por conter os idiomas e suas propriedades.
 * 
 * @author José Lucas
 * @since 2020-04-06
 * @version 2020-04-06 - Versão inicial.
 *
 */
public enum Idiomas {
	
	PT_BR("Português Brasil", "pt_BR", "Brasil"),
	EN_US("American English", "en_US", "United States");
	
	Idiomas(String idioma, String identificacao, String pais) {
		this.idioma = idioma;
		this.identificacao = identificacao;
		this.pais = pais;
	}
	
	private String idioma;
	private String identificacao;
	private String pais;
	
	public String getIdioma() {
		return idioma;
	}
	
	public String getIdentificacao() {
		return identificacao;
	}
	
	public String getPais() {
		return pais;
	}
	
	

}
