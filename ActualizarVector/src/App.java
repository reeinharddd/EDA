/*Beltran Ramirez Erik Alfonso
29 de Enero del 2024
4B
Practica 3: Vectores */

import java.util.Arrays;
import java.util.Scanner;

public class App {
public static void limpiar(){
    System.out.print("\033[H\033[2J");
System.out.flush();
}
  public static void main(String[] args) throws Exception {
    int[] arreglo = new int[] { 5, 20, 45, 48, 51, 87, 89, 103, 345, 500 };
    int numero = 0;
    boolean error = false;
    boolean volver = false;
    int repetir = 0;
    Scanner s = new Scanner(System.in);
    do {
      do {
        limpiar();
        System.out.println("Ingrese un numero entre 1 y 500");
        String res = s.nextLine();
        if (res == null || res.isEmpty()) {
          System.out.println("No ingreso ningun numero");
          error = true;
        } else if (res.matches("[a-zA-Z]+")) {
          System.out.println("No ingreso un numero");
          error = true;
        } else if (res.matches("[0-9]+")) {
          numero = Integer.parseInt(res);
          if (numero < 1 || numero > 500) {
            System.out.println("El numero ingresado no esta entre 1 y 500");
            error = true;
          } else {
            error = false;
          }
        }
      } while (error);
      for (int i = 0; i < arreglo.length; i++) {
        if (numero > arreglo[i] || numero == arreglo[i]) {
          for (int j = 0; j < arreglo.length; j++) {
            if (numero < arreglo[j]) {
              int aux = arreglo[j];
              arreglo[j] = numero;
              numero = aux;
            } //if inter
          } //for j
        } else if (numero < arreglo[i]) {
          int aux = arreglo[i];
          arreglo[i] = numero;
          numero = aux;
        }
      } //for i
      limpiar();
      System.out.println("El nuevo arreglo es: " + Arrays.toString(arreglo));
      do {
      System.out.println("Desea volve a ingresar otro numero? ");
      System.out.print("1- Si");
      System.out.print("\t2- No\n");
  String res = s.nextLine();
    if (res == null || res.isEmpty()) {
          System.out.println("No ingreso ningun numero");
          error = true;
        } else if (res.matches("[a-zA-Z]+")) {
          System.out.println("No ingreso un numero");
          error = true;
        } else if (res.matches("[0-9]+")) {
          repetir = Integer.parseInt(res);
          if (repetir == 1){
            volver = true;
            error = false;
          } else if (repetir == 2){
            volver = false;
            error = false;
          } 
        }
      } while (error);
    } while (volver);
limpiar();
    System.out.println("El arreglo final ess: " + Arrays.toString(arreglo));

    s.close();
  } //Main

} //Class
