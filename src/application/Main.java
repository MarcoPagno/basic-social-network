package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Postagem;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Postagem> post = new ArrayList<>();
		int ver = 0;

		while (ver == 0) {

			System.out.println("\nO que voce deseja fazer? ");
			System.out.println("1-Postar");
			System.out.println("2-Navegar");
			System.out.println("3-Sair");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:							//Faz um post
				
				System.out.println("\nPoste algo! ");
				System.out.printf("Titulo:");
				sc.nextLine();
				String titulo = sc.nextLine();
				System.out.println("Post: ");
				String conteudo = sc.nextLine();
				Date p1 = new Date();
				int likes = 0;

				Postagem post1 = new Postagem(p1, titulo, conteudo, likes);
				post.add(post1);

				break;
				
			case 2:							//Mostra todas as postagens
				for(Postagem x : post) {
					System.out.println(x);
					System.out.println("1-Like");
					System.out.println("2-Comentar");
					System.out.println("3-Dar like e comentar");
					System.out.println("4-Proximo Post");
					int op = sc.nextInt();
					switch(op) {
					case 1:
						x.darLike();
						break;
					case 2:
						x.comentar(x);
						break;
					case 3:
						x.darLike();
						x.comentar(x);
						break;
					default:
						break;
					}
				}
				break;
			default:
				System.out.println("\nFinalizando sistema...");
				ver = 1;
				break;
			}

		}
		sc.close();
	}

}
