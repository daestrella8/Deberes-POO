public class Main {
  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));
    biblioteca.agregarLibro(new Libro("El principito", "Antoine de Saint-Exupéry"));

    System.out.println("Libros en la biblioteca:");
    for (Libro libro : biblioteca.getLibros()) {
      System.out.println("- " + libro.getTitulo() + " (" + libro.getAutor() + ")");
    }
  }
}
