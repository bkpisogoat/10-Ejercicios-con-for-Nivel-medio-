import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        boolean primo = true;

        if (n <= 1) {
            primo = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}