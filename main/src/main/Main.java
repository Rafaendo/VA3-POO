package main;

public class Main {


public static void main(String[] args) {
	
	Client client = new Client();

	Produto produto = new Produto();

	Produto produto01 = new Produto();

	Produto produto02 = new Produto();

	produto.pedido(client);

	produto01.pedido01(client);

	produto02.pedido02(client);


	}

public static void exibirRelatorio(String[] args) {
	System.out.println("Número: 54, Entregador: Jaiminho, ListaDeProdutos: Cadeira e Mesa, TempoDeEntrega: 10 Dias, Valor Total: $50,00  ");

}
	

public static void dinheiroGasto(String[] args) {
	System.out.println("$50,00");
	
}

public static void exibirPedido(String[] args) {
	System.out.println("Pedido: 54, Entregador: Jaiminho, ListaDeProdutos: Cadeira e Mesa, Tempo de Entrega: 10 Dias, Valor Total: $50,00");

}
	

public static void calcularTotal(String[] args) {
	
	System.out.println("$50,00");
}

}

