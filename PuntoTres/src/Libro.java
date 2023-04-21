public class Libro {
	
	private int ISBN;
	private String Titulo;
	private String Autor; 
	private int NumPaginas;
	
	public Libro(int pISBN, String pTitulo, String pAutor, int pNumPaginas){
		
		ISBN=pISBN;
		Titulo=pTitulo;
		Autor=pAutor;
		NumPaginas=pNumPaginas;
		}                          
	
	public int getISBN() {
		
		return ISBN;
		
	}
	
	public void setISBN(int ISBN) {
		
		this.ISBN = ISBN;
		
	}
		
	public String getTitulo() {
		
		return Titulo;
	}
	
	public void setTitulo(String Titulo) {
		
		this.Titulo = Titulo;
	}
	
	public String getAutor() {
		
		return Autor;
		
	}
	
	public void setAutor(String Autor) {
		
		this.Autor=Autor;
	}
	
	public int getNumPaginas() {
		
		return NumPaginas;
	}

	public void setNumPaginas(int NumPaginas) {
		
		this.NumPaginas=NumPaginas;
	}
	
public String toString() {
	
	return "El libro con ISBN creado por el autor tiene páginas";
	
}
	
}
	


