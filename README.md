# Desafio Iphone DIO

> Esse desafio consiste no primeiro Iphone 2007 a qual foi apresentado por Ateve Jobs a qual trás com funcionalidade de Reprodutor Musical, Aparelho Telefônico e Navegador Na Internet.
> 
> Abaixo é possível visualizar essa representação pedida:
> 
> ![image](https://github.com/gabrielsantos969/DESAFIO-IPHONE-DIO/assets/69515741/e2306cb2-d861-478a-a9ed-75df504f5b48)


### UML do Projeto

> Sendo assim foi desenhada a UML do projeto para representa-lo quando passado para Java.
> 
> Abaixo segue a imagem do UML:
> 
> ![image](https://github.com/gabrielsantos969/DESAFIO-IPHONE-DIO/assets/69515741/448bdcf7-6ff1-4f46-99fb-9ec9e40ae791)

### Código Principal do Projeto

```java
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
```

### Estrutura De Diretórios

```
.
├── Main.java
├── aparelhos
│   └── Iphone.java
└── funcionalidades
    ├── AparelhoTelefonico.java
    ├── NavegadorNaInternet.java
    └── ReprodutorMusical.java

```

### Projeto em execução 

> E para ser mostrada a funcionalidade do projeto é possível clonar e reproduzir na sua maquina esse projeto ou visualizar aqui como foi feito.
> 
> Abaixo segue a imagem do projeto depois de executado:
> 
> ![image](https://github.com/gabrielsantos969/DESAFIO-IPHONE-DIO/assets/69515741/385f92b8-9db8-4d64-bc65-780b99cc45e7)

