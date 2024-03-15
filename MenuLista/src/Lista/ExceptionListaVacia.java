package Lista;

public class ExceptionListaVacia extends RuntimeException {

  public ExceptionListaVacia() {
    this("Lista");
  }

  public ExceptionListaVacia(String nombre) {
    super("\nLa lista " + nombre + " está vacía");
  }
}
