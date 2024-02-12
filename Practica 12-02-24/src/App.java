import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] departamentos = {"Dept 1", "Dept 2", "Dept 3", "Dept 4", "Dept 5", "Dept 6"};
        String[] diasSemana = {"Lunes", "Martes", "Miérc", "Jueves", "Viernes"};
        int[][] ausencias = new int[diasSemana.length][departamentos.length]; 
        int[] ausenciasDepartamento = new int[departamentos.length];
        int[] ausenciasDia = new int[diasSemana.length];

        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println("Ingresar ausencias para el día " + diasSemana[i] + ":");
            for (int j = 0; j < departamentos.length; j++) {
                System.out.print(departamentos[j] + ": ");
                ausencias[i][j] = s.nextInt(); 
                ausenciasDia[i] += ausencias[i][j];
                ausenciasDepartamento[j] += ausencias[i][j];
            }
        }

        System.out.print("Día\t");
        for (String departamento : departamentos) {
            System.out.print(departamento + "\t");
        }
        System.out.println("Total por día");
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.print(diasSemana[i] + "\t");
            for (int j = 0; j < departamentos.length; j++) {
                System.out.print(ausencias[i][j] + "\t");
            }
            System.out.println(ausenciasDia[i]);
        }

        System.out.print("Total\t");
        for (int total : ausenciasDepartamento) {
            System.out.print(total + "\t");
        }
        System.out.println();

        int diaMasAusencias = 0;
        for (int i = 1; i < ausenciasDia.length; i++) {
            if (ausenciasDia[i] > ausenciasDia[diaMasAusencias]) {
                diaMasAusencias = i;
            }
        }
        System.out.println("\nEl día con más ausencias fue: " + diasSemana[diaMasAusencias]);

        int deptoMasAusencias = 0;
        for (int i = 1; i < ausenciasDepartamento.length; i++) {
            if (ausenciasDepartamento[i] > ausenciasDepartamento[deptoMasAusencias]) {
                deptoMasAusencias = i;
            }
        }
        System.out.println("El departamento con más ausencias fue: " + departamentos[deptoMasAusencias]);

        s.close();
    }
}