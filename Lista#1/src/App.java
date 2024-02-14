import java.util.*;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int tam;
    int seleccionInt;
    // crear lista
    List<String> nombres = new ArrayList<String>();

    // agregar valores

    nombres.add("Aguascalientes");
    nombres.add("Baja California");
    nombres.add("Sonora");
    nombres.add("Tlaxcala");
    nombres.add("Yucatan");
    nombres.add("Jalisco");
    limpiar();
    // formas de desplegar los valores de la lista
    // forma 1, horizontal
    System.out.println("Forma 1");
    System.out.println(nombres);
    limpiar();

    // forma 2, vertical
    System.out.println("Forma 2");
    for (int i = 0; i < nombres.size(); i++) {
      System.out.println(nombres.get(i));
    }
    limpiar();

    // forma 3, for each
    System.out.println("Forma 3");
    for (String nombre : nombres) {
      System.out.println(nombre);
    }
    limpiar();

    // forma 4, iterador
    System.out.println("Forma 4");
    Iterator<String> it = nombres.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    limpiar();
    // obtener el tamano de la lista
    tam = nombres.size();
    System.out.println("El tamano de la lista es: " + tam);

    // obtener un elemento de la lista, pidiendole un numero al usuario menor al
    // size de la lista, validando la entrada, si la entrada es mayor al size de la
    // lista, o no es un numero, o es un espacio, dira error, y volvera a mandara el
    // mensaje de seleccion
    do {
      System.out.println("Selecciona un numero del 1 al " + tam);
      String seleccion = s.nextLine();
      seleccionInt = Integer.parseInt(seleccion);
      if (seleccionInt > tam || seleccionInt < 1) {
        System.out.println("Error, selecciona un numero del 1 al " + tam);
        seleccion = s.nextLine();
      }
    } while (seleccionInt > tam || seleccionInt < 1);
    System.out.println(
      "El elemento seleccionado es: " + nombres.get(seleccionInt - 1)
    );

    limpiar();

    // formas de eliminar un solo elemento
    // forma 1, por medio del indice
    System.out.println(
      "Elimanr un nombre por medio del indice dado por el user"
    );
    do {
      System.out.println(
        "Selecciona un numero del 1 al " + tam + " para eliminar un nombre"
      );
      String seleccion = s.nextLine();
      seleccionInt = Integer.parseInt(seleccion);
      if (seleccionInt > tam || seleccionInt < 1) {
        System.out.println("Error, selecciona un numero del 1 al " + tam);
        seleccion = s.nextLine();
      } else {
        // validar si el usuario de verdad desea eliminar el valor
        System.out.println(
          "Estas seguro de eliminar el valor " +
          nombres.get(seleccionInt - 1) +
          " ? (s/n)"
        );
        String confirmacion = s.nextLine();
        if (confirmacion.equals("s")) {
          nombres.remove(seleccionInt - 1);
          System.out.println("El valor ha sido eliminado");
          tam = nombres.size();
          System.out.println("El tamano de la lista es: " + tam);
          System.out.println(nombres);
        } else {
          System.out.println("El valor no ha sido eliminado");
        }
      }
    } while (seleccionInt > tam || seleccionInt < 1);
    s.close();
  } // main

  // metodo para limpiar con un segundo de timestop
  public static void limpiar() {
    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
} // class
