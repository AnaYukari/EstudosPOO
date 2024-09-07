package principal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import classes.Produto;

public class Principal {
	static ArrayList<Double> ArrayValores = new ArrayList<Double>();
	static ArrayList<Double> ProdutosValor = new ArrayList<Double>();
	static ArrayList<String> ProdutosNome = new ArrayList<String>();
	
	static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Menu();
		read.close();
	}


	public static void Menu() {
		Scanner clemencio = new Scanner(System.in);
		String option;
		do {
			System.out.println("O que você deseja fazer? ");
			System.out.println("1. Registrar uma venda");
			System.out.println("2. Fazer o fechamento do dia");
			System.out.println("3. Calcular ticket do dia");
			System.out.println("4. Cadastrar Produto");
			System.out.println("5. Listar Produtos");
			option = clemencio.nextLine();

			switch (option) {
			case "1":
				RegistrarUmaVenda();
				break;
			case "2":
				FazerFechamento(ArrayValores);
				break;
			case "3":
				CalcularTicket(ArrayValores);
				break;
			case "4":
				CadastrarProduto();
				break;
			case "5":
				ListaProdutos( ProdutosNome, ProdutosValor);
				break;
			case "6":
//				System.out.println("Saindo do programa.....");
				break;
			default:
				System.out.println("Opção inválida!");
			}

		} while (option != "6");
	}
	
	
	public static void FazerFechamento(ArrayList<Double> Array) {
		System.out.println("O valo final das vendas foi: " + Produto.calculoFechamento(Array));
		
	}
	
	public static void CalcularTicket(ArrayList<Double> Array) {
		
		System.out.println("O calculo do ticket é: " + Produto.calculoTicket(Array));
		
	}
	
	public static void RegistrarUmaVenda() {
		String produto;
		Double valor;
		System.out.println("Qual foi o produto vendido? ");
		produto = read.next();
		System.out.println("Qual foi o valor desse produto? ");
		valor = read.nextDouble();
		Produto venda = new Produto(produto, valor);
		ArrayValores.add(valor);
		System.out.println("Venda registrada com sucesso!");
		System.out.println(ArrayValores);
	}
	
	public static void CadastrarProduto() {
		
		String produto;
		Double valor;
		System.out.println("Qual nome do produto que deseja cadastrar? ");
		produto = read.next();
		System.out.println("Qual é o valor produto? ");
		valor = read.nextDouble();
		
		Produto p1 = new Produto(produto, valor);
		ProdutosNome.add(produto);
		ProdutosValor.add(valor);
		System.out.println("Produto cadastrado");
		
	
	}
	
	public static void ListaProdutos(ArrayList<String> nomes, ArrayList<Double> valores) {
		for(int i = 0; i< nomes.size(); i++ ) {
			
			System.out.println((i+1) + ". " + nomes.get(i) + "  -  R$ " + valores.get(i));
			
		}

	}

}
