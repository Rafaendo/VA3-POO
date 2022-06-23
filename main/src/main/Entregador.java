package main;

public abstract class Entregador{
	
	public String nome;
	public int idade;
	
	abstract int tempoDeEntrega();
	
		 public abstract void Bike();
		  public void velocidade() {
		    System.out.println("4x");

   }
	
		public abstract void Moto();
		  public void velocidade01() {
		    System.out.println("2x");
	}
	
		  public abstract void Drone();
		  public void velocidade02() {
		    System.out.println("1x");
	}
}
