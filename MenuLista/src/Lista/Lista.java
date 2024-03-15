package Lista;

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

  public boolean insertarAlFrente(Object elemento) {
    if (estaVacia()) {
      primerNodo = ultimoNodo = new Nodo(elemento);
    } else {
      primerNodo = new Nodo(elemento, primerNodo);
    }
    return true;
  }

  public boolean insertarAlFinal(Object elemento) {
    if (estaVacia()) {
      primerNodo = ultimoNodo = new Nodo(elemento);
      System.out.println(
        "La lista estaba vacia, el valor " +
        elemento +
        " se agrego al inicio y al final de la lista"
      );
    } else {
      ultimoNodo = ultimoNodo.siguienteNodo = new Nodo(elemento);
      System.out.println("Se agrego el valor al final de la lista");
    }
    return true;
  }

  public boolean insertarPorReferencia(Object dato, Object referencia) {
    Nodo nuevo;
    Nodo anterior = buscarPorValor(referencia);
    if (anterior != null) {
      nuevo = new Nodo(dato);
      nuevo.siguienteNodo = anterior.siguienteNodo;
      anterior.siguienteNodo = nuevo;
      System.out.println(
        "Se agrego el valor " + dato + " despues de " + referencia
      );
      return true;
    } else {
      return false;
    }
  }

  public Object eliminarAlFrente() throws ExceptionListaVacia {
    if (estaVacia()) {
      throw new ExceptionListaVacia(nombre);
    }
    Object elementoEliminado = primerNodo.dato;
    if (primerNodo == ultimoNodo) {
      primerNodo = ultimoNodo = null;
    } else {
      primerNodo = primerNodo.siguienteNodo;
    }

    return elementoEliminado;
  }

  public Object eliminarAlFinal() throws ExceptionListaVacia {
    if (estaVacia()) {
      throw new ExceptionListaVacia(nombre);
    }

    Object elementoEliminado = ultimoNodo.dato;
    if (primerNodo == ultimoNodo) {
      primerNodo = ultimoNodo = null;
    } else {
      Nodo actual = primerNodo;

      while (actual.siguienteNodo != ultimoNodo) {
        actual = actual.siguienteNodo;
      }

      ultimoNodo = actual;
      actual.siguienteNodo = null;
    }

    return elementoEliminado;
  }

  public boolean elimiarPorReferencia(Object referencia) {
    if (estaVacia()) {
      System.out.println("\nNo hay datos");
      return false;
    } else {
      if (buscarPorValor(referencia) != null) {
        if (referencia.equals(primerNodo.dato)) {
          primerNodo = primerNodo.siguienteNodo;
        } else {
          Nodo actual, siguiente;
          actual = primerNodo;
          siguiente = primerNodo.siguienteNodo;
          while ((siguiente.dato != referencia) && siguiente != null) {
            siguiente = siguiente.siguienteNodo;
            actual = actual.siguienteNodo;
          }
          if (siguiente != null) {
            actual.siguienteNodo = siguiente.siguienteNodo;
          } else {
            ultimoNodo = actual;
            siguiente = null;
          }
        }
        return true;
      } else {
        System.out.println("\nEl valor '" + referencia + "' no se encontró");
        return false;
      }
    }
  }

  public Object buscarPorPosicion(int posicion) {
    Nodo indice;
    if (posicion < 1 || posicion > contarElementos()) {
      return null;
    } else {
      indice = primerNodo;
      for (int i = 0; (i < posicion - 1) && (indice != null); i++) {
        indice = indice.siguienteNodo;
      }
      return indice.dato;
    }
  }

  public int contarElementos() {
    int cont = 0;
    Nodo indice;
    for (indice = primerNodo; indice != null; indice = indice.siguienteNodo) {
      cont++;
    }
    return cont;
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

  public void actualizarPorValor(Object valorBuscado, Object nuevoValor) {
    Nodo actual = primerNodo;
    while (actual != null) {
      if (actual.dato.equals(valorBuscado)) {
        actual.dato = nuevoValor;
        return;
      }
      actual = actual.siguienteNodo;
    }
    System.out.println(
      "El valor " + valorBuscado + " no se encontró en la lista."
    );
  }

  public void actualizarPorPosicion(int posicion, Object nuevoValor) {
    if (posicion < 1 || posicion > contarElementos()) {
      System.out.println("La posición especificada está fuera de rango.");
      return;
    }

    Nodo actual = primerNodo;
    for (int i = 1; i < posicion; i++) {
      actual = actual.siguienteNodo;
    }
    actual.dato = nuevoValor;
  }

  public void imprimirVertical() {
    if (estaVacia()) {
      System.out.println("\nNo hay elementos en la lista");
    } else {
      System.out.println("\nElementos de la lista en forma vertical:");
      Nodo actual = primerNodo;
      while (actual != null) {
        System.out.println(actual.dato);
        actual = actual.siguienteNodo;
      }
    }
  }

  public boolean estaVacia() {
    return primerNodo == null;
  }

  public boolean imprimir() {
    if (estaVacia()) {
      System.out.println(nombre + " esta vacia");
      return true;
    } else {
      System.out.println("El contenido de la lista es: ");
      Nodo actual = primerNodo;
      while (actual != null) {
        System.out.print(actual.dato + " ");
        actual = actual.siguienteNodo;
      }
      System.out.println("\n");
      return false;
    }
  }
}
