package ListaEnteros;

public class Lista {

  private Nodo primerNodo;
  private Nodo ultimoNodo;
  private String nombre;

  public Lista() {
    nombre = "lista";
  }

  public Lista(String nombreLista) {
    nombre = nombreLista;
    primerNodo = ultimoNodo = null;
  }

  public void insertarPorReferencia(Object dato, Object referencia) {
    Nodo nuevo;
    Nodo anterior = buscarPorValor(referencia);
    if (anterior != null) {
      nuevo = new Nodo(dato);
      nuevo.siguienteNodo = anterior.siguienteNodo;
      anterior.siguienteNodo = nuevo;
    } else {
      System.out.println("No se encontro el valor de referencia");
    }
  }

  public Nodo buscarPorValor(Object destino) {
    Nodo indice;
    for (indice = primerNodo; indice != null; indice = indice.siguienteNodo) {
      if (indice.dato.equals(destino)) {
        return indice;
      }
    }
    return null;
  }

  public void insertarAlFrente(Object elemento) {
    if (estaVacia()) {
      primerNodo = ultimoNodo = new Nodo(elemento);
    } else {
      primerNodo = new Nodo(elemento, primerNodo);
    }
  }

  public void insertarAlFinal(Object elemento) {
    if (estaVacia()) {
      primerNodo = ultimoNodo = new Nodo(elemento);
    } else {
      ultimoNodo = ultimoNodo.siguienteNodo = new Nodo(elemento);
    }
  }

  public boolean estaVacia() {
    return primerNodo == null;
  }

  public void imprimir() {
    if (estaVacia()) {
      System.out.println(nombre + " esta vacia");
      return;
    } else {
      System.out.println("El contenido de la lista es: ");
      Nodo actual = primerNodo;
      while (actual != null) {
        System.out.print(actual.dato + " ");
        actual = actual.siguienteNodo;
      }
      System.out.println("\n");
    }
  }
}
