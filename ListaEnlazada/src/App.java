import ListaEnteros.*;
import java.util.*;

public class App {

  public static void main(String[] args) throws Exception {
    Lista lista = new Lista();
    Object dato, nuevoDato;
    Scanner s = new Scanner(System.in);
    System.out.println("Insertar elementos al frente de la lista\n");
    lista.insertarAlFrente(1);
    lista.imprimir();
    lista.insertarAlFinal(-1);
    lista.imprimir();
    lista.insertarAlFrente(10);
    lista.imprimir();
    lista.insertarAlFinal(-10);
    lista.imprimir();

    // System.out.println("Valor a buscar: ");
    // dato = s.nextInt();
    // if (lista.buscarPorValor(dato) != null) {
    //   System.out.println("El valor " + dato + " esta en la lista");
    // } else {
    //   System.out.println("El valor " + dato + " no esta en la lista");
    // }

    //Agregar con referencia
    System.out.println("Insertar el nuevo dato\n");
    nuevoDato = s.nextInt();
    System.out.println("Insertar el dato de referencia\n");
    dato = s.nextInt();

    lista.insertarPorReferencia(nuevoDato, dato);
    lista.imprimir();

    s.close();
  }
}
