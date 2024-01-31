import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int fila = 3, col = 4;
        int[][] nums = new int[fila][col];
        int[][] nume = { { 2, 4, 8 }, { 5, 9, 0 } };

        System.out.println("Trabajando con tablas");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(i + " , " + j + ": ");
                nums[i][j] = s.nextInt();
            }
        }
        System.out.println("Valores de la tabla numeros");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
