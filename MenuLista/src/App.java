/*Beltran Ramirez Erik Alfonso
13/03/2024
4B
 */

import Lista.*;
import java.util.*;

public class App {

  public static void limpiar() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void main(String[] args) throws InterruptedException {
    int select = 0;

    Lista lista = new Lista();
    Object dato, nuevoDato;
    int opcion = 0;
    Scanner s = new Scanner(System.in);
    boolean reset = false;
    do {
      do {
        do {
          try {
            Thread.sleep(1000);
            limpiar();
            System.out.println("MENU DE LISTA ENLAZADA SIMPLE");
            System.out.println("1. agregar un valor al principio");
            System.out.println("2. agregar un valor al final");
            System.out.println("3. Agregar un valor por referencia");
            System.out.println("4. Eliminar el primer valor");
            System.out.println("5. eliminar el ultimo valor");
            System.out.println("6. eliminar un valor por referencia");
            System.out.println("7. buscar un valor por posicion");
            System.out.println("8. saber si un valor existe");
            System.out.println("9. actualizar buscando por valor");
            System.out.println("10. actualizar buscando por posiciion");
            System.out.println("11. desplegar de forma horizontal");
            System.out.println("12. desplegar lista de forma vertical");
            System.out.println("13. conocer la cantidad de elementos");
            System.out.println("14. salir");
            System.out.print("Eliga una opción: ");
            opcion = s.nextInt();
            if (opcion < 1 || opcion > 14) {
              Thread.sleep(1000);
              limpiar();
              System.out.println(
                "Opción inválida. Por favor, ingrese una opción válida."
              );
            }
          } catch (Exception e) {
            Thread.sleep(1000);
            limpiar();
            System.out.println("Error. Por favor, ingrese una opción válida.");
            s.nextLine();
            opcion = 0;
          }
        } while (opcion < 1 || opcion > 14);
        limpiar();

        /*------------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

        switch (opcion) {
          case 1:
            do {
              limpiar();
              System.out.println(
                "Ingrese el valor a agregar al principio de la lista: "
              );
              dato = s.next();
              boolean valor = lista.insertarAlFrente(dato);
              String resultado = valor
                ? "Valor " + dato + " agregado con éxito"
                : "Error al agregar el valor";
              System.out.println(resultado);
              lista.imprimir();
              Thread.sleep(2000);
              do {
                try {
                  limpiar();
                  System.out.println(
                    "desea agrega otro valor al inicio de la lista?"
                  );
                  System.out.println(
                    "1. Si, quiero agregar otro valor al inicio de la lista"
                  );
                  System.out.println("2. No, volver al menu principal");
                  select = s.nextInt();
                  if (select < 1 || select > 2) {
                    Thread.sleep(1000);
                    limpiar();
                    System.out.println(
                      "Opción inválida. Por favor, ingrese una opción válida."
                    );
                    select = 0;
                    Thread.sleep(1000);
                  }
                } catch (InputMismatchException e) {
                  limpiar();
                  System.out.println(
                    "Error. Por favor, ingrese una opción válida."
                  );
                  s.nextLine();
                  select = 0;
                  Thread.sleep(1000);
                }
              } while (select == 0);
            } while (select == 1);
            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 2:
            do {
              limpiar();
              System.out.println(
                "Ingrese el valor a agregar al final de la lista: "
              );
              dato = s.next();
              boolean valor = lista.insertarAlFinal(dato);
              String resultado = valor
                ? "Valor " + dato + " agregado con éxito"
                : "Error al agregar el valor";
              System.out.println(resultado);
              lista.imprimir();
              Thread.sleep(2000);
              do {
                try {
                  limpiar();
                  System.out.println(
                    "desea agrega otro valor al Final de la lista?"
                  );
                  System.out.println(
                    "1. Si, quiero agregar otro valor al Final de la lista"
                  );
                  System.out.println("2. No, volver al menu principal");
                  select = s.nextInt();
                  if (select < 1 || select > 2) {
                    Thread.sleep(1000);
                    limpiar();
                    System.out.println(
                      "Opción inválida. Por favor, ingrese una opción válida."
                    );
                    select = 0;
                    Thread.sleep(1000);
                  }
                } catch (InputMismatchException e) {
                  limpiar();
                  System.out.println(
                    "Error. Por favor, ingrese una opción válida."
                  );
                  s.nextLine();
                  select = 0;
                  Thread.sleep(1000);
                }
              } while (select == 0);
            } while (select == 1);
            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 3:
            limpiar();
            do {
              System.out.println("Ingrese el valor a agregar: ");
              dato = s.next();
              System.out.println("Ingrese el valor de referencia: ");
              nuevoDato = s.next();
              boolean resultado = lista.insertarPorReferencia(dato, nuevoDato);
              if (resultado) {
                do {
                  try {
                    lista.imprimir();

                    System.out.println(
                      "Desea agregar otro valor por referencia?"
                    );
                    System.out.println(
                      "1. Si, quiero agregar otro valor por referencia"
                    );
                    System.out.println("2. No, volver al menu principal");
                    select = s.nextInt();
                    if (select < 1 || select > 2) {
                      Thread.sleep(1000);
                      limpiar();
                      System.out.println(
                        "Opción inválida. Por favor, ingrese una opción válida."
                      );
                      select = 0;
                      Thread.sleep(1000);
                    }
                  } catch (InputMismatchException e) {
                    System.out.println(
                      "Error. Por favor, ingrese una opción válida."
                    );
                    s.nextLine();
                    select = 0;
                    Thread.sleep(1000);
                  }
                } while (select == 0);
              } else {
                do {
                  try {
                    System.out.println(
                      "No se encontro el valor de referencia, desea intentar de nuevo?"
                    );
                    System.out.println("1. Si, quiero intentar de nuevo");
                    System.out.println("2. No, volver al menu principal");
                    select = s.nextInt();
                    if (select < 1 || select > 2) {
                      Thread.sleep(1000);
                      limpiar();
                      System.out.println(
                        "Opción inválida. Por favor, ingrese una opción válida."
                      );
                      select = 0;
                      Thread.sleep(1000);
                    }
                  } catch (InputMismatchException e) {
                    System.out.println(
                      "Error. Por favor, ingrese una opción válida."
                    );
                    s.nextLine();
                    select = 0;
                    Thread.sleep(1000);
                  }
                } while (select == 0);
              }
            } while (select == 1);
            Thread.sleep(2000);

            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 4:
            do {
              try {
                limpiar();
                System.out.println(
                  "El valor eliminado es: " + lista.eliminarAlFrente()
                );
                boolean resultado = lista.imprimir();
                if (resultado) {
                  System.out.println(
                    "Se eleimino el valor al inicio de la lista, ahora la lista se encuntra vacia"
                  );
                  System.out.println("Volviendo al menu principal");
                  Thread.sleep(2000);
                  select = 2;
                } else {
                  lista.imprimir();
                  do {
                    try {
                      System.out.println(
                        "Desea eliminar otro valor al inicio de la lista?"
                      );
                      System.out.println(
                        "1. Si, quiero eliminar otro valor al inicio de la lista"
                      );
                      System.out.println("2. No, volver al menu principal");
                      select = s.nextInt();
                      if (select < 1 || select > 2) {
                        Thread.sleep(1000);
                        limpiar();
                        System.out.println(
                          "Opción inválida. Por favor, ingrese una opción válida."
                        );
                        select = 0;
                        Thread.sleep(1000);
                      }
                    } catch (InputMismatchException e) {
                      System.out.println(
                        "Error. Por favor, ingrese una opción válida."
                      );
                      s.nextLine();
                      select = 0;
                      Thread.sleep(1000);
                    }
                  } while (select == 0);
                }
                Thread.sleep(2000);
              } catch (ExceptionListaVacia e) {
                System.out.println(e.getMessage());
                Thread.sleep(2000);
                System.out.println("Volviendo al menu principal");
                select = 2;
              }
            } while (select == 1);

            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 5:
            do {
              try {
                limpiar();
                System.out.println(
                  "El valor eliminado es: " + lista.eliminarAlFinal()
                );
                boolean resultado = lista.imprimir();
                if (resultado) {
                  System.out.println(
                    "Se eleimino el valor al final de la lista, ahora la lista se encuntra vacia"
                  );
                  System.out.println("Volviendo al menu principal");
                  Thread.sleep(2000);
                  select = 2;
                } else {
                  lista.imprimir();
                  do {
                    try {
                      System.out.println(
                        "Desea eliminar otro valor al final de la lista?"
                      );
                      System.out.println(
                        "1. Si, quiero eliminar otro valor al final de la lista"
                      );
                      System.out.println("2. No, volver al menu principal");
                      select = s.nextInt();
                      if (select < 1 || select > 2) {
                        Thread.sleep(1000);
                        limpiar();
                        System.out.println(
                          "Opción inválida. Por favor, ingrese una opción válida."
                        );
                        select = 0;
                        Thread.sleep(1000);
                      }
                    } catch (InputMismatchException e) {
                      System.out.println(
                        "Error. Por favor, ingrese una opción válida."
                      );
                      s.nextLine();
                      select = 0;
                      Thread.sleep(1000);
                    }
                  } while (select == 0);
                }
                Thread.sleep(2000);
              } catch (ExceptionListaVacia e) {
                System.out.println(e.getMessage());
                Thread.sleep(2000);
                System.out.println("Volviendo al menu principal");
                select = 2;
              }
            } while (select == 1);

            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 6:
            do {
              limpiar();
              System.out.println("Ingrese el valor a eliminar: ");
              dato = s.next();
              boolean resultado = lista.elimiarPorReferencia(dato);
              if (resultado) {
                do {
                  if (!(lista.imprimir())) {
                    try {
                      System.out.println(
                        "Desea eliminar otro valor por referencia?"
                      );
                      System.out.println(
                        "1. Si, quiero eliminar otro valor por referencia"
                      );
                      System.out.println("2. No, volver al menu principal");
                      select = s.nextInt();
                      if (select < 1 || select > 2) {
                        Thread.sleep(1000);
                        limpiar();
                        System.out.println(
                          "Opción inválida. Por favor, ingrese una opción válida."
                        );
                        select = 0;
                        Thread.sleep(1000);
                      }
                    } catch (InputMismatchException e) {
                      System.out.println(
                        "Error. Por favor, ingrese una opción válida."
                      );
                      s.nextLine();
                      select = 0;
                      Thread.sleep(1000);
                    }
                  } else {
                    System.out.println(
                      "Se eleimino el valor de la lista, ahora la lista se encuntra vacia"
                    );
                    System.out.println("Volviendo al menu principal");
                    Thread.sleep(2000);
                    select = 2;
                  }
                } while (select == 0);
              } else {
                System.out.println("No se pudo eliminar por referencia");
                System.out.println("Volviendo al menu principal");
                Thread.sleep(2000);
                select = 2;
              }
            } while (select == 1);
            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 7:
            do {
              limpiar();
              System.out.println("Ingrese la posición a buscar: ");
              int posicion = s.nextInt();
              System.out.println(
                "El valor en la posición " +
                posicion +
                " es: " +
                lista.buscarPorPosicion(posicion)
              );
              do {
                try {
                  System.out.println("Desea buscar otra posición?");
                  System.out.println("1. Si, quiero buscar otra posición");
                  System.out.println("2. No, volver al menu principal");
                  select = s.nextInt();
                  if (select < 1 || select > 2) {
                    Thread.sleep(1000);
                    limpiar();
                    System.out.println(
                      "Opción inválida. Por favor, ingrese una opción válida."
                    );
                    select = 0;
                    Thread.sleep(1000);
                  }
                } catch (InputMismatchException e) {
                  System.out.println(
                    "Error. Por favor, ingrese una opción válida."
                  );
                  s.nextLine();
                  select = 0;
                  Thread.sleep(1000);
                }
              } while (select == 0);
            } while (select == 1);
            Thread.sleep(2000);
            System.out.println("Volviendo al menu principal");
            select = 2;

            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 8:
            limpiar();
            System.out.println("Ingrese el valor a buscar: ");
            dato = s.next();
            if (lista.buscarPorValor(dato) == null) {
              System.out.println("El valor " + dato + " no se encontró");
            } else {
              System.out.println("El valor " + dato + " se encontró");
            }
            Thread.sleep(2000);
            System.out.println("Volviendo al menu principal");
            select = 2;

            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 9:
            limpiar();
            System.out.println("Ingrese el valor a buscar: ");
            dato = s.next();
            System.out.println("Ingrese el nuevo valor: ");
            nuevoDato = s.next();
            lista.actualizarPorValor(dato, nuevoDato);
            lista.imprimir();
            Thread.sleep(2000);
            System.out.println("Volviendo al menu principal");
            select = 2;
            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 10:
            limpiar();
            System.out.println("Ingrese la posición a buscar: ");
            int pos = s.nextInt();
            System.out.println("Ingrese el nuevo valor: ");
            nuevoDato = s.next();
            lista.actualizarPorPosicion(pos, nuevoDato);
            lista.imprimir();
            Thread.sleep(2000);
            System.out.println("Volviendo al menu principal");
            select = 2;
            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 11:
            limpiar();
            lista.imprimir();
            Thread.sleep(2000);
            System.out.println("Volviendo al menu principal");
            select = 2;
            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 12:
            limpiar();
            lista.imprimirVertical();
            Thread.sleep(2000);
            System.out.println("Volviendo al menu principal");
            select = 2;
            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 13:
            limpiar();
            System.out.println(
              "La cantidad de elementos en la lista es: " +
              lista.contarElementos()
            );
            Thread.sleep(2000);
            System.out.println("Volviendo al menu principal");
            select = 2;

            break;
          /*--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- */

          case 14:
            limpiar();
            System.out.println("Gracias por usar el programa");
            Thread.sleep(2000);
            System.exit(0);
            break;
          default:
            break;
        }
      } while (select == 2);
      // reset = Opciones.select(opcion);
    } while (reset);

    s.close();
  }
}
