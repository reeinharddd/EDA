import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    String[] materias = {
      "Alumno",
      "Informatica",
      "Programacion",
      "Redes",
      "Promedio",
    };
    int fila = 5, col = 3;
    int[][] cal = new int[fila][col];
    int[] promedio = new int[5];
    int[] promedioMateria = new int[3];

    for (int i = 0; i < col; i++) {
      System.out.println(
        "Ingrese las calificaciones de la materia " + materias[i + 1]
      );
      for (int j = 0; j < fila; j++) {
        System.out.println("Ingrese la calificacion del alumno " + (j + 1));
        cal[j][i] = s.nextInt();
      }
    }

    for (int i = 0; i < promedio.length; i++) {
      for (int j = 0; j < promedioMateria.length; j++) {
        promedio[i] += cal[i][j];
      }
    }

    for (int i = 0; i < promedioMateria.length; i++) {
      for (int j = 0; j < promedio.length; j++) {
        promedioMateria[i] += cal[j][i];
      }
    }

    for (int i = 0; i < promedio.length; i++) {
      promedio[i] = promedio[i] / 3;
    }

    for (int i = 0; i < promedioMateria.length; i++) {
      promedioMateria[i] = promedioMateria[i] / 5;
    }

    System.out.println("Alumno\tInformatica\tProgramacion\tRedes\tPromedio");
    for (int i = 0; i < fila; i++) {
      System.out.print((i + 1) + "\t");
      for (int j = 0; j < col; j++) {
        System.out.print(cal[i][j] + "\t\t");
      }
      System.out.println(promedio[i]);
    }

    System.out.println(
      "Promedio\t" +
      promedioMateria[0] +
      "\t\t" +
      promedioMateria[1] +
      "\t\t" +
      promedioMateria[2]
    );

    s.close();
  }
}
