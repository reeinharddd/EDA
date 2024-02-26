import ListaEnteros.*;
import java.util.*;

public class App {

  public static void main(String[] args) throws Exception {
    Lista lista = new Lista();
    System.out.println("Insertar elementos al frente de la lista\n");
    lista.insertarAlFrente(1);
    lista.imprimir();
    lista.insertarAlFrente(-1);
    lista.insertarAlFrente(10);
    lista.insertarAlFrente(-10);
  }
}
