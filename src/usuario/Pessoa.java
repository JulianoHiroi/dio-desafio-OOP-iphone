package usuario;

import aparelhos.Iphone1;
import funcionalidades.ReprodutorMusical;

public class Pessoa {
	public static void main(String[] args) {
		Iphone1 iphone = new Iphone1();
		ReprodutorMusical aparelhoSom = new Iphone1();
		aparelhoSom.tocar();
		aparelhoSom.pausar();
		aparelhoSom.selecionarMusica("Queen");
		iphone.atender();
		iphone.tocar();
		iphone.exibirPagina();
		
	}
}
