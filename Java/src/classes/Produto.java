package classes;

import java.util.ArrayList;

public class Produto {
	private String NomeProduto;
	private double Preço;

	
	public Produto(String produto, double preço) {
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
	
	
	public static double calculoFechamento (ArrayList<Double> Array) {
		double ValorFechamento = 0.0;
		for (Double venda : Array) {
			ValorFechamento += venda;
		}
		return  ValorFechamento;
	}
	
	public static double calculoTicket(ArrayList<Double> Array) {
		double media = 0;
		for (Double venda : Array) {
			media = calculoFechamento(Array)/Array.size();
			
		}
		return media;
	
	}
	
	

	
}
