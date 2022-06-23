package main;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
List<Produto> veiculos = new ArrayList<Produto>(); 


	public int id;
	public Entregador entregador;


	void exibirPedido() {
			System.out.println("Pedido: 54, Entregador: Jaiminho, ListaDeProdutos: Cadeira e Mesa, Tempo de Entrega: 10 Dias, Valor Total: $50,00");

		}
	
	void calcularTotal() {

			System.out.println("$50,00");

		}

	}