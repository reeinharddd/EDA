import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {

  Scanner sc = new Scanner(System.in);
  List<String> famosos = new ArrayList<String>();
  List<String> peliculas = new ArrayList<String>();

  int num = 0;

  public static void main(String[] args) throws Exception {
    App app = new App();
    app.menu();
  } //Main

  public void menu() {
    clearScreen();
    System.out.println("1.- Registrar");
    System.out.println("2.- COnsultar");
    System.out.println("3.- Consultar todos los registros  ");
    System.out.println("4.- Eliminar un registro");
    System.out.println("5.- Eliminar todos los registros");
    System.out.println("6.- Actualizar un registro");
    System.out.println("7.- Desplegar una sublista");
    System.out.println("8.- Salir");

    opciones();
  } //Menu

  public void opciones() {
    System.out.println("elige una opcion");
    int opcion = sc.nextInt();
    switch (opcion) {
      case 1:
        registrar();
        break;
      case 2:
        consultar();
        break;
      case 3:
        consultarTodos();
        break;
      case 4:
        eliminar();
        break;
      case 5:
        eliminarTodos();
        break;
      case 6:
        actualizar();
        break;
      case 7:
        desplegar();
        break;
      case 8:
        System.out.println("Adios");
        break;
      default:
        System.out.println("Opcion no valida");
        menu();
        break;
    }
  } //Opciones

  public void registrar() {
    clearScreen();
    System.out.println("Elegiste Registrar: \n\n");
    System.out.println("Nombre del famoso: ");

    sc.nextLine();
    String nombreFamoso = sc.nextLine();
    while (nombreFamoso.trim().isEmpty()) {
      System.out.println("El nombre no puede estar vacío. Inténtalo de nuevo.");
      nombreFamoso = sc.nextLine();
    }
    famosos.add(nombreFamoso);

    System.out.println("Pelicula o serie: ");
    String peliculaSerie = sc.nextLine();
    while (peliculaSerie.trim().isEmpty()) {
      System.out.println(
        "La pelicula o serie no puede estar vacía. Inténtalo de nuevo."
      );
      peliculaSerie = sc.nextLine();
    }
    peliculas.add(peliculaSerie);

    menu();
  } //Registrar

  public void consultar() {
    System.out.println("Elegiste Consultar: \n\n");
    System.out.println("Famosos: ");
    for (int i = 0; i < famosos.size(); i++) {
      System.out.println((i + 1) + ".- " + famosos.get(i));
    }

    int num = -1;
    while (num < 0 || num >= famosos.size()) {
      System.out.println("Busca el registro del famoso");
      try {
        num = sc.nextInt() - 1;
        if (num < 0 || num >= famosos.size()) {
          System.out.println("Numero no valido, intenta de nuevo: ");
        }
      } catch (InputMismatchException e) {
        System.out.println("Por favor, ingrese un numero valido.");
        sc.nextLine(); // discard the invalid input
      }
    }
    System.out.println(famosos.get(num));

    System.out.println("continuar al menu? (s/n)");
    String continuar = sc.next();
    if (continuar.equalsIgnoreCase("s")) {
      menu();
    } else {
      System.out.println("Adios");
    }
  } //Consultar

  public void consultarTodos() {
    System.out.println("Consultar todos los registros: \n\n");
    System.out.println("Famosos " + famosos);
    System.out.println("Peliculas: " + peliculas);
    System.out.println("continuar al menu? (s/n)");
    String continuar = sc.next();
    if (continuar.equals("s")) {
      menu();
    } else {
      System.out.println("Adios");
    }
  } //ConsultarTodos

  public void eliminar() {
    System.out.println("Elegiste Eliminar: \n\n");
    System.out.println("Eliminar un registro");
    num = sc.nextInt();
    do {
      if (num < 0 || num > famosos.size()) {
        System.out.println("Numero no valido, intenta de nuevo: ");
      }
    } while (num < 0 || num > famosos.size());
    famosos.remove(num);
    peliculas.remove(num);
    System.out.println("continuar al menu? (s/n)");
    String continuar = sc.next();
    if (continuar.equals("s")) {
      menu();
    } else {
      System.out.println("Adios");
    }
  } //Eliminar

  public void eliminarTodos() {
    System.out.println("Elegiste Eliminar todos los registros: \n\n");
    famosos.clear();
    peliculas.clear();
    System.out.println("continuar al menu? (s/n)");
    String continuar = sc.next();
    if (continuar.equals("s")) {
      menu();
    } else {
      System.out.println("Adios");
    }
  } //EliminarTodos

  public void actualizar() {
    System.out.println("Elegiste Actualizar: \n\n");
    for (int i = 0; i < famosos.size(); i++) {
      System.out.println((i + 1) + ".- " + famosos.get(i));
    }
    sc.nextLine();

    System.out.println("Actualizar un registro");
    num = sc.nextInt();
    num = num - 1;
    do {
      if (num < 0 || num > famosos.size()) {
        System.out.println("Numero no valido, intenta de nuevo: ");
      }
    } while (num < 0 || num > famosos.size());
    System.out.println("Nombre del famoso: ");
    sc.nextLine();
    String nombreFamoso = sc.nextLine();
    famosos.set(num, nombreFamoso);
    System.out.println("Pelicula o serie: ");
    String peliculaSerie = sc.nextLine();
    peliculas.set(num, peliculaSerie);
    System.out.println("continuar al menu? (s/n)");
    String continuar = sc.next();
    if (continuar.equals("s")) {
      menu();
    } else {
      System.out.println("Adios");
    }
  } //Actualizar

  public void desplegar() {
    System.out.println("Elegiste Desplegar una lista: \n\n");
    System.out.println("Desplegar una lista");
    System.out.println("1.- Famosos");
    System.out.println("2.- Peliculas");
    System.out.println("3.- Regresar al menu");
    int opcion = sc.nextInt();
    switch (opcion) {
      case 1:
        for (int i = 0; i < famosos.size(); i++) {
          System.out.println((i + 1) + ".- " + famosos.get(i));
        }
        break;
      case 2:
        for (int i = 0; i < peliculas.size(); i++) {
          System.out.println((i + 1) + ".- " + peliculas.get(i));
        }
        break;
      case 3:
        menu();
        break;
      default:
        System.out.println("Opcion no valida");
        desplegar();
        break;
    }
  } //Desplegar

  // metodo para limpiar consola
  public void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
} //Class
