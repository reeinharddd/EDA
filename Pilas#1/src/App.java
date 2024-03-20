import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int opcion = 0;
    pila pila = new pila(5);

    System.out.println("Menus de Opciones: ");
    System.out.println("1. Agregar");
    System.out.println("2. Eliminar");
    System.out.println("3. Consultar ultimo elemento");
    System.out.println("4. Consultar total de elementos");
    System.out.println("5. Saber si la pila esta vacia o no");
    System.out.println("6. Saber si la pila esta llena o no");
    System.out.println("7. Salir");
    System.out.println("Opcion");
    opcion = s.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("Ingrese el dato a agregar");
        int dato = s.nextInt();
        pila.agregar(dato);
        break;
      case 2:
        pila.eliminar();
        break;
      case 3:
        pila.consultarUltimo();
        break;
      case 4:
        pila.consultarTotal();
        break;
      case 5:
        pila.pilaVacia();
        break;
      case 6:
        pila.pilaLlena();
        break;
      default:
        System.out.println("Opcion no valida");
        break;
    }

    s.close();
  }
}

class pila {

  private int tope;
  private int max;
  private int pila[];

  public pila(int max) {
    this.max = max;
    tope = 0;
    pila = new int[max];
  }

  public void agregar(int dato) {
    if (tope < max) {
      pila[tope] = dato;
      tope++;
    } else {
      System.out.println("La pila esta llena");
    }
  }

  public void eliminar() {
    if (tope > 0) {
      tope--;
    } else {
      System.out.println("La pila esta vacia");
    }
  }

  public void consultarUltimo() {
    if (tope > 0) {
      System.out.println("El ultimo elemento es: " + pila[tope - 1]);
    } else {
      System.out.println("La pila esta vacia");
    }
  }

  public void consultarTotal() {
    System.out.println("El total de elementos es: " + tope);
  }

  public void pilaVacia() {
    if (tope == 0) {
      System.out.println("La pila esta vacia");
    } else {
      System.out.println("La pila no esta vacia");
    }
  }

  public void pilaLlena() {
    if (tope == max) {
      System.out.println("La pila esta llena");
    } else {
      System.out.println("La pila no esta llena");
    }
  }
}
