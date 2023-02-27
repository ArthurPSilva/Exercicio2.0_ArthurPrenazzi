package Registros;

import java.util.ArrayList;

public class Pertence {

	public static void main(String[] args) {
	
		Livro l1 = new Livro("Guerra do Velho","John Scalzi",2005,12355, "Ficcao");
		Livro l2 = new Livro("1984","George Orwell",1949,12369, "Ficcao");
		Livro l3 = new Livro("O Homem de Giz","C.J. Tudor",2018,66621,"Suspense");
		Livro l4 = new Livro("Revolucao dos bichos","George Orwell",1999,12344,"Ficcao");
		Livro l5 = new Livro("Os Miseraveis","Victor Hugo",1862,24613,"Romance");
		Livro l6 = new Livro("A culpa e das Estrelas","John Green",2014,24677,"Romance");
		Livro l7 = new Livro("Diario de um Banana","Jeff Kinney",2010,43216,"Comedia");
		Livro l8 = new Livro("Os treze Porques","Jay Asher",2007,66606,"Suspense");
		Livro l9 = new Livro("Lolita","Vladimir Nabokov",1955,24690,"Romance");
		Livro l10 = new Livro("O guia do mochileiro das Galaxias","Douglas Adams",2005,12334,"Ficcao");
		
		ArrayList<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		livros.add(l4);
		livros.add(l5);
		livros.add(l6);
		livros.add(l7);
		livros.add(l8);
		livros.add(l9);
		livros.add(l10);
		
		Categoria c1 = new Categoria(123,"Ficcao");
		Categoria c2 = new Categoria(432,"Comedia");
		Categoria c3 = new Categoria(666,"Suspense");
		Categoria c4 = new Categoria(246,"Romance");
		
		ArrayList<Categoria> categorias = new ArrayList<>();
		categorias.add(c1);
		categorias.add(c2);
		categorias.add(c3);
		categorias.add(c4);
		
		System.out.println(livros);
		}
		
	}


