package ListaEnteros;

public class ExceptionListaVacia extends RuntimeException {

  public ExceptionListaVacia() {
    this("lista");
  }

  public ExceptionListaVacia(String nombre) {
    super(
      "\nLa lista " + nombre + " está vacía. No se puede realizar la operación."
    );
  }
}
