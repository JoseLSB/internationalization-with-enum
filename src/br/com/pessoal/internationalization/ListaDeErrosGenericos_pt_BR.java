package br.com.pessoal.internationalization;

public enum ListaDeErrosGenericos_pt_BR implements ListaDeErros {
	
	ATENDIMENTO001("Teste de erros");
	
	ListaDeErrosGenericos_pt_BR(String mensagemErro) {
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
