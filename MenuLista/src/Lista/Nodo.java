package Lista;

public class Nodo {

  Object dato;
  Nodo siguienteNodo;

  public Nodo(Object dato) {
    this.dato = dato;
    this.siguienteNodo = null;
  }

  public Nodo(Object dato, Nodo nodo) {
    this.dato = dato;
    this.siguienteNodo = nodo;
  }

  public Object getDato() {
    return dato;
  }

  public Nodo getSiguienteNodo() {
    return siguienteNodo;
  }

  public void setSiguienteNodo(Nodo nodo) {
    this.siguienteNodo = nodo;
  }
}
