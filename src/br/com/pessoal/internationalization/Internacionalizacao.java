package br.com.pessoal.internationalization;

/**
 * Classe resposável por efetuar a tradução dos erros que implementam a {@link ListaDeErros}.
 * 
 * @author José Lucas
 * @since 2020-04-06
 * @version 2020-04-06 - Versão inicial. 
 *
 */
public class Internacionalizacao {
	
	private static final String FORMATACAO_INTERNACIONALIZACAO = "%s%s";
	private static final String FORMATACAO_IDENTIFICACAO = "_%s";

	/**
	 * Método responsável por traduzir determinado erro, dado o mesmo informado por parâmetro juntamente com um idioma.
	 * 
	 * @param erro inserir uma {@link ListaDeErros}
	 * @param idioma inserir um {@link Idiomas}
	 * @return o erro traduzido
	 * @throws ClassNotFoundException
	 */
	public static String traduzErro(ListaDeErros erro, Idiomas idioma) throws ClassNotFoundException {
		String nomeDaClasseDeErros = erro.getClass().getName();
		String identificacaoDoIdioma = "";
		
		if (idioma != null)
			identificacaoDoIdioma = String.format(FORMATACAO_IDENTIFICACAO, idioma.getIdentificacao());
		
		Class enumClass = Class.forName(String.format(FORMATACAO_INTERNACIONALIZACAO, nomeDaClasseDeErros, identificacaoDoIdioma));
		ListaDeErros erroNoIdiomaInformado = (ListaDeErros) Enum.valueOf(enumClass, erro.getCodigoInterno());
		return erroNoIdiomaInformado.getMensagem();
	}
	
}
