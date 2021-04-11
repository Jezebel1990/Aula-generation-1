package ProjetoBloco1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filmes extends Listas {
	
	public Filmes() {}
	
	Scanner scanner = new Scanner(System.in);

	@Override
	public List<String> lista1()
	{
		List<String> listaAcao = new ArrayList<String>();
		listaAcao.add("Código de Conduta");
		listaAcao.add("Polar");	
		listaAcao.add("O Alvo");
		return listaAcao;
	)
	@Override
	public List<String> lista2()
	{
		List<String> listaTerror = new ArrayList<String>();
		listaTerror.add("Evil Dead");
		listaTerror.add("O Iluminado");
		listaTerror.add("Annabelle");
		return listaTerror;
	}
	@Override
	public List<String> lista3()
	{
		List<String> listaRomance = new ArrayList<String>();
		listaRomance.add("Orgulho e Preconceito");
		listaRomance.add("Titanic");	
		listaRomance.add("Um dia");
		return listaRomance;
	}
	@Override
	public List<String> lista4()
	{
		List<String> listaFiccaoFantasia = new ArrayList<String>();
		listaFiccaoFantasia.add("Senhor dos Anéis");
		listaFiccaoFantasia.add("Harry Potter");	
		listaFiccaoFantasia.add("Star Wars");
		return listaFiccaoFantasia;
	}
	@Override
	public List<String> lista5()
	{
		List<String> listaDrama = new ArrayList<String>();
		listaDrama.add("A Espera de um Milagre");
		listaDrama.add("Patch Adams");	
		listaDrama.add("O Homem Bicentenário");
		return listaDrama;
	}
	@Override
	public List<String> lista6()
	{
		List<String> listaAnimacao = new ArrayList<String>();
		listaAnimacao.add("Aladdin");
		listaAnimacao.add("Moana");	
		listaAnimacao.add("Divertidamente");
		return listaAnimacao;
	}
	@Override
	public void filmes (String filmes)
	{
		
			System.out.println("\nDigite o número da opção desejada:\n1- Ação\n2- Terror\n3- Romance"
					+ "\n4- Ficção e Fantasia\n5- Drama\n6- Animação");
			filmes = scanner.nextLine(); 
		switch (filmes)
		{
		case "1" :
			scanner.nextLine();
			System.out.println("Digite o número da opção desejada:\n1- serie\n2- filme");
			String op = scanner.nextLine();
			switch (op)
			{
			case "1":
				System.out.println(lista2());
			case "2":
				System.out.println(lista1());
			//System.out.println(lista1());
			break;
		case "2" :
			scanner.nextLine();
			System.out.println(lista2());
			break;
		case"3" :
			scanner.nextLine();
			System.out.println(lista3());
			break;
		case "4" :
			scanner.nextLine();
			System.out.println(lista4());
			break;
		case "5" :
			scanner.nextLine();
			System.out.println(lista5());
			break;
		case "6" :
			scanner.nextLine();
			System.out.println(lista6());
			break;
		    default:
			System.out.println("Opção inválida. Tente novamente!");
		    break;
			}
		}
		
	}	
}
