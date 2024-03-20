import Lista.*;
import java.util.*;

public class App {

    static Scanner s = new Scanner(System.in);
    static Pila pilaProd1 = new Pila();
    static Pila pilaProd2 = new Pila();

    public static int menuProducto() {
        int opcion;
        do {
            limpiar();
            System.out.println("Gestion de almecen");
            System.out.println("Secciones el producto que gestionara");
            System.out.println("1. Producto 1");
            System.out.println("2. Producto 2");
            System.out.println("3. Salir");
            System.out.println("Elija una opcion: ");
            opcion = s.nextInt();
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }

    public static int menuGestion() {
        int opcion;
        do {
            limpiar();
            System.out.println("Gestion de Almacen");
            System.out.println("1. Agregar paquete");
            System.out.println("2. Eliminar paquete");
            System.out.println("3. Consultar el ultimo paquete");
            System.out.println("4. Consultar todos los paquetes");
            System.out.println("5. Total de paquetes actuales");
            System.out.println("6. Maximo de paquetes");
            System.out.println("7. Regresar");
            System.out.print("Elija una opcion: ");
            opcion = s.nextInt();

        } while (opcion < 1 || opcion > 7);
        return opcion;
    }

    public static void imprimir(int numProd) {
        limpiar();
        System.out.println("Lista de paquetes del producto " + numProd);
        if (numProd == 1) {
            pilaProd1.imprimir();
        } else {
            pilaProd2.imprimir();
        }
        enter();
    }

    public static void agregarPaquete(int numProd) {
        String codigo, descripcion;
        limpiar();
        System.out.println("Agregar paquetes del producto: " + numProd);
        System.out.println("Agrega los datos");
        System.out.println("Codigo: ");
        codigo = s.next();
        System.out.println("Descripcion: ");
        descripcion = s.next();
        if (numProd == 1) {
            pilaProd1.agregar(codigo, descripcion);
        } else {
            pilaProd2.agregar(codigo, descripcion);
        }
        System.out.println("Se registro el paquete");
        enter();

    }

    public static void retirarPaquete(int numProd) {
        System.out.println("retirar el ultimo paquete");
        if (numProd == 1) {
            pilaProd1.retirar();
        } else {
            pilaProd2.retirar();
        }
        System.out.println("Se retiro el paquete");
        enter();
    }

    public static void ultimoPaquete(int numProd) {
        System.out.println("Ultimo paquete");
        if (numProd == 1) {
            pilaProd1.valorCima();
        } else {
            pilaProd2.valorCima();
        }
        enter();
    }

    public static void paquetesActuales(int numProd) {
        System.out.println("Total de paquetes actuales");
        if (numProd == 1) {
            pilaProd1.totalPaquetes();
        } else {
            pilaProd2.totalPaquetes();
        }
        enter();
    }

    public static void maximoPaquetes(int numProd) {
        System.out.println("Maximo de paquetes");
        if (numProd == 1) {
            pilaProd1.maxElementos();
        } else {
            pilaProd2.maxElementos();
        }
        enter();
    }

    public static void main(String[] args) throws Exception {
        int opcionMenuProd;
        int opcionMenuGestion;
        do {
            opcionMenuProd = menuProducto();
            if (opcionMenuProd != 3) {
                do {
                    opcionMenuGestion = menuGestion();
                    switch (opcionMenuGestion) {
                        case 1:
                            agregarPaquete(opcionMenuProd);
                            break;
                        case 2:
                            retirarPaquete(opcionMenuProd);
                            break;
                        case 3:
                            ultimoPaquete(opcionMenuProd);
                            break;
                        case 4:
                            imprimir(opcionMenuProd);
                            break;
                        case 5:
                            paquetesActuales(opcionMenuProd);
                            break;
                        case 6:
                            maximoPaquetes(opcionMenuProd);
                            break;

                    }
                } while (opcionMenuGestion != 7);
            }

        } while (opcionMenuProd != 3);
        s.close();
    }

    public static void limpiar() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void enter() {
        Scanner continuar = new Scanner(System.in);
        continuar.useDelimiter("\n");
        System.out.print("Presione enter para continuar");
        continuar.next();

    }
}