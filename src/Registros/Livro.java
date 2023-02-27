package Registros;

public class Livro {

	private String nome;
	private String autor;
	private int ano_publicacao;
	private int idLivro;
	private String NomeCategoria;
	
	public Livro(String nome, String autor, int ano_publicacao, int idLivro, String NomeCategoria) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.ano_publicacao = ano_publicacao;
		this.idLivro = idLivro;
		this.NomeCategoria = NomeCategoria;
	}
	
	public String getNome() {
		return nome;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno_publicacao() {
		return ano_publicacao;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public String getNomeCategoria() {
		return NomeCategoria;
	}

	@Override
	public String toString() {
		return "[Livro: " + this.nome + " | Categoria: " +  this.NomeCategoria + "]" + "\n";
	}
}