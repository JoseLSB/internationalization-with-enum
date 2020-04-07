package br.com.pessoal.internationalization;

public class Main {
	
	private static final String RETORNO_INTERNACIONALIZACAO = "%s: %s";
	
	public static void main( String[] args ) throws ClassNotFoundException {
		
		ListaDeErros erro = ListaDeErrosGenericos.ATENDIMENTO001;
		System.out.println(String.format(RETORNO_INTERNACIONALIZACAO, Idiomas.PT_BR.getIdioma(), Internacionalizacao.traduzErro(erro, Idiomas.PT_BR)));
		System.out.println(String.format(RETORNO_INTERNACIONALIZACAO, Idiomas.EN_US.getIdioma(), Internacionalizacao.traduzErro(erro, null)));
		
	}

}
