package br.com.pessoal.internationalization;

public enum ListaDeErrosGenericos implements ListaDeErros {
	
	ATENDIMENTO001("Test of errors");
	
	ListaDeErrosGenericos(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}
	
	private String mensagemErro;

	@Override
	public String getMensagem() {
		return mensagemErro;
	}

	@Override
	public String getCodigoInterno() {
		return name();
	}
}
