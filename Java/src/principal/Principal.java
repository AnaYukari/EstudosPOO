package principal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import classes.Venda;

public class Principal {
	static ArrayList<Double> Array = new ArrayList<Double>();
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Menu();
		read.close();
	}

	public static void RegistrarUmaVenda() {
		String produto;
		Double valor;
		System.out.println("Qual foi o produto vendido? ");
		produto = read.next();
		System.out.println("Qual foi o valor desse produto? ");
		valor = read.nextDouble();
		Venda venda = new Venda(produto, valor);
		Array.add(valor);
		System.out.println("Venda registrada com sucesso!");
		System.out.println(Array);
	}

	public static void Menu() {
		Scanner clemencio = new Scanner(System.in);
		int option;
		do {
			System.out.println("O que você deseja fazer? ");
			System.out.println("1. Registrar uma venda");
			System.out.println("2. Fazer o fechamento do dia");
			option = clemencio.nextInt();

			switch (option) {
			case 1:
				RegistrarUmaVenda();
				break;
			case 2:
				Venda.calculoFechamento(Array);
				break;
			case 3:
				System.out.println("Saindo do programa.....");
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (option != 3);
	}

}
