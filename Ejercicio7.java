import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos números ingresará?: ");
        int n = sc.nextInt();

        double suma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Número " + i + ": ");
            suma += sc.nextDouble();
        }

        double promedio = suma / n;

        System.out.println("Promedio = " + promedio);
    }
}