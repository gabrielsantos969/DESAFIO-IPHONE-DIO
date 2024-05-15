package aparelhos;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorNaInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical{
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONADO NOVA ABA");
		
	}
	
	
	@Override
	public void atualizarPagina() {
		System.out.println("PAGINA ATUALIZADA");
		
	}
	
	@Override
	public void exibirPagina() {
		System.out.println("PAGINA SENDO EXIBIDA");
		
	}
	
	@Override
	public void atender() {
		System.out.println("TELEFONEMA ATENDIDO");
		
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("CORREIO DE VOZ INICIADO");
		
	}
	
	@Override
	public void ligar() {
		System.out.println("LIGACAO FEITA");
		
	}
	
	@Override
	public void pausar() {
		System.out.println("MUSICA PAUSADA");
		
	}
	
	@Override
	public void selecionarMusica() {
		System.out.println("MUSICA SELECIONADA");
		
	}
	
	@Override
	public void tocar() {
		System.out.println("MUSICA SENDO TOCADA");
		
	}
}
