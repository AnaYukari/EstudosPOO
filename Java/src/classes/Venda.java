package classes;

import java.util.ArrayList;

public class Venda {
	private String NomeProduto;
	private double Preço;

	
	public Venda(String produto, double preço) {
		NomeProduto = produto;
		Preço = preço;
	}

	public String getProduto() {
		return NomeProduto;
	}

	public void setProduto(String produto) {
		NomeProduto = produto;
	}

	public double getPreço() {
		return Preço;
	}

	public void setPreço(double preço) {
		Preço = preço;
	}
	
	
	public static void calculoFechamento (ArrayList<Double> Array) {
		double ValorFechamento = 0.0;
		for (Double venda : Array) {
			ValorFechamento += venda;
		}
		System.out.println("O valor das vendas de hoje foi R$" + ValorFechamento + "!");
	}
	
}
