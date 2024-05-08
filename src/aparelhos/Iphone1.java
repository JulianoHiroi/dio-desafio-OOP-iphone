package aparelhos;

import funcionalidades.AparelhoTelefônico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone1 implements AparelhoTelefônico , NavegadorInternet , ReprodutorMusical{
	public void tocar() {
		System.out.println("Estou tocando música");
	}
	public void pausar() {
		System.out.println("Pausei a música");
	}
	public void selecionarMusica(String musica) {
		System.out.println("Selecionei a música " + musica);
	}
	public void ligar() {
		System.out.println("Estou ligando.");
	}
	public void atender() {
		System.out.println("Estou atendendo");
	}
	public void iniciarCorrerioVoz() {
		System.out.println("Estou lendo as mensagens do correio de Voz.");
	}
	public void exibirPagina() {
		System.out.println("Estou exibindo pagina");
	}
	public void adicionarNovaAba(){
		System.out.println("Estou adicionando nova Aba");
	}
	public void atualizarPagina() {
		System.out.println("Estou Atualizando a página");
	}
	
}
