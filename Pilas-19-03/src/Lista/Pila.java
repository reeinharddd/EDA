package Lista;

public class Pila {

    int cima = 0;
    int max = 4;
    Productos[] productos = new Productos[max];

    // inicilizar el arreglo de objetos
    public Pila() {
        for (int i = 0; i < max; i++) {
            productos[i] = new Productos();
        }
    }

    // conocer la cantidad maxima de elementos
    public int maxElementos() {
        return max;
    }

    // conocer la cantidad de elementos agregados

    public int numElementos() {
        return cima;
    }

    // saber si la pila esta llena

    public boolean pilaLlena() {
        if (cima == max) {
            return true;
        } else {
            return false;
        }
    }

    // saber si la pila esta vacia
    public boolean pilaVacia() {
        return cima == 0;
    }

    // Agregar un paquetes a la pila

    public void agregar(String codigo, String descripcion) {
        if (pilaLlena()) {
            System.out.println("Estiba maxima, no se pueden agregar mas paquetes");
        } else {
            productos[cima].setCodigo(codigo);
            productos[cima].setDescripcion(descripcion);
            cima++;
        }
    }

    // Imprimir la lista de paquetes

    public void imprimir() {
        if (pilaVacia()) {
            System.out.println("No hay paquetes en la pila");
        } else {
            System.out.println("Codigo \t Descripcion");
            for (int i = 0; i < cima; i++) {
                System.out.print(productos[i].getCodigo());
                System.out.println("\t" + productos[i].getDescripcion());
            }
        }
    }

    // Retirar paquete

    public void retirar() {
        if (pilaVacia()) {
            System.out.println("No hay paquetes en la pila");
        } else {
            cima--;
            System.out.println("Producto retirado");
            System.out.println("Codigo: " + productos[cima].getCodigo());
            System.out.println("Descripcion: " + productos[cima].getDescripcion());
            productos[cima].setCodigo(null);
            productos[cima].setDescripcion(null);
        }
    }

    // Obtener el valor de la cima
    public void valorCima() {
        if (pilaVacia()) {
            System.out.println("No hay paquetes en la pila");
        } else {
            System.out.println("Codigo: " + productos[cima - 1].getCodigo());
            System.out.println("Descripcion: " + productos[cima - 1].getDescripcion());
        }
    }

    // Total de paquetes actuales
    public void totalPaquetes() {
        System.out.println("Total de paquetes actuales: " + cima);
    }
}
