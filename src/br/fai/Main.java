package br.fai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	Scanner scanner = new Scanner(System.in);
	int idController = 1;

	List<Cavalo> listCavalo = new ArrayList<Cavalo>();
	List<Girafa> listGirafa = new ArrayList<Girafa>();
	List<Animal> listAnimal = new ArrayList<Animal>();

	Map<Integer, Animal> mapAnimal = new HashMap<Integer, Animal>();

	private void start() {

		int opcao = 1;

		do {

			System.out.println("1. Cadastro cavalo");
			System.out.println("2. Cadastro girafa");
			System.out.println("3. Lista cavalos");
			System.out.println("4. Lista girafas");
			System.out.println("5. Lista animais");
			System.out.println("6. Remover animal por id");
			System.out.println("7. Exibir animais por categoria");
			System.out.println("8. Sair\n");
			System.out.print("Opção: ");

			opcao = scanner.nextInt();

			switch (opcao) {

			case 1: {
				addCavalo();
				System.out.println("\n\n\n\n");
			}
				break;

			case 2: {
				addGirafa();
				System.out.println("\n\n\n\n");
			}
				break;

			case 3: {
				listCavalos();
				System.out.println("\n\n\n\n");
			}
				break;

			case 4: {
				listGirafas();
				System.out.println("\n\n\n\n");
			}
				break;

			case 5: {
				listAll();
				System.out.println("\n\n\n\n");
			}
				break;

			case 6: {
				showAnimalsDatails();
				System.out.println("\n\n\n\n");
			}
				break;

			case 7: {
				deleteAnimalByID();
			}
				break;

			default:
				break;
			}

		} while (opcao != 8);

	}

	private void addCavalo() {

		int id = idControl();
		String nome;

		System.out.println("Cadastro de cavalo");
		System.out.print("Nome do cavalo: ");
		nome = scanner.next();

		try {

			Cavalo novoCavalo = new Cavalo(id, nome);
			listCavalo.add(novoCavalo);
			listAnimal.add(novoCavalo);
			mapAnimal.put(id, novoCavalo);

			System.out.println("Cavalo cadastrado.\n");

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	private void addGirafa() {

		int id = idControl();
		String nome;
		
		System.out.println("Cadastro de girafa");

		System.out.print("Nome da girafa: ");
		nome = scanner.next();

		try {

			Girafa girafa = new Girafa(id, nome);

			listGirafa.add(girafa);
			listAnimal.add(girafa);
			mapAnimal.put(id, girafa);

			System.out.println("Girafa cadastrada\n");

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

	private void listCavalos() {

		System.out.println("Lista de cavalos");
		for (Cavalo cavalo : listCavalo) {
			System.out.println("Cavalo: " + cavalo.getId() + " | " + cavalo.getNome());
		}

	}

	private void listGirafas() {

		System.out.println("Lista de girafas");
		for (Girafa girafa : listGirafa) {
			System.out.println("Cavalo: " + girafa.getId() + " | " + girafa.getNome());
		}

	}

	private void listAll() {

		System.out.println("Lista com todos animais");
		for (Animal animal : listAnimal) {

			if (animal instanceof Cavalo) {

				Cavalo cavalo = (Cavalo) animal;
				System.out.println("Cavalo | " + cavalo.getId() + " | " + cavalo.getNome());

			}

			if (animal instanceof Girafa) {

				Girafa girafa = (Girafa) animal;
				System.out.println("Girafa | " + girafa.getId() + " | " + girafa.getNome());

			}

		}

	}

	private void showAnimalsDatails() {

		System.out.println("Detalhes dos animais");
		System.out.println("Quantidade de cavalos: " + listCavalo.size());
		for (Cavalo cavalo : listCavalo) {
			System.out.println("\tCavalo: " + cavalo.getId() + " | " + cavalo.getNome());
		}

		System.out.println("Números de girafas: " + listGirafa.size());
		for (Girafa girafa : listGirafa) {
			System.out.println("\tDados da girafa: " + girafa.getId() + " | " + girafa.getNome());
		}

		System.out.println("Total de animais: " + listAnimal.size());

	}
	
	
private void deleteAnimalByID() {
		
	/*
		int id;
		System.out.println("Remoção de animal por id");
		System.out.print("Digite a id do animal: ");
		id = scanner.nextInt();
		
		try {
			
			for(int i = 0; i< listCavalo.size(); i++) {
				
				Cavalo cavalo = listCavalo.get(i);
				if(cavalo.getId() == id) {
					listCavalo.remove(i);
				}
				
			}
			
			for(int i = 0; i< listaDeGirafas.size(); i++) {
				
				Girafa girafa = listaDeGirafas.get(i);
				if(girafa.getId() == id) {
					listaDeGirafas.remove(i);
				}
				
			}
			
			for(int i = 0; i< listaDeAnimais.size(); i++) {
				
				Animal animal = listaDeAnimais.get(i);
				
				if(animal instanceof Cavalo) {
					
					Cavalo cavalo = (Cavalo) animal;
					if(cavalo.getId() == id) {
						listaDeAnimais.remove(i);
					}
					
				}
				
				if(animal instanceof Girafa) {
					
					Girafa girafa = (Girafa) animal;
					if(girafa.getId() == id) {
						listaDeAnimais.remove(i);
					}
					
				}
				
			}
			
			mapAnimais.remove(id);
			
			System.out.println("Animal removido com sucesso.");
			
		} catch (Exception e) {
			System.out.println("Ocorreu um problema na tentativa de remover o animal: " + e);
		}*/
		
	}

	private int idControl() {
		return this.idController++;
	}

}
