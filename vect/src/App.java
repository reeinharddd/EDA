import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
Scanner s = new Scanner(System.in);
int [] num1 = new int [5];
int [] num2 = new int [5];
int [] suma = new int [5];

clear();

System.out.println("Suma de numero enteros");
System.out.println("Ingresa los valores del numero 1");
for(int i = 0; i < num1.length; i++){
    System.out.print(i + 1 + ": ");
    num1[i] = s.nextInt();
        System.out.println("\n");

}
System.out.println("Sumando 2");
for (int i = 0; i < num2.length; i++){
    System.out.print(i + 1 + ": ");
    num2[i] = s.nextInt();
    System.out.println("\n");
}

for (int i = 0; i < num2.length; i ++){
    suma[i] = num1[i] + num2[i];
}
System.out.println("Sumas");
for (int i = 0; i < suma.length; i ++){
    System.out.println(num1[i] + " + " + num2[i] + " = " + suma[i]);
}
s.close();

}
public static void clear ()
  {
    System.out.println ("\033[H\033[2J");
    System.out.flush ();
  }
}
