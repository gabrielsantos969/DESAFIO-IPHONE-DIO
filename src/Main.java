import aparelhos.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		System.out.println("Executando o Reproduto Musical:");
		
		//Reprodutor Musical
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		
		System.out.println("");
		System.out.println("Executando o Aparelho Telefônico:");
		
		//Aparelho Telefônico
		iphone.ligar();
		iphone.iniciarCorreioVoz();
		iphone.atender();
		
		System.out.println("");
		System.out.println("Executando o Navegador na Internet:");
		
		//Navegador na Internet
		iphone.adicionarNovaAba();
		iphone.exibirPagina();
		iphone.atualizarPagina();

	}

}
