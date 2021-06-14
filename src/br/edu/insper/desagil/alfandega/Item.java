package br.edu.insper.desagil.alfandega;

public class Item {
	private String nome;
	private double valor;
	private double rate;

	public Item(String nome, double valor, double rate) {
		this.nome = nome;
		this.valor = valor;
		this.rate = rate;
	}

	public String getNome() {
		return this.nome;
	}

	public double getValor() {
		return this.valor;
	}

	public double getRate() {
		return this.rate;
	}
	
	public double getTarifa() { 
		// Mesmo em itens sem tarifa, a alfândega cobra
		// uma taxa de 1% Por que? Porque eles podem.
		return 0.01;
	}
}
