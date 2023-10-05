public class Livro {
	private String titulo;
	private String autor;
	private int ano;
	private String editora;

	public Livro(String titulo, String autor, int ano, String editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.editora = editora;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String novoTitulo) {
		titulo = novoTitulo;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String novoAutor) {
		autor = novoAutor;
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int novoAno) {
		ano = novoAno;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String novoEditora) {
		editora = novoEditora;
	}
	
	 public String toString() {
	        return titulo + "\n" + autor + "\n" + editora + ", " + ano;
	    }
	}
	
	public static void main(String[] args) {

	}
    public class TestaLivro {
	    public static void main(String[] args) {
	        Livro livro1 = new Livro("The Da Vinci Code", "Dan Brown", 2003, "Doubleday");
	        Livro livro2 = new Livro("Iron Flame (The Empyrean, 2)", "Rebecca Yarros", 2023, "Entangled: Red Tower Books");
	        Livro livro3 = new Livro("Just Because", "Matthew McConaughey", 2004, "Viking Books for Young Readers");

	        System.out.println("Livro 1:\n" + livro1);
	        System.out.println("\nLivro 2:\n" + livro2);
	        System.out.println("\nLivro 3:\n" + livro3);
	    }
        
	public static void main(String[] args) {

	}


}
