import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese N: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de múltiplos de 3: " + contador);
    }
}